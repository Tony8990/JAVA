/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MyLibrary;
import model.Persona;
import model.Sesso;

/**
 *
 * @author Tony
 */
public class AggiornaPersona extends javax.swing.JFrame {
private String path="dati.dat";
private int cerca;
private Persona p=null;
private ArrayList<Persona>al=null;
    /**
     * Creates new form AggiornaPersona
     */
    public AggiornaPersona() {
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

        lblsesso = new javax.swing.JLabel();
        btnAggiorna = new javax.swing.JButton();
        radioaltro = new javax.swing.JRadioButton();
        radiofemmina = new javax.swing.JRadioButton();
        radiomaschio = new javax.swing.JRadioButton();
        textnome = new javax.swing.JTextField();
        textcerca = new javax.swing.JTextField();
        textluogo = new javax.swing.JTextField();
        textdata = new javax.swing.JTextField();
        textcognome = new javax.swing.JTextField();
        lblelicerca = new javax.swing.JLabel();
        btncerca = new javax.swing.JButton();
        lbltitleaggiorna = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lblcognome = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        lblluogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsesso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblsesso.setText("Sesso :");

        btnAggiorna.setText("Aggiorna");
        btnAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaActionPerformed(evt);
            }
        });

        radioaltro.setText("Altro");

        radiofemmina.setText("Femmina");

        radiomaschio.setText("Maschio");

        lblelicerca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblelicerca.setText("Cerca per id:");

        btncerca.setText("Cerca");
        btncerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncercaActionPerformed(evt);
            }
        });

        lbltitleaggiorna.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltitleaggiorna.setText("Aggiorna");

        lblnome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblnome.setText("Nome :");

        lblcognome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcognome.setText("Cognome");

        lbldata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldata.setText("Data di nascita");

        lblluogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblluogo.setText("Luogo di nascita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblluogo)
                    .addComponent(lblelicerca)
                    .addComponent(lblnome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcognome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldata, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsesso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radiofemmina)
                            .addComponent(radioaltro)
                            .addComponent(textnome, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(textcognome)
                            .addComponent(textdata)
                            .addComponent(textluogo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radiomaschio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textcerca, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(btncerca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitleaggiorna)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbltitleaggiorna)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblelicerca)
                    .addComponent(textcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncerca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(textnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcognome)
                    .addComponent(textcognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldata)
                    .addComponent(textdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblluogo)
                    .addComponent(textluogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsesso)
                    .addComponent(radioaltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiomaschio)
                    .addComponent(btnAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiofemmina)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaActionPerformed
    try {
        al.get(cerca).setNome(textnome.getText());
        al.get(cerca).setCognome(textcognome.getText());
        al.get(cerca).setLuogoNascita(textluogo.getText());
        
        GregorianCalendar gr;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(textdata.getText());
        gr =(GregorianCalendar) GregorianCalendar.getInstance();
        gr.setTime(date);
        al.get(cerca).setDataNascita(gr);
        
        if(radioaltro.isSelected())
            al.get(cerca).setSesso(Sesso.ALTRO);
        if(radiofemmina.isSelected())
            al.get(cerca).setSesso(Sesso.FEMMINA);
        if(radiomaschio.isSelected())
            al.get(cerca).setSesso(Sesso.MASCHIO);
        MyLibrary.scrivi(path, al);
        JOptionPane.showMessageDialog(null,"Profilo Aggiornato");
        this.dispose();
        
    } catch (ParseException ex) {
        Logger.getLogger(AggiornaPersona.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAggiornaActionPerformed

    private void btncercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncercaActionPerformed
        
        cerca=Integer.parseInt(textcerca.getText());
        p=new Persona();
        al=new ArrayList<Persona>();
        al=MyLibrary.leggi(path);
        for(Object o : al){
            if(o instanceof Persona)
            p=(Persona)o;
        }
        textnome.setText(al.get(cerca).getNome());
        textcognome.setText(al.get(cerca).getCognome());
        textluogo.setText(al.get(cerca).getLuogoNascita());
        textdata.setText(al.get(cerca).dataLineare());
        if(al.get(cerca).getSesso()==Sesso.ALTRO)
        radioaltro.doClick();
        if(al.get(cerca).getSesso()==Sesso.FEMMINA)
        radiofemmina.doClick();
        if(al.get(cerca).getSesso()==Sesso.MASCHIO)
        radiomaschio.doClick();
         
    }//GEN-LAST:event_btncercaActionPerformed

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
            java.util.logging.Logger.getLogger(AggiornaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AggiornaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AggiornaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AggiornaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AggiornaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiorna;
    private javax.swing.JButton btncerca;
    private javax.swing.JLabel lblcognome;
    private javax.swing.JLabel lbldata;
    private javax.swing.JLabel lblelicerca;
    private javax.swing.JLabel lblluogo;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblsesso;
    private javax.swing.JLabel lbltitleaggiorna;
    private javax.swing.JRadioButton radioaltro;
    private javax.swing.JRadioButton radiofemmina;
    private javax.swing.JRadioButton radiomaschio;
    private javax.swing.JTextField textcerca;
    private javax.swing.JTextField textcognome;
    private javax.swing.JTextField textdata;
    private javax.swing.JTextField textluogo;
    private javax.swing.JTextField textnome;
    // End of variables declaration//GEN-END:variables
}
