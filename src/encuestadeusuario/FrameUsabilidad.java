/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuestadeusuario;
import java.awt.Color;
/**
 *
 * @author Juli
 */
public class FrameUsabilidad extends javax.swing.JFrame {

    /**
     * Creates new form FrameUsabilidad
     */
    public FrameUsabilidad() {
        initComponents();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Encuesta de Usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evalFuncText2 = new javax.swing.JLabel();
        segAccesoText1 = new javax.swing.JLabel();
        pregunta1Text2 = new javax.swing.JLabel();
        pregunta2Text2 = new javax.swing.JLabel();
        capacEntendidoCombo = new javax.swing.JComboBox<>();
        exactText1 = new javax.swing.JLabel();
        capacOperadoCombo = new javax.swing.JComboBox<>();
        capacOpText = new javax.swing.JTextField();
        capacEntendText = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        evalFuncText2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        evalFuncText2.setText("Usabilidad");

        segAccesoText1.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        segAccesoText1.setText("Capacidad para ser entendido");

        pregunta1Text2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta1Text2.setText("El Software posee ayuda contextual sobre menús y botones de acción.");

        pregunta2Text2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta2Text2.setText("El Software posee un manual de usuario incorporado al sistema como un menú dedicado.");

        capacEntendidoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "No cumple con alguna característica.", "Cumple con 1 característica.", "Cumple con 2 características." }));
        capacEntendidoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacEntendidoComboActionPerformed(evt);
            }
        });

        exactText1.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        exactText1.setText("Capacidad para ser operado");

        capacOperadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "El usuario requiere consultar a personal especializado para operar el producto software.", " El usuario requiere ayuda contextual y manual de uso para operar el producto", "software.", "El usuario opera el producto software sin asistencia." }));
        capacOperadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacOperadoComboActionPerformed(evt);
            }
        });

        capacOpText.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        capacOpText.setForeground(new java.awt.Color(255, 255, 255));
        capacOpText.setEnabled(false);
        capacOpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacOpTextActionPerformed(evt);
            }
        });

        capacEntendText.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        capacEntendText.setForeground(new java.awt.Color(255, 255, 255));
        capacEntendText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        capacEntendText.setEnabled(false);

        botonSiguiente.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capacEntendidoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacEntendText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(evalFuncText2)
                            .addComponent(segAccesoText1)
                            .addComponent(pregunta1Text2)
                            .addComponent(pregunta2Text2)
                            .addComponent(exactText1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(capacOperadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(capacOpText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(evalFuncText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(segAccesoText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta1Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pregunta2Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capacEntendidoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capacEntendText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(26, 26, 26)
                .addComponent(exactText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capacOperadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacOpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capacEntendidoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacEntendidoComboActionPerformed
        switch(capacEntendidoCombo.getSelectedIndex()) {
            case 1: {
                capacEntendText.setDisabledTextColor(Color.RED);
                capacEntendText.setText("Evaluación: MALA");
                break;
            }
            case 2: {
                capacEntendText.setDisabledTextColor(Color.orange);
                capacEntendText.setText("Evaluación: REGULAR");
                break;
            }
            case 3: {
                capacEntendText.setDisabledTextColor(Color.green);
                capacEntendText.setText("Evaluación: BUENA");
                break;
            }
        }
    }//GEN-LAST:event_capacEntendidoComboActionPerformed

    private void capacOperadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacOperadoComboActionPerformed
        switch(capacOperadoCombo.getSelectedIndex()) {
            case 1: {
                capacOpText.setDisabledTextColor(Color.RED);
                capacOpText.setText("Evaluación: MALA");
                break;
            }
            case 2: {
                capacOpText.setDisabledTextColor(Color.orange);
                capacOpText.setText("Evaluación: REGULAR");
                break;
            }
            case 3: {
                capacOpText.setDisabledTextColor(Color.green);
                capacOpText.setText("Evaluación: BUENA");
                break;
            }
        }
    }//GEN-LAST:event_capacOperadoComboActionPerformed

    private void capacOpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacOpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacOpTextActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        new FramePortabilidad().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameUsabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUsabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUsabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUsabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUsabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField capacEntendText;
    private javax.swing.JComboBox<String> capacEntendidoCombo;
    private javax.swing.JTextField capacOpText;
    private javax.swing.JComboBox<String> capacOperadoCombo;
    private javax.swing.JLabel evalFuncText2;
    private javax.swing.JLabel exactText1;
    private javax.swing.JLabel pregunta1Text2;
    private javax.swing.JLabel pregunta2Text2;
    private javax.swing.JLabel segAccesoText1;
    // End of variables declaration//GEN-END:variables
}