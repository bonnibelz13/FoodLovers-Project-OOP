
package code.connection;


import com.google.auth.oauth2.GoogleCredentials;



import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.UUID;


import java.util.logging.Level;
import java.util.logging.Logger;




    // ----------------------------------------------------------------
    // CONNECTION TO DATABASE( FIREBASE )
    // ----------------------------------------------------------------




public class Connection {


    
    public static void initFirebase() throws IOException{
        FileInputStream serviceAccount = null;
        
        try {
            serviceAccount = new FileInputStream("foodlovers-12955-firebase-adminsdk-668fn-1085e4ca7e.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                      .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                      .setDatabaseUrl("https://foodlovers-12955-default-rtdb.asia-southeast1.firebasedatabase.app")
                      .build();

            FirebaseApp.initializeApp(options);            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                serviceAccount.close();
            } catch (IOException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
    protected void onResume()
    {
        this.onResume();

        if (FirebaseDatabase.getInstance() != null)
        {
            FirebaseDatabase.getInstance().goOnline();
        }
}

    public void onPause() {

        this.onPause();

        if(FirebaseDatabase.getInstance()!=null)
        {
            FirebaseDatabase.getInstance().goOffline();
        }
}
}
