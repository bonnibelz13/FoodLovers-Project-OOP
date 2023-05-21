
package code;

import code.loginform.LoginForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;



public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, URISyntaxException {
        //All jframe's with Look'n Feel - Windows
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
        new LoginForm().setVisible(true);
    }
}
