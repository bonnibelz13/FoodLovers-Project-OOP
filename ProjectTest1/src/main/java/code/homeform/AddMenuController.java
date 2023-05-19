package code.homeform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenuController implements ActionListener {
    private AddMenuGUIForm view;
    private AddMenuModel model;
    private boolean isOK;

    public AddMenuController() {
        this.view = new AddMenuGUIForm();
        this.model = new AddMenuModel();
        view.getjButton1_AddMenu().addActionListener(this);
        this.model = new AddMenuModel();
        initializeGUI();
   
        
          
    }

    public static void main(String[] args) {
        new AddMenuController();
    }

    public boolean isOK() {
        return isOK;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getjButton1_AddMenu())){
         // Create newFood object with data from text fields, including name, price, and type
                Food newFood = new Food(view.getjTextField1_DishName().getText(),
                        view.getjTextArea1_Discription().getText(), (String) view.getjComboBox1_Category().getSelectedItem());

                // Set isOK to true and close the dialog
                //isOK = true;
                view.dispose();
        }
    }
    private void initializeGUI() {
        view = new AddMenuGUIForm();
        view.getjButton1_AddMenu().addActionListener(this);
        view.setVisible(true);
    }

    

    
}
