/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectindividual;

import java.awt.List;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Nat;
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        //fillBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chattButton = new javax.swing.JToggleButton();
        createButton = new javax.swing.JToggleButton();
        deleteButton = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 420));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome to your profile Zeus");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 400, 52);

        chattButton.setBackground(new java.awt.Color(51, 255, 255));
        chattButton.setForeground(new java.awt.Color(0, 0, 0));
        chattButton.setText("Start Chatting!");
        chattButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chattButtonActionPerformed(evt);
            }
        });
        jPanel1.add(chattButton);
        chattButton.setBounds(60, 180, 180, 70);

        createButton.setBackground(new java.awt.Color(255, 255, 204));
        createButton.setForeground(new java.awt.Color(0, 0, 0));
        createButton.setText("Create secret user");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createButton);
        createButton.setBounds(350, 140, 150, 40);

        deleteButton.setBackground(new java.awt.Color(255, 255, 204));
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete a user");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(350, 220, 150, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sbouf\\OneDrive\\Documents\\Bootcamp\\Projects\\Individual no1\\rsz_zeusicon.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 10, 90, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sbouf\\OneDrive\\Documents\\Bootcamp\\Projects\\Individual no1\\rsz_1rsz_clouds.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 550, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void chattButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chattButtonActionPerformed
    ChatView cv = new ChatView();
    cv.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_chattButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        Create cr = new Create();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Delete del = new Delete();
        del.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

//    private void fillBox(){
//        
//        try{
//            Connection con = mysqlConnector.connect();
//            
//            String sql = "select * from user_details";
//            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//            
//            while(rs.next()){
//            String name = rs.getString("username");
//            
//            combobox.addItem(name);
//            }
//        
//        }catch(Exception e){
//   
//        }
// 
//    }
    
    
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton chattButton;
    private javax.swing.JToggleButton createButton;
    private javax.swing.JToggleButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
