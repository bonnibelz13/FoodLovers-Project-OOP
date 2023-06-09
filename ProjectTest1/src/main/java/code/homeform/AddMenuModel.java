
package code.homeform;


import code.kao.database.FoodDataBase;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddMenuModel {
    private String dishName;
    private String category;
    private List<String> ingredients;
    private String description;
    private String imagePath;
    private AddMenuGUIForm view;
    private String username;
    private FoodDataBase foodDataBase;
    
    

    public AddMenuModel() {
        ingredients = new ArrayList<>();
    }
    
    public AddMenuModel(AddMenuGUIForm view) {
        this.view = view;
        ingredients = new ArrayList<>();
    }
    public AddMenuModel(String userName, FoodDataBase fDB, AddMenuGUIForm view){
        this.view = view;
        this.username = userName;
        this.foodDataBase = fDB;
        
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    
    public void addMenuItem(String dishName, String category, String ingredients, String description, Icon foodPic) {
        DefaultTableModel model = (DefaultTableModel) view.getjTable1().getModel();
        model.addRow(new Object[]{dishName, category, ingredients, description, foodPic});
    }
    
    
    public void saveMenuToFile(String fileName) {
        JTable table = view.getjTable1();
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // บันทึกหัวตาราง
            for (int i = 0; i < columnCount; i++) {
                writer.write(model.getColumnName(i));
                if (i < columnCount - 1) {
                    writer.write(",");
                }
            }
            writer.newLine();

            // บันทึกข้อมูลแต่ละแถว
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    Object value = model.getValueAt(i, j);
                    if (value != null) {
                        writer.write(value.toString());
                    }
                    if (j < columnCount - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }

            System.out.println("Menu saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving menu to file: " + e.getMessage());
        }
    }
    
    
    public List<String[]> loadMenuFromFile(String fileName) {
        List<String[]> menuData = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                menuData.add(rowData);
            }
            

            System.out.println("Menu loaded from file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error loading menu from file: " + e.getMessage());
        }

        return menuData;
    }
    
}