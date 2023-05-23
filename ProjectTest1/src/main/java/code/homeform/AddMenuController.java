
package code.homeform;

import code.kao.database.FoodDataBase;
import code.kao.database.FoodRecipe;
import code.model.User;
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
import javax.swing.table.TableCellRenderer;


public class AddMenuController {
    private AddMenuModel addMenuModel;
    private AddMenuGUIForm view;
    private JTable table;
    private List<String> ingredients;
    private User user;
    private FoodDataBase fDB;
    private DefaultTableModel tableModel;

    public AddMenuController(AddMenuModel addMenuModel, AddMenuGUIForm view) {
        this.addMenuModel = addMenuModel;
        this.view = view;
        this.table = view.getjTable1();
    }
    
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    //------------------------
    // Add an Ingredient.
    //------------------------
    
    public void AddIngredient(String ingredient){

        if (isValid(ingredient)){
            addMenuModel.getIngredients().add(ingredient);
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
  
    public void AddMenu(FoodDataBase fDB, String userName) {
        
        ListModel<String> listModel = view.getjList1_Ingredients().getModel();

        String dishName = view.getjTextField1_DishName().getText();
        String category = view.getjComboBox1_Category().getSelectedItem().toString();
        String description = view.getjTextArea1_Discription().getText();
        Icon foodIcon = view.getjLabel2_FoodPic().getIcon();
        ImageIcon foodImageIcon = (ImageIcon) foodIcon;
  
        
        FoodRecipe food = new FoodRecipe();

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
            

        // Check if image is uploaded
        if (foodImageIcon == null) {
            JOptionPane.showMessageDialog(null, "Please upload an image.");
            return; // ออกจากเมธอด AddMenu() เพื่อหยุดการดำเนินการต่อ
        }

            // Add menu item to the table in MenuTable
//            DefaultTableModel model = (DefaultTableModel) table.getModel();
//            model.addRow(new Object[]{dishName, category, ingredients, description, foodImageIcon});
//
//            // Save the menu item to file
//            addMenuModel.saveMenuToFile("data.csv");
            
            // Save to FoodDataBase.
            
            FoodRecipe foodRecipe = new FoodRecipe(dishName, view.getjList1_Ingredients(), foodImageIcon, category, description);
            
            fDB.addFoodDataBase(userName, foodRecipe);

            
            tableModel = (DefaultTableModel) view.getjTable1().getModel();
            tableModel.addRow(new Object[]{foodRecipe.getName(), foodRecipe.getCategory(), foodRecipe.getIngredientDetail(), foodRecipe.getDescription(), foodRecipe.getPicture()});
            
            
            // show JOptionPane added menu.
            JOptionPane.showMessageDialog(null, "New menu added.");
            
            // Render pic to table.
            ImageRenderer imageRenderer = new ImageRenderer();
            view.getjTable1().getColumnModel().getColumn(4).setCellRenderer(imageRenderer);
            view.getjTable1().getColumnModel().getColumn(4).setPreferredWidth(60);
            view.getjTable1().setRowHeight(60);
            
            try (FileOutputStream fout = new FileOutputStream("FoodDataBase.dat");
                ObjectOutputStream oout = new ObjectOutputStream(fout)){
                    oout.writeObject(fDB);
                    System.out.println("Save Data Successfully");
            }
            catch (IOException ex){
                ex.printStackTrace();
                System.out.println("cannot save.");
            }
            finally {
                System.out.println("Done.");
            }

            // Export images in the table
            view.revalidate();
            view.repaint();
            

        } else {
            JOptionPane.showMessageDialog(null, "Please enter your dish name.");
        }
    }
    
      
    //--------------------------------------------------------------------------------------------
    // Delete Menu in Table. And del it in File "data.csv" / del the picture in folder "pics".
    //--------------------------------------------------------------------------------------------
    
    public void DeleteMenu(int selectedRow, FoodDataBase fDB, String userName) {
        DefaultTableModel model = view.getTableModel();
        FoodRecipe food = (FoodRecipe) fDB.getUserRecipe(userName).get(selectedRow);
        
        fDB.removeFoodDataBase(userName, food);

        if (selectedRow != -1) { // ตรวจสอบว่ามีแถวที่เลือกหรือไม่
            model.removeRow(selectedRow); // ลบแถวที่เลือกจากตาราง
            
            // อัปเดตไฟล์ CSV
//            String fileName = "data.csv";
//            addMenuModel.saveMenuToFile(fileName);

            System.out.println("Deleted the menu.");
        } else {
            // แสดงข้อความหรือทำอย่างไรก็ได้เมื่อไม่มีแถวที่เลือก
            JOptionPane.showMessageDialog(null, "Please select the menu.");
        }
        
        try (FileOutputStream fout = new FileOutputStream("FoodDataBase.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout)){
                oout.writeObject(fDB);
                System.out.println("Import Data Successfully");
        }
        catch (IOException ex){
            System.out.println("cannot save.");
        }
        finally {
            System.out.println("Done.");
        }
        
    }
    
    public void loadMenuFromFile() {
        // Load menu data from file
        List<String[]> menuData = addMenuModel.loadMenuFromFile("data.csv");
        
        // Update the table with the loaded menu data
        for (String[] rowData : menuData) {
            view.updateTable(rowData);
        }
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
