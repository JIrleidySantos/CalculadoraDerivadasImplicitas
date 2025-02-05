package ec.edu.espoch.vista;

import ec.edu.espoch.modelo.Derivacion;

import javax.swing.JOptionPane;


public class CalculadoraDerivadaImplicita extends javax.swing.JFrame {

  
    
    Derivacion derivada;

    public CalculadoraDerivadaImplicita() {
        initComponents();
        Limpiar();
        this.setLocationRelativeTo(null);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        constanteX = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        constanteY = new javax.swing.JTextField();
        derivarX = new javax.swing.JButton();
        derivarY = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        constanteY1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        constanteX1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DERIVADAS IMPLICITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 380, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("F(x,y)=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 185, 33));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Ingresa la Derivación de x:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 214, -1));

        constanteX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteXActionPerformed(evt);
            }
        });
        jPanel1.add(constanteX, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Ingresa la Derivación de y:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 223, -1));

        constanteY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteYActionPerformed(evt);
            }
        });
        jPanel1.add(constanteY, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 201, 30));

        derivarX.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        derivarX.setText("Derivar x");
        derivarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivarXActionPerformed(evt);
            }
        });
        jPanel1.add(derivarX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 162, -1));

        derivarY.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        derivarY.setText("Derivar y");
        derivarY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivarYActionPerformed(evt);
            }
        });
        jPanel1.add(derivarY, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 162, -1));

        limpiar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera1.jpeg"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setToolTipText("");
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 162, -1));

        constanteY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteY1ActionPerformed(evt);
            }
        });
        jPanel1.add(constanteY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 140, 34));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea1.jpeg"))); // NOI18N
        jLabel6.setText("/");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 192, 2));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resta1.jpeg"))); // NOI18N
        jLabel7.setText("-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 15, 2));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("y'=");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        constanteX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteX1ActionPerformed(evt);
            }
        });
        jPanel1.add(constanteX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 140, 34));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("\"Ingrese la Funcion a derivar\"");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jir.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void constanteX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteX1ActionPerformed

    private void constanteY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteY1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteY1ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void derivarYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivarYActionPerformed
        String funcion = f.getText();

        if (!funcion.isEmpty()) {
            derivada = new Derivacion();
            derivada.setFuncionADerivar(funcion);
            derivada.derivarY();
            constanteX.setText(derivada.getFuncionDerivada());
            constanteX1.setText(derivada.getFuncionDerivada());

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Valores", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_derivarYActionPerformed

    private void derivarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivarXActionPerformed
        String funcion = f.getText();

        if (!funcion.isEmpty()) {
            derivada = new Derivacion();
            derivada.setFuncionADerivar(funcion);
            derivada.derivarX();
            constanteY.setText(derivada.getFuncionDerivada());
            constanteY1.setText(derivada.getFuncionDerivada());

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Valores", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_derivarXActionPerformed

    private void constanteYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteYActionPerformed

    private void constanteXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField constanteX;
    private javax.swing.JTextField constanteX1;
    private javax.swing.JTextField constanteY;
    private javax.swing.JTextField constanteY1;
    private javax.swing.JButton derivarX;
    private javax.swing.JButton derivarY;
    private javax.swing.JTextField f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        f.setText("");
        constanteY.setText("");
        constanteX.setText("");
        constanteY1.setText("");
        constanteX1.setText("");
    }
    
}
