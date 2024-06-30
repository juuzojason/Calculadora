
package calculator;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

public class Calculator extends javax.swing.JFrame{
    
    
    public Calculator() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Calc.png")));
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        grafics = new javax.swing.JPanel();
        operation = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        Drag = new javax.swing.JLabel();
        toggle = new javax.swing.JToggleButton();
        Exit = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        buttons = new javax.swing.JPanel();
        percent = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        equ = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        btc = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        sum1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grafics.setBackground(new java.awt.Color(234, 255, 255));
        grafics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operation.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        operation.setForeground(new java.awt.Color(47, 56, 64));
        operation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grafics.add(operation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 360, 30));

        result.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 56)); // NOI18N
        result.setForeground(new java.awt.Color(47, 56, 64));
        result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        result.setText("0");
        grafics.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 360, -1));

        Drag.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Drag.setForeground(new java.awt.Color(102, 255, 102));
        Drag.setText("●");
        Drag.setToolTipText("");
        Drag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Drag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragMouseDragged(evt);
            }
        });
        grafics.add(Drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toggleof.png"))); // NOI18N
        toggle.setBorder(null);
        toggle.setContentAreaFilled(false);
        toggle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toggle.setFocusable(false);
        toggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toggleof.png"))); // NOI18N
        toggle.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toggleon.png"))); // NOI18N
        toggle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toggleon.png"))); // NOI18N
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });
        grafics.add(toggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 60, 40));

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 102, 102));
        Exit.setText("●");
        Exit.setToolTipText("");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        grafics.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        Close.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 51));
        Close.setText("●");
        Close.setToolTipText("");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Close.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CloseMouseDragged(evt);
            }
        });
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        grafics.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 40));

        getContentPane().add(grafics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 190));

        buttons.setBackground(new java.awt.Color(0, 204, 204));
        buttons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        percent.setBackground(new java.awt.Color(255, 255, 255));
        percent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        percent.setForeground(new java.awt.Color(47, 56, 64));
        percent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        percent.setText("%");
        percent.setAlignmentY(0.0F);
        percent.setBorder(null);
        percent.setBorderPainted(false);
        percent.setContentAreaFilled(false);
        percent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        percent.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        percent.setDefaultCapable(false);
        percent.setFocusPainted(false);
        percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        percent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        percent.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        buttons.add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, 80));

        ce.setBackground(new java.awt.Color(255, 255, 255));
        ce.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        ce.setForeground(new java.awt.Color(47, 56, 64));
        ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        ce.setText("CE");
        ce.setAlignmentY(0.0F);
        ce.setBorder(null);
        ce.setBorderPainted(false);
        ce.setContentAreaFilled(false);
        ce.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ce.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ce.setDefaultCapable(false);
        ce.setFocusPainted(false);
        ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        ce.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });
        buttons.add(ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 80));

        n9.setBackground(new java.awt.Color(255, 255, 255));
        n9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n9.setForeground(new java.awt.Color(47, 56, 64));
        n9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n9.setText("9");
        n9.setAlignmentY(0.0F);
        n9.setBorder(null);
        n9.setBorderPainted(false);
        n9.setContentAreaFilled(false);
        n9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n9.setDefaultCapable(false);
        n9.setFocusPainted(false);
        n9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        buttons.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, 80));

        mul.setBackground(new java.awt.Color(255, 255, 255));
        mul.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        mul.setForeground(new java.awt.Color(47, 56, 64));
        mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        mul.setText("×");
        mul.setAlignmentY(0.0F);
        mul.setBorder(null);
        mul.setBorderPainted(false);
        mul.setContentAreaFilled(false);
        mul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mul.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        mul.setDefaultCapable(false);
        mul.setFocusPainted(false);
        mul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        mul.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        buttons.add(mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, 80));

        div.setBackground(new java.awt.Color(255, 255, 255));
        div.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        div.setForeground(new java.awt.Color(47, 56, 64));
        div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        div.setText("÷");
        div.setAlignmentY(0.0F);
        div.setBorder(null);
        div.setBorderPainted(false);
        div.setContentAreaFilled(false);
        div.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        div.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        div.setDefaultCapable(false);
        div.setFocusPainted(false);
        div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        div.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        buttons.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, 80));

        equ.setBackground(new java.awt.Color(255, 255, 255));
        equ.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        equ.setForeground(new java.awt.Color(255, 255, 255));
        equ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button2.png"))); // NOI18N
        equ.setText("=");
        equ.setAlignmentY(0.0F);
        equ.setBorder(null);
        equ.setBorderPainted(false);
        equ.setContentAreaFilled(false);
        equ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        equ.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        equ.setDefaultCapable(false);
        equ.setFocusPainted(false);
        equ.setHideActionText(true);
        equ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button2P.png"))); // NOI18N
        equ.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button2.png"))); // NOI18N
        equ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equActionPerformed(evt);
            }
        });
        buttons.add(equ, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 80, 80));

        sum.setBackground(new java.awt.Color(255, 255, 255));
        sum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        sum.setForeground(new java.awt.Color(47, 56, 64));
        sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sum.setText("+");
        sum.setAlignmentY(0.0F);
        sum.setBorder(null);
        sum.setBorderPainted(false);
        sum.setContentAreaFilled(false);
        sum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sum.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sum.setDefaultCapable(false);
        sum.setFocusPainted(false);
        sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sum.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        buttons.add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, 80));

        sub.setBackground(new java.awt.Color(255, 255, 255));
        sub.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        sub.setForeground(new java.awt.Color(47, 56, 64));
        sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sub.setText("–");
        sub.setAlignmentY(0.0F);
        sub.setBorder(null);
        sub.setBorderPainted(false);
        sub.setContentAreaFilled(false);
        sub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sub.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sub.setDefaultCapable(false);
        sub.setFocusPainted(false);
        sub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sub.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sub.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        buttons.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 80, 80));

        btc.setBackground(new java.awt.Color(255, 255, 255));
        btc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        btc.setForeground(new java.awt.Color(47, 56, 64));
        btc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        btc.setText("C");
        btc.setAlignmentY(0.0F);
        btc.setBorder(null);
        btc.setBorderPainted(false);
        btc.setContentAreaFilled(false);
        btc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btc.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btc.setDefaultCapable(false);
        btc.setFocusPainted(false);
        btc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        btc.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        btc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcActionPerformed(evt);
            }
        });
        buttons.add(btc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 80));

        n7.setBackground(new java.awt.Color(255, 255, 255));
        n7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n7.setForeground(new java.awt.Color(47, 56, 64));
        n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n7.setText("7");
        n7.setAlignmentY(0.0F);
        n7.setBorder(null);
        n7.setBorderPainted(false);
        n7.setContentAreaFilled(false);
        n7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n7.setDefaultCapable(false);
        n7.setFocusPainted(false);
        n7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        buttons.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 80));

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n8.setForeground(new java.awt.Color(47, 56, 64));
        n8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n8.setText("8");
        n8.setAlignmentY(0.0F);
        n8.setBorder(null);
        n8.setBorderPainted(false);
        n8.setContentAreaFilled(false);
        n8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n8.setDefaultCapable(false);
        n8.setFocusPainted(false);
        n8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        buttons.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 80));

        n4.setBackground(new java.awt.Color(255, 255, 255));
        n4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n4.setForeground(new java.awt.Color(47, 56, 64));
        n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n4.setText("4");
        n4.setAlignmentY(0.0F);
        n4.setBorder(null);
        n4.setBorderPainted(false);
        n4.setContentAreaFilled(false);
        n4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n4.setDefaultCapable(false);
        n4.setFocusPainted(false);
        n4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        buttons.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 80));

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n5.setForeground(new java.awt.Color(47, 56, 64));
        n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n5.setText("5");
        n5.setAlignmentY(0.0F);
        n5.setBorder(null);
        n5.setBorderPainted(false);
        n5.setContentAreaFilled(false);
        n5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n5.setDefaultCapable(false);
        n5.setFocusPainted(false);
        n5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        buttons.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 80));

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n6.setForeground(new java.awt.Color(47, 56, 64));
        n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n6.setText("6");
        n6.setAlignmentY(0.0F);
        n6.setBorder(null);
        n6.setBorderPainted(false);
        n6.setContentAreaFilled(false);
        n6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n6.setDefaultCapable(false);
        n6.setFocusPainted(false);
        n6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        buttons.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 80));

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n1.setForeground(new java.awt.Color(47, 56, 64));
        n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n1.setText("1");
        n1.setAlignmentY(0.0F);
        n1.setBorder(null);
        n1.setBorderPainted(false);
        n1.setContentAreaFilled(false);
        n1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n1.setDefaultCapable(false);
        n1.setFocusPainted(false);
        n1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        buttons.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 80));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n2.setForeground(new java.awt.Color(47, 56, 64));
        n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n2.setText("2");
        n2.setAlignmentY(0.0F);
        n2.setBorder(null);
        n2.setBorderPainted(false);
        n2.setContentAreaFilled(false);
        n2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n2.setDefaultCapable(false);
        n2.setFocusPainted(false);
        n2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        buttons.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 80));

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n3.setForeground(new java.awt.Color(47, 56, 64));
        n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n3.setText("3");
        n3.setAlignmentY(0.0F);
        n3.setBorder(null);
        n3.setBorderPainted(false);
        n3.setContentAreaFilled(false);
        n3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n3.setDefaultCapable(false);
        n3.setFocusPainted(false);
        n3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        buttons.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 80, 80));

        dot.setBackground(new java.awt.Color(255, 255, 255));
        dot.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        dot.setForeground(new java.awt.Color(47, 56, 64));
        dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        dot.setText(".");
        dot.setAlignmentY(0.0F);
        dot.setBorder(null);
        dot.setBorderPainted(false);
        dot.setContentAreaFilled(false);
        dot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dot.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dot.setDefaultCapable(false);
        dot.setFocusPainted(false);
        dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        dot.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        buttons.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 80, 80));

        n0.setBackground(new java.awt.Color(255, 255, 255));
        n0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        n0.setForeground(new java.awt.Color(47, 56, 64));
        n0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n0.setText("0");
        n0.setAlignmentY(0.0F);
        n0.setBorder(null);
        n0.setBorderPainted(false);
        n0.setContentAreaFilled(false);
        n0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n0.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        n0.setDefaultCapable(false);
        n0.setFocusPainted(false);
        n0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        n0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        n0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LightB.png"))); // NOI18N
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });
        buttons.add(n0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 80));

        sum1.setBackground(new java.awt.Color(255, 255, 255));
        sum1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        sum1.setForeground(new java.awt.Color(47, 56, 64));
        sum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sum1.setText("^");
        sum1.setAlignmentY(0.0F);
        sum1.setBorder(null);
        sum1.setBorderPainted(false);
        sum1.setContentAreaFilled(false);
        sum1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sum1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sum1.setDefaultCapable(false);
        sum1.setFocusPainted(false);
        sum1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sum1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonN.png"))); // NOI18N
        sum1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonNP.png"))); // NOI18N
        sum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sum1ActionPerformed(evt);
            }
        });
        buttons.add(sum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 80, 80));
        buttons.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 430, 10));
        buttons.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 10));
        buttons.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));
        buttons.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        put("/");
    }//GEN-LAST:event_divActionPerformed

    private void btcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcActionPerformed
        operation.setText("");
        result.setText("");
    }//GEN-LAST:event_btcActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        ce();
    }//GEN-LAST:event_ceActionPerformed
    
    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        put("7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        put("8");
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        put("9");
    }//GEN-LAST:event_n9ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        put("4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        put("5");
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        put("6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        put("1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        put("2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        put("3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        put("0");
    }//GEN-LAST:event_n0ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        put("-");
    }//GEN-LAST:event_subActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        put("+");
    }//GEN-LAST:event_sumActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        put("*");
    }//GEN-LAST:event_mulActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        put(".");
    }//GEN-LAST:event_dotActionPerformed

    private void equActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equActionPerformed
        evaluar();
    }//GEN-LAST:event_equActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        put("%");
    }//GEN-LAST:event_percentActionPerformed

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed
        if (this.toggle.isSelected()) {
            
            // Paneles
            this.buttons.setBackground(new Color(34,53,84));
            this.grafics.setBackground(new Color(19,38,67));
            
            // <editor-fold defaultstate="collapsed" desc="Color de texto DarkMode">
            this.n0.setForeground(new Color(8,156,151));
            this.n1.setForeground(new Color(8,156,151));
            this.n2.setForeground(new Color(8,156,151));
            this.n3.setForeground(new Color(8,156,151));
            this.n4.setForeground(new Color(8,156,151));
            this.n5.setForeground(new Color(8,156,151));
            this.n6.setForeground(new Color(8,156,151));
            this.n7.setForeground(new Color(8,156,151));
            this.n8.setForeground(new Color(8,156,151));
            this.n9.setForeground(new Color(8,156,151));
            this.div.setForeground(new Color(8,156,151));
            this.mul.setForeground(new Color(8,156,151));
            this.dot.setForeground(new Color(8,156,151));
            this.btc.setForeground(new Color(8,156,151));
            this.ce.setForeground(new Color(8,156,151));
            this.percent.setForeground(new Color(8,156,151));
            this.sum.setForeground(new Color(8,156,151));
            this.sum1.setForeground(new Color(8,156,151));
            this.sub.setForeground(new Color(8,156,151));
            
            this.equ.setForeground(new Color(47,56,64));
            
            this.operation.setForeground(new Color(8,156,151));
            this.result.setForeground(new Color(8,156,151));
            //</editor-fold>
            
            // <editor-fold defaultstate="collapsed" desc="Color bottonN OscureMode">
            this.btc.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.ce.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.percent.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.div.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.mul.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.sum.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.sub.setIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.btc.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.ce.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.percent.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.div.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.mul.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.sum.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            this.sum1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
               
            
            this.sub.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DbuttonN.png")));
            
            
            this.sub.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.btc.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.ce.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.percent.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.div.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.mul.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.sum.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.sum1.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            this.sub.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DbuttonNP.png")));
            
            
            
            this.n0.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n1.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n2.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n3.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n4.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n5.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n6.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n7.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n8.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n9.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.dot.setIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n0.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n2.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n3.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n4.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n5.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n6.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n7.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n8.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.n9.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            this.dot.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/DLbutton.png")));
            
            
            this.n0.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n1.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n2.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n3.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n4.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n5.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n6.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n7.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n8.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.n9.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            this.dot.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/DLbuttonP.png")));
            
            
            //</editor-fold>
            
            
        } else {
            // Paneles
            this.buttons.setBackground(Color.white);
            this.grafics.setBackground(new Color(234,255,255));
            
            // <editor-fold defaultstate="collapsed" desc="Color de texto LightMode"> 
            this.n0.setForeground(new Color(47,56,64));
            this.n1.setForeground(new Color(47,56,64));
            this.n2.setForeground(new Color(47,56,64));
            this.n3.setForeground(new Color(47,56,64));
            this.n4.setForeground(new Color(47,56,64));
            this.n5.setForeground(new Color(47,56,64));
            this.n6.setForeground(new Color(47,56,64));
            this.n7.setForeground(new Color(47,56,64));
            this.n8.setForeground(new Color(47,56,64));
            this.n9.setForeground(new Color(47,56,64));
            this.dot.setForeground(new Color(47,56,64));
            this.btc.setForeground(new Color(47,56,64));
            this.ce.setForeground(new Color(47,56,64));
            this.percent.setForeground(new Color(47,56,64));
            this.div.setForeground(new Color(47,56,64));
            this.mul.setForeground(new Color(47,56,64));
            this.sum.setForeground(new Color(47,56,64));
            
            this.sum1.setForeground(new Color(47,56,64));
            this.sub.setForeground(new Color(47,56,64));
            this.equ.setForeground(Color.white);
            
            
            this.operation.setForeground(new Color(47,56,64));
            this.result.setForeground(new Color(47,56,64));
            //</editor-fold>
            
            
            // <editor-fold defaultstate="collapsed" desc="Color bottonN OscureMode">
            this.btc.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.ce.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.percent.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.div.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.mul.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.sum.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.sub.setIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.btc.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.ce.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.percent.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.div.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.mul.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.sum.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.sum1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.sub.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            
            
            this.sub.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.btc.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.ce.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.percent.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.div.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.mul.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.sum.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.sum1.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            this.sub.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonNP.png")));
            
            
            this.n0.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n1.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n2.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n3.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n4.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n5.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n6.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n7.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n8.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n9.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.dot.setIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n0.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n1.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n2.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n3.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n4.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n5.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n6.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n7.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n8.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.n9.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            this.dot.setRolloverSelectedIcon(new ImageIcon(getClass().getResource("/Images/LightB.png")));
            
            
            this.n0.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n1.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n2.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n3.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n4.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n5.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n6.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n7.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n8.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.n9.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            this.dot.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/ButtonN.png")));
            
            
            //</editor-fold>
            
            
        }
    }//GEN-LAST:event_toggleActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseDragged
        
    }//GEN-LAST:event_CloseMouseDragged

    private void DragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragMouseDragged
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        int x = pointerInfo.getLocation().x;
        int y = pointerInfo.getLocation().y;
        
        setLocation(x-Drag.getX()-15,y+Drag.getY()-25);
    }//GEN-LAST:event_DragMouseDragged

    private void sum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sum1ActionPerformed
      put("^");  
    }//GEN-LAST:event_sum1ActionPerformed
    
    private void evaluar(){
        String resulta = evaluator.evaluate(operation.getText());
        result.setText(resulta);
    }
    
    
    private void put(String carac){
        this.operation.setText(operation.getText()+carac);
    }
    
    
    private void ce(){
        if (this.operation.getText().length() == 0) {
            return;
        }
        this.operation.setText(this.operation.getText().substring(0, this.operation.getText().length()-1));
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Drag;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton btc;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton ce;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton equ;
    private javax.swing.JPanel grafics;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton mul;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JLabel operation;
    private javax.swing.JButton percent;
    private javax.swing.JLabel result;
    private javax.swing.JButton sub;
    private javax.swing.JButton sum;
    private javax.swing.JButton sum1;
    private javax.swing.JToggleButton toggle;
    // End of variables declaration//GEN-END:variables
}
