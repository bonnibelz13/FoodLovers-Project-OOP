package code.phak;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;


//Model = to handle the data and logic

public class AddMenuModel {
    
    
    private ArrayList<Food> foodList = new ArrayList<Food>();;
    private Food food;
    private File file;
    
    private AddMenuGUI view;
     
    
    public AddMenuModel(AddMenuGUI view) {
        this.view = view;
        
        File file = new File("FoodData.data"); // สร้างออบเจกต์ File เพื่อตรวจสอบไฟล์ "FoodData.data"
        if (file.exists()) { // ตรวจสอบว่าไฟล์ "FoodData.data" มีอยู่หรือไม่
            loadData();
        }
    }
    
       // บันทึกข้อมูลลงในไฟล์ "FoodData.data" โดยใช้ ObjectOutputStream เพื่อเขียน object
        // List ลงไปในไฟล์ หลังจากนั้นปิด ObjectOutputStream


    //--------------------------------------------------------
    // saveData.
    //--------------------------------------------------------
    public void setAddMenuGUI(AddMenuGUI view) {
        this.view = view;
    }
    public void saveData() {
        try {
            FileOutputStream fo = new FileOutputStream("FoodData.data");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(foodList);
            fo.close();
            out.close();
            System.out.println("Successful");
        }
        catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Yeah");
        }
        
    }
        

    //--------------------------------------------------------
    // load data.
    //--------------------------------------------------------
   
    public void loadData() {
            try {
                    FileInputStream fis = new FileInputStream("FoodData.data"); // เปิดไฟล์ "FoodData.data" ด้วย FileInputStream
                    ObjectInputStream ois = new ObjectInputStream(fis); // สร้าง ObjectInputStream เพื่ออ่านข้อมูลจากไฟล์
                    foodList = (ArrayList<Food>) ois.readObject(); // อ่านข้อมูลจากไฟล์และกำหนดค่าให้กับ foodList
                    ois.close(); // ปิด ObjectInputStream
                    fis.close(); // ปิด FileInputStream
                } catch (IOException | ClassNotFoundException e) { // กรณีเกิด IOException หรือ ClassNotFoundException
                    e.printStackTrace(); // แสดง stack trace ของข้อผิดพลาด
                            }
    }

       
    //-----------------------------------------
    // Add, Delete Ingredients.
    //-----------------------------------------
    
    
    
    DefaultListModel model = new DefaultListModel();
    List<String> lst = new ArrayList<String>();
    public void AddIngredient(){
        
        view.getIngredientList().setModel(model);
        
        String ingredient = view.getTfIngredientDetail().getText();
        
        if (isIngredientValid(ingredient)){
            model.addElement(view.getTfIngredientDetail().getText().trim());
            lst.add(ingredient);
        }
        
        view.getTfIngredientDetail().setText("");
        
    }

    public void DelIngredient(){
        int selectedIndex = view.getIngredientList().getSelectedIndex(); 
        if (selectedIndex != -1) {
            model.remove(selectedIndex); 
        }
    }
        
    //--------------------------------------------------------
    // This Method is Checking Text in Ingredient TextField.
    //--------------------------------------------------------
    
    public static boolean isIngredientValid(String ingredient) {
        
        // not allow the first txt to be "".
        String ingredientRegex = "^[^\\s][A-Za-z0-9(/\\.)\\s]+$";
        Pattern pattern = Pattern.compile(ingredientRegex);
        Matcher matcher = pattern.matcher(ingredient);
        return matcher.matches();
    } 

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public Food getFood() {
        return food;
    }

    public File getFile() {
        return file;
    }

    void setAddMenuModel(AddMenuGUI aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
            
      
}
    
        
        

    
    
    
     
    
    
          
        
         
    
    
    

