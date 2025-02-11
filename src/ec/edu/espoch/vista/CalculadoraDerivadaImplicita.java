package ec.edu.espoch.vista;

import ec.edu.espoch.modelo.Derivacion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class CalculadoraDerivadaImplicita extends javax.swing.JFrame {
    
    Derivacion derivada;

    public CalculadoraDerivadaImplicita() {
        initComponents();
        Limpiar();
        this.setLocationRelativeTo(null);
       TextPrompt letras = new TextPrompt("Ingrese la función a derivar", txtFyX);
        
    }

    private void SetImagenLabel(JLabel labelname, String root){
        ImageIcon image=new ImageIcon(root);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFyX = new javax.swing.JTextField();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DERIVADAS IMPLICITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 380, -1));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setText("F(x,y)=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        txtFyX.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFyX.setDoubleBuffered(true);
        txtFyX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFyXActionPerformed(evt);
            }
        });
        jPanel1.add(txtFyX, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 185, 33));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel10.setText("La Derivación de X es:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 214, -1));

        constanteX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteXActionPerformed(evt);
            }
        });
        jPanel1.add(constanteX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 200, 30));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel11.setText("La Derivación de Y es:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 223, -1));

        constanteY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteYActionPerformed(evt);
            }
        });
        jPanel1.add(constanteY, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 201, 30));

        derivarX.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        derivarX.setText("Derivar (x)");
        derivarX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        derivarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivarXActionPerformed(evt);
            }
        });
        jPanel1.add(derivarX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 162, -1));

        derivarY.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        derivarY.setText("Derivar (y)");
        derivarY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        derivarY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivarYActionPerformed(evt);
            }
        });
        jPanel1.add(derivarY, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 162, -1));

        limpiar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setToolTipText("");
        limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 170, 30));

        constanteY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteY1ActionPerformed(evt);
            }
        });
        jPanel1.add(constanteY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 140, 34));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea1.jpeg"))); // NOI18N
        jLabel6.setText("/");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 192, 2));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resta1.jpeg"))); // NOI18N
        jLabel7.setText("-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 15, 2));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("y'=");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        constanteX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanteX1ActionPerformed(evt);
            }
        });
        jPanel1.add(constanteX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 140, 34));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ESPOCH2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 140));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel12.setText("Su derivada de acuerdo a su fórmula:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 280, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String funcion = txtFyX.getText();

        if (!funcion.isEmpty()) {
            derivada = new Derivacion();
            derivada.setFuncionADerivar(funcion);
            derivada.derivarY();
            constanteX.setText(derivada.getFuncionDerivada());
            constanteX1.setText(derivada.getFuncionDerivada());

        } else {
            JOptionPane.showMessageDialog(null, "No Existen Valores Ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_derivarYActionPerformed

    private void derivarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivarXActionPerformed
        String funcion = txtFyX.getText();

        if (!funcion.isEmpty()) {
            derivada = new Derivacion();
            derivada.setFuncionADerivar(funcion);
            derivada.derivarX();
            constanteY.setText(derivada.getFuncionDerivada());
            constanteY1.setText(derivada.getFuncionDerivada());

        } else {
            JOptionPane.showMessageDialog(null, "No Existen Valores Ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_derivarXActionPerformed

    private void constanteYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteYActionPerformed

    private void constanteXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanteXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constanteXActionPerformed

    private void txtFyXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFyXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFyXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField constanteX;
    private javax.swing.JTextField constanteX1;
    private javax.swing.JTextField constanteY;
    private javax.swing.JTextField constanteY1;
    private javax.swing.JButton derivarX;
    private javax.swing.JButton derivarY;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField txtFyX;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtFyX.setText("");
        constanteY.setText("");
        constanteX.setText("");
        constanteY1.setText("");
        constanteX1.setText("");
    }
    
}
