/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectindividual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nat;
 */
public class ChatView extends javax.swing.JFrame {

    /**
     * Creates new form ChatView
     */
    public ChatView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        fillCombo1();
        fillCombo2();
        //System.out.println(fillCombo1());
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        sendbutton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        mymsg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jimage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        text1.setColumns(20);
        text1.setRows(5);
        jScrollPane1.setViewportView(text1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 80, 436, 209);

        sendbutton.setText("Send");
        sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(sendbutton);
        sendbutton.setBounds(126, 309, 80, 32);

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton);
        CancelButton.setBounds(230, 309, 69, 32);

        mymsg.setText("My messages");
        mymsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mymsgActionPerformed(evt);
            }
        });
        jPanel1.add(mymsg);
        mymsg.setBounds(330, 310, 110, 32);

        jLabel4.setText("I am..");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 0, 70, 40);

        combo1.setBackground(new java.awt.Color(0, 0, 0));
        combo1.setForeground(new java.awt.Color(255, 255, 255));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(combo1);
        combo1.setBounds(10, 40, 110, 26);

        jimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\sbouf\\OneDrive\\Documents\\Bootcamp\\Projects\\Individual no1\\chatwindow.png")); // NOI18N
        jimage.setText("jLabel3");
        jPanel1.add(jimage);
        jimage.setBounds(0, 0, 560, 430);

        jLabel5.setText("Chatting with..");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 310, 90, 40);

        combo2.setBackground(new java.awt.Color(0, 0, 0));
        combo2.setForeground(new java.awt.Color(255, 255, 255));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        jPanel1.add(combo2);
        combo2.setBounds(20, 360, 110, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        //String valuename = (String) combo2.getSelectedItem();
    }//GEN-LAST:event_combo2ActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
      if (fillCombo1().equals("nat")){
                   MainApp ma = new MainApp();
                   ma.setVisible(true);
                   this.dispose();
               }
               
      else if (fillCombo1().equals("aphro")){
                   MainApp2Afro ma2 = new MainApp2Afro();
                   ma2.setVisible(true);
                   this.dispose();
               }
                
      else if (fillCombo1().equals("pos")){
                   MainApp3Pos ma3 = new MainApp3Pos();
                   ma3.setVisible(true);
                   this.dispose();
               }
                else{
                    LoginPage lp = new LoginPage();
                    lp.setVisible(true);
                    this.dispose();
                }
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbuttonActionPerformed
       
 //       JButton mybtn = new JButton();
        
//       mybtn.addActionListener(new ActionListener(){
//           String k= "dsd";
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               String value=(String)combo2.getName();
//           }
//       });
        
       try{
           String text = text1.getText();
           int read=0;

       PreparedStatement pstm;
       ResultSet rs;
       String query = "Insert INTO msges (msg_data, sender,receiver) values (?,?,?)";
           Connection con = mysqlConnector.connect();
           pstm = con.prepareStatement(query);

            
            pstm.setString(1, text);
            pstm.setString(2, fillCombo1());
            pstm.setString(3, valuethename());
            //pstm.setInt(4, read);
            pstm.executeUpdate();
            
            
               if (fillCombo1().equals("nat")){
                   MainApp ma = new MainApp();
                   ma.setVisible(true);
                   this.dispose();
               }
               
               else if (fillCombo1().equals("aphro")){
                   MainApp2Afro ma2 = new MainApp2Afro();
                   ma2.setVisible(true);
                   this.dispose();
               }
                
               else if (fillCombo1().equals("pos")){
                   MainApp3Pos ma3 = new MainApp3Pos();
                   ma3.setVisible(true);
                   this.dispose();
               }
                else{
                    LoginPage lp = new LoginPage();
                    lp.setVisible(true);
                    this.dispose();
                }
  
 
          // System.out.println("success");
       }
       
       catch (SQLException e){
        e.printStackTrace();
    } 
       
       
    }//GEN-LAST:event_sendbuttonActionPerformed

    private void mymsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mymsgActionPerformed
        NewMsg nm = new NewMsg(fillCombo1());
        nm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mymsgActionPerformed
    
    private void fillCombo2(){
        
        //LoginPage lg = new LoginPage();
       
        
       // combo1.addItem("defetgrt4");
        
        try{
            Connection con = mysqlConnector.connect();
            
            String sql = "select * from user_details";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            String name = rs.getString("username");
           
            combo2.addItem(name);
             
            } 
       
        }catch(Exception e){
   
        } 
    
    }
  
    public String fillCombo1(){
        
        try{
            Connection con = mysqlConnector.connect();
            
            String sql = "select * from dump where id=1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
            String name = rs.getString("username_dump");
            
            combo1.addItem(name);
            
               return name;         
            }
        
        }catch(Exception e){
   
        } 
       return null;
    }
    
    
    public String valuethename(){
         String valuename = (String) combo2.getSelectedItem();
         return valuename;
    }
  
    
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
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jimage;
    private javax.swing.JButton mymsg;
    private javax.swing.JButton sendbutton;
    private javax.swing.JTextArea text1;
    // End of variables declaration//GEN-END:variables
}