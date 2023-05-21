package code.phak;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Food implements Serializable {
    private String NameFood;
    private List<String> FoodIng; // Food Ingredient
    private String FoodType;
    private String FoodMethod;
    //ระบุเวอร์ชันของ Class ที่ถูกserialize เพื่อให้โปรแกรมที่ deserializeเข้าใจได้ว่าClass นั้นเป็นเวอร์ชันเดียวกันหรือไม่
    private static final long serialVersionUID = 1L; 
    //การที่กระบวนการ Serialization และ Deserialization เป็นเวอร์ชันเดียวกันหมายความว่าคลาสที่ใช้ในกระบวนการ
    //Serialization และ Deserialization เป็นคลาสเดียวกัน หรืออย่างน้อยเป็นคลาสที่มีโครงสร้างและรหัสเวอร์ชันเดียวกัน
    //ถ้าโครงสร้างหรือรหัสของคลาสมีการเปลี่ยนแปลง ค่า serialVersionUID ต้องถูกอัพเดตเพื่อระบุเวอร์ชันใหม่
    

    public Food() {
        this.NameFood = "";
        this.FoodIng = new ArrayList<String>();
        this.FoodType = "";
        this.FoodMethod="";
    }

    public Food(String NameFood, List<String> FoodIngd, String FoodType,String FoodMethod) {
        this.NameFood = NameFood;
        this.FoodIng = FoodIngd;// Food Ingredient
        this.FoodType = FoodType;
        this.FoodMethod=FoodMethod;
    }

    public String getFoodMethod() {
        return FoodMethod;
    }

    public void setFoodMethod(String FoodMethod) {
        this.FoodMethod = FoodMethod;
    }

    public String getNameFood() {
        return NameFood;
    }

    public void setNameFood(String NameFood) {
        this.NameFood = NameFood;
    }

    public List<String> getFoodIngd() {
        return FoodIng;
    }

    public void setFoodIngd(List<String> FoodIngd) {
        this.FoodIng = FoodIngd;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    void setFoodIngd(String selectedValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
