/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnidemocalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author les
 */
public class Interfaz extends javax.swing.JFrame {
    private Controlador Control;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        Control=new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextFieldOperador1 = new javax.swing.JTextField();
        jTextFieldOperador2 = new javax.swing.JTextField();
        jLabelOperador1 = new javax.swing.JLabel();
        jLabelOperador2 = new javax.swing.JLabel();
        jRBSuma = new javax.swing.JRadioButton();
        jRBResta = new javax.swing.JRadioButton();
        jRBMultiplicacion = new javax.swing.JRadioButton();
        jRBDivision = new javax.swing.JRadioButton();
        ButtonCalcular = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        jTextFieldPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelOperador1.setText("Operador 1");

        jLabelOperador2.setText("Operador 2");

        buttonGroup1.add(jRBSuma);
        jRBSuma.setText("Suma");
        jRBSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSumaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBResta);
        jRBResta.setText("Resta");

        buttonGroup1.add(jRBMultiplicacion);
        jRBMultiplicacion.setText("Multiplicacion");
        jRBMultiplicacion.setMaximumSize(new java.awt.Dimension(64, 24));
        jRBMultiplicacion.setMinimumSize(new java.awt.Dimension(64, 24));

        buttonGroup1.add(jRBDivision);
        jRBDivision.setText("Division");
        jRBDivision.setMaximumSize(new java.awt.Dimension(64, 24));
        jRBDivision.setMinimumSize(new java.awt.Dimension(64, 24));
        jRBDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDivisionActionPerformed(evt);
            }
        });

        ButtonCalcular.setText("Calcular");
        ButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularActionPerformed(evt);
            }
        });

        jLabelTitulo.setText("Calculadora casio 666");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(200, 30));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabelInfo.setText("Ingresar ruta donde esta almacenada la libreria JNIMath.so");

        jTextFieldPath.setText("Ejemplo:/home/les/Tarea/JNIdemoCalculadora/Libreria/JNIMath.so");
        jTextFieldPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPathActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPath, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(355, 355, 355)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldOperador1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelOperador1)
                                                .addGap(30, 30, 30))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(257, 257, 257)
                                        .addComponent(jRBSuma)
                                        .addGap(33, 33, 33)
                                        .addComponent(jRBResta)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldOperador2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabelOperador2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jRBMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonCalcular)
                        .addGap(438, 438, 438))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfo)
                    .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOperador1)
                    .addComponent(jLabelOperador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOperador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOperador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBSuma)
                    .addComponent(jRBResta)
                    .addComponent(jRBMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBSumaActionPerformed

    private void jRBDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBDivisionActionPerformed

    private void ButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularActionPerformed
        // TODO add your handling code here:
        if(Control.ConfirmPath(jTextFieldPath.getText())){
            if(Control.ConfirmJT(jTextFieldOperador1.getText(),jTextFieldOperador2.getText())){
                EjecutarOperacion();
            }
            else{
            JOptionPane.showMessageDialog(rootPane, "Se debe digitar unicamente numeros");
            }
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "Error en la ruta ingresada no es valida");
        }
        
    }//GEN-LAST:event_ButtonCalcularActionPerformed

    private void jTextFieldPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPathActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Metodo que ejecuta las operaciones
    public void EjecutarOperacion(){
    if(jRBSuma.isSelected()){
        jLabelResultado.setText(Double.toString(Control.sumaNativa(Double.parseDouble(jTextFieldOperador1.getText()), Double.parseDouble(jTextFieldOperador2.getText()))));
    }
    else if(jRBResta.isSelected()){
            jLabelResultado.setText(Double.toString(Control.restaNativa(Double.parseDouble(jTextFieldOperador1.getText()), Double.parseDouble(jTextFieldOperador2.getText()))));
    }
    else if(jRBMultiplicacion.isSelected()){
            jLabelResultado.setText(Double.toString(Control.multiplicacionNativa(Double.parseDouble(jTextFieldOperador1.getText()), Double.parseDouble(jTextFieldOperador2.getText()))));
    }
    else if(jRBDivision.isSelected()){
        jLabelResultado.setText(Double.toString(Control.divisionNativa(Double.parseDouble(jTextFieldOperador1.getText()), Double.parseDouble(jTextFieldOperador2.getText()))));
    }
    else{
        JOptionPane.showMessageDialog(rootPane, "No tiene selecionada una operacion");
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelOperador1;
    private javax.swing.JLabel jLabelOperador2;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRBDivision;
    private javax.swing.JRadioButton jRBMultiplicacion;
    private javax.swing.JRadioButton jRBResta;
    private javax.swing.JRadioButton jRBSuma;
    private javax.swing.JTextField jTextFieldOperador1;
    private javax.swing.JTextField jTextFieldOperador2;
    private javax.swing.JTextField jTextFieldPath;
    // End of variables declaration//GEN-END:variables
}
