
package code.homeform;

import code.tableData.ImageRenderer;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;


public class AddMenuController {
    private AddMenuModel addMenuModel;
    private AddMenuGUIForm view;
    private JTable table;

    public AddMenuController(AddMenuModel addMenuModel, AddMenuGUIForm view) {
        this.addMenuModel = addMenuModel;
        this.view = view;
        this.table = view.getMenuTable().getjTable1();
    }
    
    //------------------------
    // Add an Ingredient.
    //------------------------
    
    public void AddIngredient(){
        String newIngredient = view.getjTextField2_Ingredients().getText();
        if (isValid(newIngredient)){
            addMenuModel.getIngredients().add(newIngredient);
            view.updateIngredientList(addMenuModel.getIngredients());
            view.getjTextField2_Ingredients().setText("");
        }

    }
    
    //------------------------
    // Delete an Ingredient.
    //------------------------
    
    public void DeleteIngredient(){
        String selectedIngredient = view.getjList1_Ingredients().getSelectedValue();
        if (selectedIngredient != null){
            addMenuModel.getIngredients().remove(selectedIngredient);
            view.updateIngredientList(addMenuModel.getIngredients());
        }
    }
    
    //------------------------
    // Upload pic.
    //------------------------
    
    public void UploadPicture() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 supported extensions", "jpg", "jpeg", "gif", "png");
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(null);

        if (selected == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String getSelectedImage = file.getAbsolutePath();
            ImageIcon imIco = new ImageIcon(getSelectedImage);

            // img to fit the jlabel
            Image imFit = imIco.getImage();
            Image imgFit = imFit.getScaledInstance(view.getjLabel2_FoodPic().getWidth(), view.getjLabel2_FoodPic().getHeight(), Image.SCALE_SMOOTH);
            view.getjLabel2_FoodPic().setIcon(new ImageIcon(imFit));

            // Update the image path in the AddMenuModel
            addMenuModel.setImagePath(getSelectedImage);
        }
    }
    
    //--------------------------------------------------------------------------------------------
    // Add new Menu to Table. And export it to File "data.csv" / export picture to folder "pics".
    //--------------------------------------------------------------------------------------------
  
    public void AddMenu() {
        ListModel<String> listModel = view.getjList1_Ingredients().getModel();

        String dishName = view.getjTextField1_DishName().getText();
        String category = view.getjComboBox1_Category().getSelectedItem().toString();
        String description = view.getjTextArea1_Discription().getText();
        Icon foodIcon = view.getjLabel2_FoodPic().getIcon();

        StringBuilder ingredientsBuilder = new StringBuilder();
        for (int i = 0; i < listModel.getSize(); i++) {
            String item = listModel.getElementAt(i);
            ingredientsBuilder.append(item);
            if (i < listModel.getSize() - 1) {
                ingredientsBuilder.append(", ");
            }
        }

        String ingredients = ingredientsBuilder.toString();

        // Check dish name is exist
        if (isValid(dishName)) {
            // Convert Icon to ImageIcon
            ImageIcon foodImageIcon = null;
            if (foodIcon instanceof ImageIcon) {
                foodImageIcon = (ImageIcon) foodIcon;
            }

        // Check if image is uploaded
        if (foodImageIcon == null) {
            JOptionPane.showMessageDialog(null, "Please upload an image.");
            return; // ออกจากเมธอด AddMenu() เพื่อหยุดการดำเนินการต่อ
        }

            // Add menu item to the table in MenuTable
            DefaultTableModel model = (DefaultTableModel) MenuTableUI.getjTable1().getModel();
            model.addRow(new Object[]{dishName, category, ingredients, description, foodImageIcon});

            // Save the menu item to file
            addMenuModel.saveMenuToFile("data.csv");

            // Export images in the table
            addMenuModel.exportImagesInTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter your dish name.");
        }
    }

    //--------------------------------------------------------------------------------------------
    // Delete Menu in Table. And del it in File "data.csv" / del the picture in folder "pics".
    //--------------------------------------------------------------------------------------------

    public void DeleteMenu(){
        
    }


    //--------------------------------------------------------
    // This Method is Checking Text in Ingredient TextField.
    //--------------------------------------------------------
    
    public static boolean isValid(String txt) {
        
        // not allow the first txt to be "".
        String ingredientRegex = "^[^\\s][A-Za-z0-9(/\\.)\\s]+$";
        Pattern pattern = Pattern.compile(ingredientRegex);
        Matcher matcher = pattern.matcher(txt);
        return matcher.matches();
    }
}
