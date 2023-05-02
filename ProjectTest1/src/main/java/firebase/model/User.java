
package firebase.model;


public class User {
    private String id_user;
    private String username;
    private String email;
    private String password;
    private String conpassword;
    
    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public String getId_user() {
        return id_user;
    }
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    public User(String username, String email, String password, String conpassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.conpassword = conpassword;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getConPassword(){
        return conpassword;
    }
    public void setConPassword(String conpass){
        this.conpassword = conpassword;
    }
}
