import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenuController implements ActionListener {
    private AddMenuGUI view;
    private AddMenuModel model;
    private boolean isOK;

    public AddMenuController() {
        this.view = new AddMenuGUI();
        this.model = new AddMenuModel();
        view.getjButton1().addActionListener(this);
        view.getjButton2().addActionListener(this);
        view.getjButton3().addActionListener(this);

        
          
    }

    public static void main(String[] args) {
        new AddMenuController();
    }

    public boolean isOK() {
        return isOK;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         // Create newFood object with data from text fields, including name, price, and type
                Food newFood = new Food(view.getjTextField1().getText(),
                        view.getjTextArea1().getText(), (String) view.getjComboBox1().getSelectedItem());

                // Set isOK to true and close the dialog
                //isOK = true;
                view.dispose();
    }

    

    
}
