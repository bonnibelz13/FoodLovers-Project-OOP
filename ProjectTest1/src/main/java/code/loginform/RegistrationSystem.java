
package code.loginform;



import code.model.User;
import static code.connection.Connection.generateUUID;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;




    // ----------------------------------------------------------------
    // REGISTRATIONSYSTEM
    // ----------------------------------------------------------------




public class RegistrationSystem {
    private DatabaseReference mDatabase;
    private RegisterForm rgf;

    public void setRegisterForm(RegisterForm rgf) {
        this.rgf = rgf;
    }
    public static boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isUsernameValid(String username) {
        String usernameRegex = "^[A-Za-z0-9_]+$";
        Pattern pattern = Pattern.compile(usernameRegex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    private void registerNewUser(String email, String username, String password, String conpassword){
        
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        String id = generateUUID();

        User user = new User();
        user.setId_user(id);
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        user.setConPassword(conpassword);
        
        mDatabase.child(id).setValue(user, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError error, DatabaseReference ref) {
                
            }
        });
        
    }
    void checkData(String email, String username, String password, String conpassword) {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        

        Query emailQuery = mDatabase.orderByChild("email").equalTo(email);
        emailQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    // email already exists in the database
                    // handle the error or show an error message to the user
                    rgf.getjLabel_Email_Message().setVisible(true);
                    rgf.getjLabel_Email_Message().setText("Email already exists!");
                } else {
                    // email does not exist in the database, proceed to check username
                    Query usernameQuery = mDatabase.orderByChild("username").equalTo(username);
                    usernameQuery.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            if (dataSnapshot.exists()) {
                                // username already exists in the database
                                // handle the error or show an error message to the user
                                rgf.getjLabel_Username_Message().setVisible(true);
                                rgf.getjLabel_Username_Message().setText("Username already exists!");
                            } else {
                                // username does not exist in the database, proceed to register the new user
                                registerNewUser(email, username, password, conpassword);
                                JOptionPane.showMessageDialog(null, "Successfully!");
                                rgf.getjTextField_Email().setText("");
                                rgf.getjTextField_Username().setText("");
                                rgf.getjPasswordtField_Password().setText("");
                                rgf.getjPasswordField_ConfirmPassword().setText("");

                                rgf.getjLabel_Email_Message().setText("");
                                rgf.getjLabel_Username_Message().setText("");
                                rgf.getjLabel_Password_Message().setText("");
                                rgf.getjLabel_ConPassword_Message().setText("");
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


    
    
    public static void main(String[] args) {
        String email = "example@example.com";
        String username = "user_name123";

        if (isEmailValid(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }

        if (isUsernameValid(username)) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Username is not valid");
        }
    }
}