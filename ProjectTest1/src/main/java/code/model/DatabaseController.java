
package code.model;

import code.loginform.LoginForm;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

/**
 *
 * @author baibu
 */
public class DatabaseController {
    
    
    private DatabaseReference mDatabase;
    private LoginForm lgf;
    private String currentID;
    private String currentUsername;
    private String currentEmail;

    
    
    // ----------------------------------------------------------------
    // DON'T GET ATTENTION TO THIS CLASS IT JUST A TEST CLASS
    // ----------------------------------------------------------------

    
    
    
    private void readData(){

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        mDatabase.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()){
                    User user = ds.getValue(User.class);
                    if (lgf.getjTextField_Login_Username().equals(user.getUsername())){
                        String currentID = user.getId_user();
                        String currentUsername = user.getUsername();
                        String currentEmail = user.getEmail();

                    }

                    
//                    jTextArea1.append(user.getEmail() + "\n");
//                    jTextArea1.append(user.getUsername() + "\n");
//                    jTextArea1.append(user.getPassword() + "\n");
//                    jTextArea1.append(user.getId_user() + "\n");
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    public String getCurrentEmail() {
        return currentEmail;
    }

    public void setCurrentEmail(String currentEmail) {
        this.currentEmail = currentEmail;
    }

    public String getCurrentID() {
        return currentID;
    }

    public void setCurrentID(String currentID) {
        this.currentID = currentID;
    }

    
}
