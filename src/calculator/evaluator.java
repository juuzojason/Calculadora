package calculator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class evaluator {
    
    static String evaluate(String operation){
        
        if (!validOperation(operation)) {
            return "NO SE PUDO";
        }
        
     
        
        String[] operators = Operators(operation);
        // Separar los términos, incluyendo porcentajes, números y funciones especiales
        String[] numbers = Numbers(operation);
        
        // Convertir porcentajes
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].charAt(numbers[i].length()-1) == '%') {
                double numb = Double.parseDouble(numbers[i].substring(0, numbers[i].length()-1));
                numb = numb / 100.0;
                numbers[i] = numb + "";
            }
        }
        
        List<String> operators2 = new ArrayList<>(Arrays.asList(operators));
        List<String> numbers2 = new ArrayList<>(Arrays.asList(numbers));
        
        // Procesar las funciones especiales primero
        for (int i = 0; i < operators2.size(); i++) {
            if (IsSpecialFunction(operators2.get(i))) {
                String func = operators2.get(i);
                String num = numbers2.get(i);
                double result = 0;
                if (func.equals("√")) {
                    result = Math.sqrt(Double.parseDouble(num));
                }
                numbers2.set(i, result + "");
                operators2.remove(i);
                i--; // Ajustar el índice después de la eliminación
            }
        }
        
        // Procesar las operaciones de potencia
        for (int i = 0; i < operators2.size(); i++) {
            if (operators2.get(i).equals("^")) {
                String base = numbers2.get(i);
                String exponent = numbers2.get(i + 1);
                double result = Math.pow(Double.parseDouble(base), Double.parseDouble(exponent));
                numbers2.set(i, result + "");
                numbers2.remove(i + 1);
                operators2.remove(i);
                i--; // Ajustar el índice después de la eliminación
            }
        }
        
        // Procesar multiplicación y división
        for (int i = 0; i < operators2.size(); i++) {
            if (operators2.get(i).equals("*")) {
                String act = numbers2.get(i);
                String sig = numbers2.get(i + 1);
                double result = Double.parseDouble(act) * Double.parseDouble(sig);
                numbers2.set(i, result + "");
                numbers2.remove(i + 1);
                operators2.remove(i);
                i--; // Ajustar el índice después de la eliminación
            } else if (operators2.get(i).equals("/")) {
                String act = numbers2.get(i);
                String sig = numbers2.get(i + 1);
                double result = Double.parseDouble(act) / Double.parseDouble(sig);
                numbers2.set(i, result + "");
                numbers2.remove(i + 1);
                operators2.remove(i);
                i--; // Ajustar el índice después de la eliminación
            }
        }
        
        // Sumar los resultados restantes
        double total = 0;
        for (String num : numbers2) {
            total += Double.parseDouble(num);
        }
        
        return total + "";
    }
    
    static boolean validOperation(String operation){
        boolean operator = false;
        boolean dot = false;
        boolean number = false;
        
        if (operation.length() == 0) {
            return false;
        }
        
        if (!IsNumber(operation.charAt(0) + "") && !IsSign(operation.charAt(0) + "") && !IsSpecialFunction(operation.substring(0, Math.min(operation.length(), 4)))) {
            return false;
        }
        
        if (!IsNumber(operation.charAt(operation.length() - 1) + "") && !(operation.charAt(operation.length() - 1) + "").equals("%")) {
            return false;
        }
        
        for (int i = 0; i < operation.length(); i++){
            boolean op = IsOperator(operation.charAt(i) + "");
            boolean nu = IsNumber(operation.charAt(i) + "");
            boolean d = operation.charAt(i) == '.';
            boolean prc = operation.charAt(i) == '%';
            
            if ((operator && !number)) {
                System.out.println("1");
            }
            if ((!number && d)) {
                System.out.println("2");
                return false;
            }
            if ((!number && prc)) {
                System.out.println("3");
                return false;
            }
            if ((dot && !nu)) {
                System.out.println("4");
                return false;
            }
            
            operator = op;
            dot = d;
            number = nu;
        }
        
        return true;
    }
    
    static String[] Numbers(String operation){
        operation = operation + "-1+1";
        int cont = 0;
        boolean numb = false;
        boolean prc = false;
        
        for (int i = 0; i < operation.length(); i++) {
            if (IsSign(operation.charAt(i) + "") && !(numb || prc)) {
                continue;
            }
            
            if (IsSign(operation.charAt(i) + "") && (numb || prc)) {
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            
            if (IsOperator(operation.charAt(i) + "") && (numb || prc)) {
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            prc = (operation.charAt(i) + "").equals("%");
            numb = IsNumber(operation.charAt(i) + "");
        }
        
        String[] numbers = new String[cont + 1];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = "";
        }
        
        cont = 0;
        numb = false;
        prc = false;
        boolean sig = true;
        
        for (int i = 0; i < operation.length(); i++) {
            if (IsSign(operation.charAt(i) + "") && !(numb || prc)) {
                if (operation.charAt(i) == '-') {
                    sig = !sig;
                }
                continue;
            }
            
            if (IsSign(operation.charAt(i) + "") && (numb || prc)) {
                numbers[cont] = (sig) ? numbers[cont] : "-" + numbers[cont];
                cont++;
                sig = true;
                if (operation.charAt(i) == '-') {
                    sig = !sig;
                }
                numb = false;
                prc = false;
                continue;
            }
            
            if (IsOperator(operation.charAt(i) + "") && (numb || prc)) {
                cont++;
                sig = true;
                if (operation.charAt(i) == '-') {
                    sig = !sig;
                }
                numb = false;
                prc = false;
                continue;
            }
            
            // Añade un dígito
            if (IsNumber(operation.charAt(i) + "")) {
                numbers[cont] += operation.charAt(i) + "";
            }
            if (operation.charAt(i) == '.') {
                numbers[cont] += operation.charAt(i) + "";
            }
            if (operation.charAt(i) == '%') {
                numbers[cont] += operation.charAt(i) + "";
            }
            prc = (operation.charAt(i) + "").equals("%");
            numb = IsNumber(operation.charAt(i) + "");
        }
        
        return numbers;
    }
    
    static String[] Operators(String operation){
        int cont = 0;
        boolean numb = false;
        boolean prc = false;
        for (int i = 0; i < operation.length(); i++) {
            
            if (IsSign(operation.charAt(i) + "") && !(numb || prc)) {
                continue;
            }
            
            if (IsSign(operation.charAt(i) + "") && (numb || prc)) {
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            
            if (IsOperator(operation.charAt(i) + "")) {
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            prc = (operation.charAt(i) + "").equals("%");
            numb = IsNumber(operation.charAt(i) + "");
        }
        
        String[] operators = new String[cont + 1];
        
        for (int i = 0; i < operators.length; i++) {
            operators[i] = "";
        }
        
        cont = 0;
        numb = false;
        prc = false;
        
        for (int i = 0; i < operation.length(); i++) {
            if (IsSign(operation.charAt(i) + "") && !(numb || prc)) {
                continue;
            }
            
            if (IsSign(operation.charAt(i) + "") && (numb || prc)) {
                operators[cont] += "+";
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            
            if (IsOperator(operation.charAt(i) + "")) {
                operators[cont] += operation.charAt(i) + "";
                cont++;
                numb = false;
                prc = false;
                continue;
            }
            prc = (operation.charAt(i) + "").equals("%");
            numb = IsNumber(operation.charAt(i) + "");
        }
        
        return operators;
    }
    
    static boolean IsOperator(String i){
        switch (i){
            case "*":
            case "/":
            case "^":
                return true;
        }
        return false;
    }
    
    static boolean IsSpecialFunction(String i) {
        switch (i) {
            case "√":
                return true;
        }
        return false;
    }
    
    static boolean IsSign(String i){
        switch (i){
            case "-":
            case "+":
                return true;
        }
        return false;
    }
    
    static boolean IsNumber(String i){
        switch (i){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                return true;
        }
        return false;
    }
}