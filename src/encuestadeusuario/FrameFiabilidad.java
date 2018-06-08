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
public class FrameFiabilidad extends javax.swing.JFrame {

    /**
     * Creates new form FrameFiabilidad
     */
    public FrameFiabilidad() {
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

        evalFuncText1 = new javax.swing.JLabel();
        toeranciaFallosText = new javax.swing.JLabel();
        pregunta1Text1 = new javax.swing.JLabel();
        pregunta2Text1 = new javax.swing.JLabel();
        toleranciaFallosCombo = new javax.swing.JComboBox<>();
        capacRecuperacionText = new javax.swing.JLabel();
        pregunta3Text = new javax.swing.JLabel();
        pregunta4Text = new javax.swing.JLabel();
        capacRecupCombo = new javax.swing.JComboBox<>();
        capacRecupText = new javax.swing.JTextField();
        toleranciaFallosText = new javax.swing.JTextField();
        botonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        evalFuncText1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        evalFuncText1.setText("Fiabilidad");

        toeranciaFallosText.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        toeranciaFallosText.setText("Tolerancia a fallos");

        pregunta1Text1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta1Text1.setText("Cuando sucede un error, ¿se protegen los datos procesados?");

        pregunta2Text1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta2Text1.setText("¿Se realiza un log de actividades que el sistema estaba haciendo?");

        toleranciaFallosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "No cumple con alguna característica.", "Cumple con 1 característica.", "Cumple con 2 características." }));
        toleranciaFallosCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaFallosComboActionPerformed(evt);
            }
        });

        capacRecuperacionText.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        capacRecuperacionText.setText("Capacidad de recuperación de errores");

        pregunta3Text.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta3Text.setText("El sistema reanuda las actividades si se produce una falla crítica.");

        pregunta4Text.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        pregunta4Text.setText("Reanuda sus actividades y vuelve al estado en el que estaba.");

        capacRecupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "No cumple con alguna característica.", "Cumple con 1 característica.", "Cumple con 2 características." }));
        capacRecupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacRecupComboActionPerformed(evt);
            }
        });

        capacRecupText.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        capacRecupText.setForeground(new java.awt.Color(255, 255, 255));
        capacRecupText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        capacRecupText.setEnabled(false);

        toleranciaFallosText.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        toleranciaFallosText.setForeground(new java.awt.Color(255, 255, 255));
        toleranciaFallosText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        toleranciaFallosText.setEnabled(false);

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(capacRecupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(capacRecupText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(toleranciaFallosCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(evalFuncText1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(toeranciaFallosText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pregunta1Text1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pregunta2Text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(toleranciaFallosText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(capacRecuperacionText)
                                .addComponent(pregunta3Text)
                                .addComponent(pregunta4Text))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(evalFuncText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toeranciaFallosText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pregunta1Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta2Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toleranciaFallosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toleranciaFallosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(capacRecuperacionText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta3Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta4Text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacRecupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacRecupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toleranciaFallosComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaFallosComboActionPerformed
        switch(toleranciaFallosCombo.getSelectedIndex()) {
            case 1: {
                toleranciaFallosText.setDisabledTextColor(Color.RED);
                toleranciaFallosText.setText("Evaluación: MALA");
                break;
            }
            case 2: {
                toleranciaFallosText.setDisabledTextColor(Color.orange);
                toleranciaFallosText.setText("Evaluación: REGULAR");
                break;
            }
            case 3: {
                toleranciaFallosText.setDisabledTextColor(Color.green);
                toleranciaFallosText.setText("Evaluación: BUENA");
                break;
            }
        }
    }//GEN-LAST:event_toleranciaFallosComboActionPerformed

    private void capacRecupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacRecupComboActionPerformed
        switch(capacRecupCombo.getSelectedIndex()) {
            case 1: {
                capacRecupText.setDisabledTextColor(Color.RED);
                capacRecupText.setText("Evaluación: MALA");
                break;
            }
            case 2: {
                capacRecupText.setDisabledTextColor(Color.orange);
                capacRecupText.setText("Evaluación: REGULAR");
                break;
            }
            case 3: {
                capacRecupText.setDisabledTextColor(Color.green);
                capacRecupText.setText("Evaluación: BUENA");
                break;
            }
        }
    }//GEN-LAST:event_capacRecupComboActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        new FrameUsabilidad().setVisible(true);
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
            java.util.logging.Logger.getLogger(FrameFiabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFiabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFiabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFiabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFiabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JComboBox<String> capacRecupCombo;
    private javax.swing.JTextField capacRecupText;
    private javax.swing.JLabel capacRecuperacionText;
    private javax.swing.JLabel evalFuncText1;
    private javax.swing.JLabel pregunta1Text1;
    private javax.swing.JLabel pregunta2Text1;
    private javax.swing.JLabel pregunta3Text;
    private javax.swing.JLabel pregunta4Text;
    private javax.swing.JLabel toeranciaFallosText;
    private javax.swing.JComboBox<String> toleranciaFallosCombo;
    private javax.swing.JTextField toleranciaFallosText;
    // End of variables declaration//GEN-END:variables
}