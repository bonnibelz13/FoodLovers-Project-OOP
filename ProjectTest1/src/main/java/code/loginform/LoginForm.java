package code.loginform;



import com.google.firebase.FirebaseApp;

import static code.connection.Connection.initFirebase;
import java.io.IOException;
import javax.swing.JFrame;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

import javax.swing.JPasswordField;
import javax.swing.JTextField;




    // ----------------------------------------------------------------
    // LOGINFORM
    // ----------------------------------------------------------------




/**
 *
 * @author baibu
 */
public class LoginForm extends javax.swing.JFrame {
    
    
    private LoginSystem loginSystem;
    
    
    
    public LoginForm() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        loginSystem = new LoginSystem();
        loginSystem.setLoginForm(this);
        
        
        
        //----------------------
        // Connect to Firebase
        //----------------------
        
        try {

            initFirebase();
        } catch (IOException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Login_Username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField_Login_Password = new javax.swing.JPasswordField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSignIn = new javax.swing.JButton();
        jLabel_Login_Message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRegisterForm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(249, 249, 249));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setText("Username");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jTextField_Login_Username.setBackground(java.awt.SystemColor.control);
        jTextField_Login_Username.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jTextField_Login_Username.setForeground(new java.awt.Color(102, 102, 255));
        jTextField_Login_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Login_UsernameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField_Login_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 251, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jPasswordField_Login_Password.setBackground(java.awt.SystemColor.control);
        jPasswordField_Login_Password.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jPasswordField_Login_Password.setForeground(new java.awt.Color(102, 102, 255));
        jPanel3.add(jPasswordField_Login_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 251, 40));

        jButtonCancel.setBackground(new java.awt.Color(216, 216, 246));
        jButtonCancel.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(102, 102, 102));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 250, 42));

        jButtonSignIn.setBackground(new java.awt.Color(138, 82, 229));
        jButtonSignIn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jButtonSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignIn.setText("Sign In");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 42));

        jLabel_Login_Message.setBackground(new java.awt.Color(255, 255, 255, 250));
        jLabel_Login_Message.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Login_Message.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel_Login_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 150, 16));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(137, 132, 132));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome back you've been missed!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 310, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 410, 380));

        jLabelRegisterForm.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabelRegisterForm.setForeground(new java.awt.Color(70, 162, 255));
        jLabelRegisterForm.setText("Create a new account now");
        jLabelRegisterForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterFormMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelRegisterForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 488, -1, 20));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Not a member?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(39, 36, 36));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hello Again!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 460, 550));

        jLabelMin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMin.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(138, 137, 137));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 24, -1));

        jLabelClose.setBackground(new java.awt.Color(255, 255, 255));
        jLabelClose.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(138, 137, 137));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 22, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\baibu\\OneDrive\\Documents\\GitHub\\OOP-Project\\ProjectTest1\\src\\main\\java\\code\\icon\\element.png")); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Login_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Login_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Login_UsernameActionPerformed

    
    
    //----------------------
    // Close LoginForm
    //----------------------
    
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    
    //----------------------
    // Minimize LoginForm
    //----------------------
    
    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    
    //-------------------------------
    // Go to RegisterForm (Sign Up)
    //-------------------------------
    
    
    private void jLabelRegisterFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterFormMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FirebaseApp.getInstance().delete();
        
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);

    }//GEN-LAST:event_jLabelRegisterFormMouseClicked

    
    //----------------------
    // Close LoginForm
    //----------------------
    
    
    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelMouseClicked

    
    //------------
    // Sign In...
    //------------
    
    
    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        loginSystem.loginUser(jTextField_Login_Username.getText(), String.valueOf(jPasswordField_Login_Password.getPassword()));

         
    }//GEN-LAST:event_jButtonSignInActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);

            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegisterForm;
    private javax.swing.JLabel jLabel_Login_Message;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_Login_Password;
    private javax.swing.JTextField jTextField_Login_Username;
    // End of variables declaration//GEN-END:variables

    
    
    //---------------------------------
    // Getter and Setter LoginForm
    //---------------------------------
    
    
    
    public JLabel getjLabel_Login_Message() {
        return jLabel_Login_Message;
    }

    public void setjLabel_Login_Message(JLabel jLabel_Login_Message) {
        this.jLabel_Login_Message = jLabel_Login_Message;
    }

    public JPasswordField getjPasswordField_Login_Password() {
        return jPasswordField_Login_Password;
    }

    public void setjPasswordField_Login_Password(JPasswordField jPasswordField_Login_Password) {
        this.jPasswordField_Login_Password = jPasswordField_Login_Password;
    }

    public JTextField getjTextField_Login_Username() {
        return jTextField_Login_Username;
    }

    public void setjTextField_Login_Username(JTextField jTextField_Login_Username) {
        this.jTextField_Login_Username = jTextField_Login_Username;
    }



}
