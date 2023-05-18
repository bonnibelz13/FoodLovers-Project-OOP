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


//Model = to handle the data and logic

public class AddMenuModel {
    
    
    private ArrayList<Food> foodList = new ArrayList<Food>();;
    private Food food;
    private File file;
     

    public AddMenuModel() {
        
        File file = new File("FoodData.data"); // สร้างออบเจกต์ File เพื่อตรวจสอบไฟล์ "FoodData.data"
        if (file.exists()) { // ตรวจสอบว่าไฟล์ "FoodData.data" มีอยู่หรือไม่
            loadData();
        }
    }
    
       // บันทึกข้อมูลลงในไฟล์ "FoodData.data" โดยใช้ ObjectOutputStream เพื่อเขียน object
        // List ลงไปในไฟล์ หลังจากนั้นปิด ObjectOutputStream
    @SuppressWarnings("unchecked")
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

    

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public Food getFood() {
        return food;
    }

    public File getFile() {
        return file;
    }
    
    
    
            
      
}
    
        
        

    
    
    
     
    
    
          
        
         
    
    
    

