
package code.loginform;

import code.homeform.HomeMenuView;

import code.model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




    // ----------------------------------------------------------------
    // LOGINSYSTEM
    // ----------------------------------------------------------------





/**
 *
 * @author baibu
 */
public class LoginSystem {
    private DatabaseReference mDatabase;
    private LoginForm lgf;


    
    public void setLoginForm(LoginForm lgf) {
        this.lgf = lgf;
    }


    
    void loginUser(String username, String password) {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");

        Query usernameQuery = mDatabase.orderByChild("username").equalTo(username);
        usernameQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                        User user = userSnapshot.getValue(User.class);
                        if (user.getPassword().equals(password)) {
                            // username and password are correct, log in the user
                            // handle the success or show a success message to the user
                            JOptionPane.showMessageDialog(null, "Login Successful!");

                            user.setCurrentUser(username);
                            
                            lgf.setVisible(false);
                            HomeMenuView homeMenu = new HomeMenuView();
                            homeMenu.setVisible(true);
                            homeMenu.pack();
                            homeMenu.setLocationRelativeTo(null);
                            homeMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            homeMenu.getjLabel_User().setText(username);
                            


                        } else {
                            // password is incorrect, handle the error or show an error message to the user
                            lgf.getjLabel_Login_Message().setText("Incorrect password!");
                        }
                    }
                } else {
                    // username does not exist in the database, handle the error or show an error message to the user
                    lgf.getjLabel_Login_Message().setText("Username does not exist!");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // handle the error or show an error message to the user
                JOptionPane.showMessageDialog(null, "Database error occurred!");
            }

            private void readData() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
}
