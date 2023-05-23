
package code.loginform;




//import code.kao.*;

import code.homeform.HomeMenuView;
import code.kao.database.FoodDataBase;
import code.model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
    private FoodDataBase foodDataBase;


    
    public void setLoginForm(LoginForm lgf) {
        this.lgf = lgf;
    }

    
    //------------------------------------
    // Sign In User to System - Firebase.-
    //------------------------------------

    
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
                            
                            //------------------------------------------------------------
                            // username and password are correct, login the user.
                            // handle the success or show a success message to the user.
                            //------------------------------------------------------------

                            JOptionPane.showMessageDialog(null, "Login Successful!");

                            
                            // print user's info.
                            System.out.println(user.getUsername());
                            System.out.println(user.getEmail());
                            System.out.println(user.getId_user());
                            
                            
                            
                            
                            
                            
                            lgf.dispose();
                            
                            // open HomeMenuView.


                            try (FileInputStream fin = new FileInputStream("FoodDataBase.dat");
                                 ObjectInputStream oin = new ObjectInputStream(fin)){
                                foodDataBase = (FoodDataBase) oin.readObject();

                                System.out.println("Import Data Successfully");
                            }
                            catch (IOException | ClassNotFoundException ex){
                                foodDataBase = new FoodDataBase();
                                System.out.println("Data not found. Create New DataBase Successfully.");
                            }
                            finally {
                                System.out.println("Done.");
                            }
                            
                            new HomeMenuView(foodDataBase, username).setVisible(true);
                            
                            
                            System.out.println("hi");
                            
//                            HomeMenuView homeMenu = new HomeMenuView();
//                            homeMenu.setVisible(true);
//                            homeMenu.pack();
//                            homeMenu.setLocationRelativeTo(null);
//                            homeMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            
                            
                            // set username on HomeMenuView.
//                            homeMenu.getjLabel_User().setText(username);
                            
                            
                            // set user info.
                            user.setUsername(username);
                            user.setPassword(password);
                            user.setEmail(user.getEmail());
                            user.setId_user(user.getId_user());
                            
                          
                            
                            
                            break;

                        } else {
                            
                            //--------------------------------------------------------------------------------------
                            // password is incorrect, handle the error or show an error message to the user.
                            //--------------------------------------------------------------------------------------
                            
                            lgf.getjLabel_Login_Message().setText("Incorrect password!");
                        }
                    }
                } else {
                    
                    //-----------------------------------------------------------------------------------------------------
                    // username does not exist in the database, handle the error or show an error message to the user.
                    //-----------------------------------------------------------------------------------------------------
                    
                    lgf.getjLabel_Login_Message().setText("Username does not exist!");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                
                //--------------------------------------------------------------
                // handle the error or show an error message to the user.
                //--------------------------------------------------------------
                
                JOptionPane.showMessageDialog(null, "Database error occurred!");
            }
        });
    }
}
