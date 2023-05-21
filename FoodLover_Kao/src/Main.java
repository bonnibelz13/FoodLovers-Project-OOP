import DataBase.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main implements Serializable {
    public static void main(String[] args) {
        FoodRecipe f1, f2, f3, f4, f5, f6, f7;
        ImageIcon img1, img2, img3, img4, img5, img6, img7;
        FoodDataBase foodDataBase;
        
        try (FileInputStream fin = new FileInputStream("FoodDataBase.dat");
             ObjectInputStream oin = new ObjectInputStream(fin)){
            foodDataBase = (FoodDataBase) oin.readObject();
            
            System.out.println("Import Data Successfully");
        }
        catch (IOException | ClassNotFoundException ex){
            foodDataBase = new FoodDataBase();
            System.out.println("Data not found. Create New DataBase Successfully.");
        }
        finally {
            System.out.println("Done.");
        }
        
        img1 = new ImageIcon("C:\\Users\\dam\\Downloads\\lab13imgre2.jpg"); //This is Local Path of your picture file
        img1 = new ImageIcon(img1.getImage().getScaledInstance(220, 165, Image.SCALE_SMOOTH));

        f1 = new FoodRecipe("Pad Thai", new JList(), img1, "MainCourse");
        f2 = new FoodRecipe("Noodles", new JList(), img1, "MainCourse");
        f3 = new FoodRecipe("Bua Loy", new JList(), img1, "Dessert");
        f4 = new FoodRecipe("Fried Rice", new JList(), img1, "MainCourse");
        f5 = new FoodRecipe("Tom Yum", new JList(), img1, "MainCourse");
        f6 = new FoodRecipe("Green Tea", new JList(), img1, "Drinks");
        f7 = new FoodRecipe("Lemon Soda", new JList(), img1, "Drinks");
        
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f1);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f2);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f3);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f4);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f5);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f6);
        foodDataBase.addFoodDataBase("Kao Noppakorn", f7);
        
        
            
        System.out.println(foodDataBase.getAllRecipe().size());

        new HomeMenuView(foodDataBase, "Kao Noppakorn").setVisible(true);
        
//        try (FileOutputStream fout = new FileOutputStream("FoodDataBase.dat");
//             ObjectOutputStream oout = new ObjectOutputStream(fout)){
//            oout.writeObject(foodDataBase);
//            System.out.println("Save Data Successfully.");
//        }
//        catch (IOException ex){
//            ex.printStackTrace();
//        }
    }
}
