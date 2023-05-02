package firebase.menu;




import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import firebase.model.User;
import static firebase.util.Common.generateUUID;
import static firebase.util.Common.initFirebase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import firebase.util.Common;

public class RegisterForm extends javax.swing.JFrame {
    private DatabaseReference mDatabase;
    
    public RegisterForm() {
        initComponents();
        
        
        try {
            //        status_request_lbl.setVisible(false);
            initFirebase();
        } catch (IOException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Creates new form RegisterForm
     */
//    public RegisterForm() {
//        initComponents();
//        Connect();
//    }
//    
//    Connection con;
//    PreparedStatement pst;
//    ResultSet rs;
//    
//    
//    public void Connect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/user_register", "root", "");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelRegister1 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordtField_Password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField_ConfirmPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabelLoginForm = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jLabel_Username_Message = new javax.swing.JLabel();
        jLabel_Password_Message = new javax.swing.JLabel();
        jLabel_ConPassword_Message = new javax.swing.JLabel();
        status_request_lbl = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Email_Message = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabelRegister = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(238, 20, 75));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegister1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRegister1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabelRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister1.setText("REGISTER");
        jPanel2.add(jLabelRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 193, -1));

        jTextField_Username.setBackground(java.awt.SystemColor.control);
        jTextField_Username.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 204, 251, 36));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 172, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 268, -1, -1));

        jPasswordtField_Password.setBackground(java.awt.SystemColor.control);
        jPasswordtField_Password.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jPanel2.add(jPasswordtField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 300, 251, 34));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 362, -1, -1));

        jPasswordField_ConfirmPassword.setBackground(java.awt.SystemColor.control);
        jPasswordField_ConfirmPassword.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jPanel2.add(jPasswordField_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 388, 251, 34));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already a member?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, 20));

        jLabelLoginForm.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabelLoginForm.setText("Sign In ");
        jLabelLoginForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLoginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginFormFormMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelLoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, 20));

        jButtonSignUp.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSignUp.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSignUpMouseClicked(evt);
            }
        });
        jPanel2.add(jButtonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 458, 88, 47));
        jPanel2.add(jLabel_Username_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 246, 251, 16));
        jPanel2.add(jLabel_Password_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 340, 251, 16));
        jPanel2.add(jLabel_ConPassword_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 428, 251, 16));
        jPanel2.add(status_request_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 523, -1, -1));

        jLabel_Email.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Email.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("E-mail");
        jPanel2.add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 70, -1, -1));
        jPanel2.add(jLabel_Email_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 150, 251, 16));

        jTextField_Email.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Email.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jPanel2.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 102, 251, 36));

        jLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(239, 32, 84));
        jLabelRegister.setText("Create a new account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRegister)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelClose.setBackground(new java.awt.Color(255, 255, 255));
        jLabelClose.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(153, 153, 153));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMin.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(153, 153, 153));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FirebaseApp.getInstance().delete();
//        this.setVisible(false);
        
//        this.dispose();
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jLabelLoginFormFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginFormFormMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FirebaseApp.getInstance().delete();
//        this.setVisible(false);
//        this.dispose();
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        LoginForm lgf = new LoginForm();
//        lgf.setVisible(true);
    }//GEN-LAST:event_jLabelLoginFormFormMouseClicked

// function to check if the username already exist in database table
//public boolean checkUsername(String username)
//{
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//    boolean checkUser = false;
//    String query = "SELECT * FROM `register` WHERE `username` =?";
//    
//    try {
//        ps = con.prepareStatement(query);
//        ps.setString(1, username);
//        rs = ps.executeQuery();
//        
//        if(rs.next())
//        {
//            checkUser = true;
//        }
//    } catch (SQLException ex) {
//        Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//    } finally {
//        try {
//            if (rs != null) {
//                rs.close();
//            }
//            if (ps != null) {
//                ps.close();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//     return checkUser;
//}
    private void jButtonSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignUpMouseClicked
        String email = jTextField_Email.getText();
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordtField_Password.getPassword());
        String conpassword = String.valueOf(jPasswordField_ConfirmPassword.getPassword());
        
//        jTextField_Username.setText(jTextField_Username.getText());
//        jPasswordtField_Password.setText(String.valueOf(jPasswordtField_Password.getPassword()));
//        jPasswordField_ConfirmPassword.setText(String.valueOf(jPasswordField_ConfirmPassword.getPassword()));
        jLabel_Email_Message.setText("Please enter email");
        jLabel_Username_Message.setText("Please enter username.");
        jLabel_Password_Message.setText("Please enter password.");
        
        jLabel_Email_Message.setVisible(false);
        jLabel_Username_Message.setVisible(false);
        jLabel_Password_Message.setVisible(false);
        jLabel_ConPassword_Message.setVisible(false);
        
        if (email.trim().isEmpty()){
            jLabel_Email_Message.setVisible(true);
//            JOptionPane.showMessageDialog(null, "Please Enter Username");

        } if (username.trim().isEmpty()){
            jLabel_Username_Message.setVisible(true);
//            JOptionPane.showMessageDialog(null, "Please Enter Password");
//
//            
//            jLabel_Password_Message.setText("");
//            jLabel_ConPassword_Message.setText("");
            
        } if (password.trim().isEmpty()){
            jLabel_Password_Message.setVisible(true);
//            JOptionPane.showMessageDialog(null, "Please Enter Password");
//
//            jLabel_Username_Message.setText("");
//            jLabel_Password_Message.setText("");
//            jLabel_ConPassword_Message.setText("");


//        } if (username.trim().isEmpty()){
//            jLabel_Username_Message.setText("Please enter username.");
////            JOptionPane.showMessageDialog(null, "Please Enter Password");
//
//            jLabel_Email_Message.setText("");
//            jLabel_Password_Message.setText("");
//            jLabel_ConPassword_Message.setText("");

//
//        } if (password.trim().isEmpty()){
//            jLabel_Password_Message.setText("Please enter password.");
////            JOptionPane.showMessageDialog(null, "Please Enter Password");
//
//            jLabel_Username_Message.setText("");
//            jLabel_ConPassword_Message.setText("");


        } else if (!password.equals(conpassword)){
            jLabel_ConPassword_Message.setVisible(true);
            jLabel_ConPassword_Message.setText("The passwords do not match.");

            
//            JOptionPane.showMessageDialog(null, "Passwords don't Match");



//        } else if (checkUsername(username)){
//            jLabel_Username_Message.setText("The username already exist.");
////            JOptionPane.showMessageDialog(null, "This Username Already Exist");



        }else if (!email.trim().isEmpty() && !username.trim().isEmpty() && !password.trim().isEmpty() && (password.equals(conpassword))){
            checkData(jTextField_Email.getText(), jTextField_Username.getText(), String.valueOf(jPasswordtField_Password.getPassword()), String.valueOf(jPasswordField_ConfirmPassword.getPassword()));
//            registerNewUser(jTextField_Email.getText(), jTextField_Username.getText(), String.valueOf(jPasswordtField_Password.getPassword()), String.valueOf(jPasswordField_ConfirmPassword.getPassword()));

                    




//            try {
//                // TODO add your handling code here:
////                pst = con.prepareStatement("INSERT INTO register(username, password)VALUES(?,?)");
////                pst.setString(1, username);
////                pst.setString(2, password);
//
//                int k;
//                k = registerNewUser(jTextField_Email.getText(), jTextField_Username.getText(), String.valueOf(jPasswordtField_Password.getPassword()), String.valueOf(jPasswordField_ConfirmPassword.getPassword()));
//
//                if (k==1){
//                    JOptionPane.showMessageDialog(this, "Successfully!");
//                    jTextField_Username.setText("");
//                    jPasswordtField_Password.setText("");
//                    jPasswordField_ConfirmPassword.setText("");
//                    
//                    jLabel_Username_Message.setText("");
//                    jLabel_Password_Message.setText("");
//                    jLabel_ConPassword_Message.setText("");
//                    
//                }else{
//                    JOptionPane.showMessageDialog(this, "Registeration Failed!");
//
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLoginForm;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelRegister1;
    private javax.swing.JLabel jLabel_ConPassword_Message;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Email_Message;
    private javax.swing.JLabel jLabel_Password_Message;
    private javax.swing.JLabel jLabel_Username_Message;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_ConfirmPassword;
    private javax.swing.JPasswordField jPasswordtField_Password;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JLabel status_request_lbl;
    // End of variables declaration//GEN-END:variables

    private void registerNewUser(String email, String username, String password, String conpassword){

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        String id = generateUUID();

        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        user.setConPassword(conpassword);
        
        mDatabase.child(generateUUID()).setValue(user, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                
            }
        });
    }
    private void checkData(String email, String username, String password, String conpassword) {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");

        Query emailQuery = mDatabase.orderByChild("email").equalTo(email);
        emailQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    // email already exists in the database
                    // handle the error or show an error message to the user
                    jLabel_Email_Message.setVisible(true);
                    jLabel_Email_Message.setText("Email already exists!");
                } else {
                    // email does not exist in the database, proceed to check username
                    Query usernameQuery = mDatabase.orderByChild("username").equalTo(username);
                    usernameQuery.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            if (dataSnapshot.exists()) {
                                // username already exists in the database
                                // handle the error or show an error message to the user
                                jLabel_Username_Message.setVisible(true);
                                jLabel_Username_Message.setText("Username already exists!");
                            } else {
                                // username does not exist in the database, proceed to register the new user
                                registerNewUser(email, username, password, conpassword);
                                JOptionPane.showMessageDialog(null, "Successfully!");
                                jTextField_Email.setText("");
                                jTextField_Username.setText("");
                                jPasswordtField_Password.setText("");
                                jPasswordField_ConfirmPassword.setText("");


                                jLabel_Email_Message.setText("");
                                jLabel_Username_Message.setText("");
                                jLabel_Password_Message.setText("");
                                jLabel_ConPassword_Message.setText("");
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                            // handle the error or show an error message to the user
                            System.out.println(databaseError.getDetails());
                        }
                    });
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // handle the error or show an error message to the user
                System.out.println(databaseError.getDetails());
            }
        });
    }

}

        
//        mDatabase.setValue(user, new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError error, DatabaseReference ref) {
////                status_request_lbl.setVisible(true);
////                status_request_lbl.setText("Finish");
//
//            }
//        });
//    }




