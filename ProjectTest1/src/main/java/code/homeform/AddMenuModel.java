
package code.homeform;


import java.io.File;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import code.model.Food;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




//Model = to handle the data and logic

public class AddMenuModel  {
    
    
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

    private void saveData() {
        try {
                //สร้าง Object ชื่อ out ของคลาส ObjectOutputStream และใช้ตัวแปรชนิด FileOutputStream เพื่อสร้างไฟล์ "FoodData" ขึ้นมา
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FoodData.data")); 
                // เขียนข้อมูลลงในไฟล์ "FoodData" ด้วยคำสั่ง writeObject(bookList) โดย FoodList เป็น ArrayList ของ FoodData
                out.writeObject(foodList); 
                out.close(); // ปิดไฟล์ด้วยคำสั่ง close()
            } catch (IOException e) {
                e.printStackTrace(); // ถ้าเกิด error ขึ้นในการเขียนข้อมูลในไฟล์ "FoodData" จะแสดง stack trace ด้วยคำสั่ง e.printStackTrace()

            }


        }



        // ตรวจสอบว่าไฟล์ "FoodData.data" มีอยู่หรือไม่
        // หากมีให้โหลดข้อมูลจากไฟล์ดังกล่าวเพื่อเตรียมใช้งาน
    private void loadData() {
        File file = new File("FoodData.data"); // สร้างออบเจกต์ File เพื่อตรวจสอบไฟล์ "FoodData.data"
        if (file.exists()) { // ตรวจสอบว่าไฟล์ "FoodData.data" มีอยู่หรือไม่
            try {
                    FileInputStream fis = new FileInputStream(file); // เปิดไฟล์ "FoodData.data" ด้วย FileInputStream
                    ObjectInputStream ois = new ObjectInputStream(fis); // สร้าง ObjectInputStream เพื่ออ่านข้อมูลจากไฟล์
                    foodList = (ArrayList<Food>) ois.readObject(); // อ่านข้อมูลจากไฟล์และกำหนดค่าให้กับ foodList
                    ois.close(); // ปิด ObjectInputStream
                    fis.close(); // ปิด FileInputStream
                } catch (IOException | ClassNotFoundException e) { // กรณีเกิด IOException หรือ ClassNotFoundException
                                    e.printStackTrace(); // แสดง stack trace ของข้อผิดพลาด
                            }
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
    
        
        

    
    
    
     
    
    
          
        
         
    
    
    


