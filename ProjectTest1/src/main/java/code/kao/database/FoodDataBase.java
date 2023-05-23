package code.kao.database;

import java.io.Serializable;
import java.util.*;

public class FoodDataBase implements Serializable {
    private ArrayList<FoodRecipe> allRecipe, mainCourse, dessert, drinks;
    private Map userRecipe = new HashMap();
    
    public FoodDataBase(){
        allRecipe = new ArrayList();
        mainCourse = new ArrayList();
        dessert = new ArrayList();
        drinks = new ArrayList();
    }
    
    //All User DataBase
    
    public void addFoodDataBase(String name, FoodRecipe food){
        allRecipe.add(food);
        addInCategory(food);
        addUserRecipe(name, food);
    }
    public void removeFoodDataBase(String name, FoodRecipe food){
        allRecipe.remove(allRecipe.indexOf(food));
        removeInCategory(food);
        removeUserRecipe(name, food);
    }
    
    public void addInCategory(FoodRecipe food){
        String category = food.getCategory();
        
        if (category.equals("MainCourse")){
            mainCourse.add(food);
        }
        else if (category.equals("Dessert")){
            dessert.add(food);
        }
        else if (category.equals("Drinks")){
            drinks.add(food);
        }
    }
    public void removeInCategory(FoodRecipe food){
        String category = food.getCategory();
        if (category.equals("MainCourse")){
            mainCourse.remove(mainCourse.indexOf(food));
        }
        else if (category.equals("Dessert")){
            dessert.remove(dessert.indexOf(food));
        }
        else if (category.equals("Drinks")){
            drinks.remove(drinks.indexOf(food));
        }
    }
    public ArrayList getAllRecipe(){
        return allRecipe;
    }
    public ArrayList getMainCourse(){
        return mainCourse;
    }
    public ArrayList getDessert(){
        return dessert;
    }
    public ArrayList getDrinks(){
        return drinks;
    }
    
    //Specific User DataBase
    
    public void addUserRecipe(String name, FoodRecipe food){
        if (userRecipe.containsKey(name) == false){
            ArrayList userRecipeList = new ArrayList();
            userRecipeList.add(food);
            
            userRecipe.put(name, userRecipeList);
        }
        else{
            ArrayList u = (ArrayList) userRecipe.get(name);
            u.add(food);
        }
    }
    public void removeUserRecipe(String userName, FoodRecipe food){
        ArrayList u = (ArrayList) userRecipe.get(userName);
        u.remove(food);
    }
    public ArrayList getUserRecipe(String userName){
        return (ArrayList) userRecipe.get(userName);
    }
}
