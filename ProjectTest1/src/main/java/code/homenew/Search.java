package code.homenew;

import code.kao.database.*;
import java.util.*;

public class Search {
    
    private ArrayList search_result;
    
    public ArrayList SearchMenu(String search, FoodDataBase foodDataBase){
        
        search_result = new ArrayList();
        
        for (int i = 1; i < foodDataBase.getAllRecipe().size(); i++){
            FoodRecipe food = (FoodRecipe) foodDataBase.getAllRecipe().get(i);
            
            System.out.println(search);
            System.out.println(food.getName());
            
            if (search.equals(food.getName())){
                
                search_result.add(food);
                System.out.println(search_result);
            }
        }
        
        return search_result;
    }
}
