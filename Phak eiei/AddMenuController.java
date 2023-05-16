import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenuController implements ActionListener {
    private AddMenuGUI view;
    private AddMenuModel model;
    private boolean isOK;

    public AddMenuController() {
        this.view = new AddMenuGUI();
        this.model = new AddMenuModel();
        view.getBtnAddMenu().addActionListener(this);
   
        
          
    }

    public static void main(String[] args) {
        new AddMenuController();
    }

    public boolean isOK() {
        return isOK;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getBtnAddMenu())){
         // Create newFood object with data from text fields, including name, price, and type
                Food newFood = new Food(view.getTfName().getText(),
                        view.getAreaMethod().getText(), (String) view.getCategoryBox().getSelectedItem());

                // Set isOK to true and close the dialog
                //isOK = true;
                view.dispose();
        }
    }

    

    
}
