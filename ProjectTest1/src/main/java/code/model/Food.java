package code.model;

import java.io.Serializable;

public class Food implements Serializable {
    private String NameFood;
    private String FoodIng; // Food Ingredient
    private String FoodType;
    //ระบุเวอร์ชันของ Class ที่ถูกserialize เพื่อให้โปรแกรมที่ deserializeเข้าใจได้ว่าClass นั้นเป็นเวอร์ชันเดียวกันหรือไม่
    private static final long serialVersionUID = 1L; 
    //การที่กระบวนการ Serialization และ Deserialization เป็นเวอร์ชันเดียวกันหมายความว่าคลาสที่ใช้ในกระบวนการ
    //Serialization และ Deserialization เป็นคลาสเดียวกัน หรืออย่างน้อยเป็นคลาสที่มีโครงสร้างและรหัสเวอร์ชันเดียวกัน
    //ถ้าโครงสร้างหรือรหัสของคลาสมีการเปลี่ยนแปลง ค่า serialVersionUID ต้องถูกอัพเดตเพื่อระบุเวอร์ชันใหม่
    

    public Food() {
        this.NameFood = "";
        this.FoodIng = "";
        this.FoodType = "";
        
    }

    public Food(String NameFood, String FoodIngd, String FoodType) {
        this.NameFood = NameFood;
        this.FoodIng = FoodIngd;// Food Ingredient
        this.FoodType = FoodType;
    }

    Food(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameFood() {
        return NameFood;
    }

    public void setNameFood(String NameFood) {
        this.NameFood = NameFood;
    }

    public String getFoodIngd() {
        return FoodIng;
    }

    public void setFoodIngd(String FoodIngd) {
        this.FoodIng = FoodIngd;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }
    
}
