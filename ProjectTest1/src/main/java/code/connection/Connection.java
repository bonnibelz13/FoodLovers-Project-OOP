
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
//    public static void initFirebase() {
//        FileInputStream refreshToken = null;
//        try {
//            refreshToken = new FileInputStream("C:\\\\Users\\\\baibu\\\\OneDrive\\\\Documents\\\\NetBeansProjects\\\\ProjectTest1\\\\foodlovers-12955-firebase-adminsdk-668fn-1085e4ca7e.json");
//            FirebaseOptions options = new FirebaseOptions.Builder()
//                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
//                    .setDatabaseUrl("https://foodlovers-12955-default-rtdb.asia-southeast1.firebasedatabase.app")
//                    .build();
//            FirebaseApp.initializeApp(options);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                refreshToken.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//    public static String generateUUID() {
//        return UUID.randomUUID().toString();
//    }
    
//    public static void initFirebase() throws IOException{
//        FileInputStream serviceAccount =
//          new FileInputStream("C:\\Users\\baibu\\OneDrive\\Documents\\NetBeansProjects\\ProjectTest1\\foodlovers-12955-firebase-adminsdk-668fn-1085e4ca7e.json");
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//          .setDatabaseUrl("https://foodlovers-12955-default-rtdb.asia-southeast1.firebasedatabase.app")
//          .build();
//        
//        FirebaseApp.initializeApp(options);
//    }
//    public static String generateUUID() {
//        return UUID.randomUUID().toString();
//    }
//}

//    public static Firestore db = null;
//    
//    public static void initFirebase() throws FileNotFoundException, IOException, URISyntaxException{
//        InputStream serviceAccount = new FileInputStream(new Common().getServiceAccount());
//        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(credentials)
//                .build();
//
//        FirebaseApp.initializeApp(options);
//        Common.db = FirestoreClient.getFirestore();
//    }
//    
//    public File getServiceAccount() throws URISyntaxException{
//        ClassLoader classLoader = getClass().getClassLoader();
//        URL resource = classLoader.getResource("C:\\Users\\baibu\\OneDrive\\Documents\\NetBeansProjects\\ProjectTest1\\foodloversproject-3d99f-firebase-adminsdk-m8njd-913ffffe87.json");
//        if (resource == null){
//            throw new IllegalArgumentException("File not found!" + resource.toURI());
//        } else {
//            return new File(resource.toURI());
//        }
//    }

//    public static void initFirebase() {
//        FileInputStream refreshToken = null;
//        try {
//            FileInputStream serviceAccount =
//              new FileInputStream("foodlovers-12955-firebase-adminsdk-668fn-b0315b51c0.json");
//
//            FirebaseOptions options = new FirebaseOptions.Builder()
//              .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//              .build();
//
//            FirebaseApp.initializeApp(options);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                refreshToken.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    public static String generateUUID() {
//        return UUID.randomUUID().toString();
//    }
//}









//public class Common {
//    
//    static Firestore bd;
//    
//    public static void initFirebase() {
//        FileInputStream refreshToken = null;
//        try {
//            refreshToken = new FileInputStream("foodloversproject-3d99f-firebase-adminsdk-m8njd-fc82b80af8.json");
//            FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.getApplicationDefault())
//                .setProjectId("<foodloversproject-3d99f>")
//                .build();
//
//            FirebaseApp.initializeApp(options);
//            bd = FirestoreClient.getFirestore();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                refreshToken.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    public static boolean insertData(
//            String collect,
//            String doc,
//            Map<String, Object> data) {
//        try {
//            DocumentReference docRef = bd.collection(collect).document(doc);
//            ApiFuture<WriteResult> result = docRef.set(data);
//            System.out.println("Update time : " + result.get().getUpdateTime());
//            
//            return true;
//        } catch (Exception ex){
//            
//        }
//        return false;
//    }
//    public static String generateUUID() {
//        return UUID.randomUUID().toString();
//    }
//}
//    public static void InitFirebase(){
//        FileInputStream refreashToken = new FileInputStream("path/to/serviceAccountKey.json");
//        try {
//            refreashToken = new FileInputStream(new Firebase().getServiceAccount());
//            FirebaseOptions options = new FirebaseOption.Builder()
//                    .setCredentials(GoogleCredentials.fromStream(refreashToken))
//                    .setDatabaseUrl("")
//                    .build();
//            FirebaseApp.initializeApp(options);
//        } catch (FileNotFoundException ex){
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex){
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//       } finally {
//            try {
//                refreshToken.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Conncetion.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//            .build();
//
//        FirebaseApp.initializeApp(options);
//    }

