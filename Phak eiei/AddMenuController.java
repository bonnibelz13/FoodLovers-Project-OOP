import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenuController implements ActionListener {
    private AddMenuGUI view;
    private AddMenuModel model;
    

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
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getBtnAddMenu())){
         // Create newFood object with data from text fields, including name, price, and type
                Food newFood = new Food();
                newFood.setNameFood(view.getTfName().getText());
                newFood.setFoodType((String) view.getCategoryBox().getSelectedItem());
                view.getFrame().dispose();
            
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
    private void initializeGUI() {
        view = new AddMenuGUI();
        view.getBtnAddMenu().addActionListener(this);
        view.setVisible(true);
    }

    

    
}
