package code.phak;

import code.phak.AddMenuModel;
import code.phak.AddMenuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class AddMenuController implements ActionListener,WindowListener {
    private AddMenuGUI view;
    private AddMenuModel model;
    private boolean isOK;

    public AddMenuController() {
        this.model = new AddMenuModel();
        initializeGUI();
        view.getFrame().addWindowListener(this);
        
        
        
          
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            { 
                AddMenuGUI show = new AddMenuGUI();
                show.setVisible(true);
            }
        });
    }
    

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getBtnAddMenu())){
         // Create newFood object with data from text fields, including name, type, ingredients and method
                Food newFood = new Food();
                newFood.setNameFood(view.getTfName().getText()); // Name
                newFood.setFoodType((String) view.getCategoryBox().getSelectedItem()); // Type
                newFood.setFoodIngd(view.getIngredientList().getSelectedValuesList()); //Ingredients
                newFood.setFoodMethod(view.getTfIngredientDetail().getText()); //Method
                model.getFoodList().add(newFood);//
                model.saveData();
                
                // set boolean isOK= true
                isOK = true;
                view.getFrame().dispose();
                // when press Add Menu close JFrame and show JOptopnPane
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
    private void initializeGUI() {
        view = new AddMenuGUI();
        view.getBtnAddMenu().addActionListener(this);
        view.setVisible(true);
    }


    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
         model.saveData();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isOK() {
        return isOK;
    }
    


    

    
}