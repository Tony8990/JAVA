/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Tony
 */
public class Finestra extends javax.swing.JFrame {

    /**
     * Creates new form Finestra
     */
    public Finestra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuovap = new javax.swing.JButton();
        btnvisualizza = new javax.swing.JButton();
        btnAggiorna = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnnuovap.setText("Nuova Persona");
        btnnuovap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuovapActionPerformed(evt);
            }
        });

        btnvisualizza.setText("Visualizza");
        btnvisualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisualizzaActionPerformed(evt);
            }
        });

        btnAggiorna.setText("Aggiorna");
        btnAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaActionPerformed(evt);
            }
        });

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnnuovap)
                .addGap(18, 18, 18)
                .addComponent(btnvisualizza)
                .addGap(18, 18, 18)
                .addComponent(btnAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnElimina, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuovap)
                    .addComponent(btnvisualizza)
                    .addComponent(btnAggiorna)
                    .addComponent(btnElimina))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuovapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuovapActionPerformed
       NuovaPersona p=new NuovaPersona();
       p.setVisible(true);
       p.setTitle("Nuova Persona");
    }//GEN-LAST:event_btnnuovapActionPerformed

    private void btnvisualizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisualizzaActionPerformed
      VisualizzaPersona v = new VisualizzaPersona();
      v.setVisible(true);
      v.setTitle("Visualizza");


    }//GEN-LAST:event_btnvisualizzaActionPerformed

    private void btnAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaActionPerformed
        AggiornaPersona ag =new AggiornaPersona();
        ag.setVisible(true);
        ag.setTitle("Aggiorna Profilo");
    }//GEN-LAST:event_btnAggiornaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        EliminaPersona ep = new EliminaPersona();
        ep.setVisible(true);
        ep.setTitle("Elimina Profilo");
    }//GEN-LAST:event_btnEliminaActionPerformed

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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiorna;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnnuovap;
    private javax.swing.JButton btnvisualizza;
    // End of variables declaration//GEN-END:variables
}