package code.kao.database;

import java.io.Serializable;
import javax.swing.*;

public class FoodRecipe extends Food implements Recipe, Serializable {
    
    private JList ingredient;
    private String description, category;
    
    public FoodRecipe(){
        this("", new JList(), new ImageIcon(), "");
    }
    
    public FoodRecipe(String name){
        this(name, new JList(), new ImageIcon(), "");
    }
    
    public FoodRecipe(String name, JList ingredient){
        this(name, ingredient, new ImageIcon(), "");
    }
    
    public FoodRecipe(String name, JList ingredient, String category){
        this(name, ingredient, new ImageIcon(), category);
    }
    
    public FoodRecipe(String name, JList ingredient, ImageIcon picture, String category){
        this.name = name;
        this.ingredient = ingredient;
        this.picture = picture;
        this.category = category;
    }
    
    public FoodRecipe(String name, JList ingredient, ImageIcon picture, String category, String description){
        this.name = name;
        this.ingredient = ingredient;
        this.picture = picture;
        this.category = category;
        this.description = description;
    }

    public void setIngredient(JList ingredient) {
        this.ingredient = ingredient;
    }

    public JList getIngredient() {
        return ingredient;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    
    @Override
    public String showDetail() {
        return "Not Debveloping";
    }

    @Override
    public String getIngredientDetail() {
        
  
        
        StringBuilder ingredientsBuilder = new StringBuilder();
        for (int i = 0; i < ingredient.getModel().getSize(); i++) {
            String item = (String) ingredient.getModel().getElementAt(i);
            ingredientsBuilder.append(item);
            if (i < ingredient.getModel().getSize() - 1) {
                ingredientsBuilder.append(", ");
            }
        }

        String template = ingredientsBuilder.toString();
        
        
        return template;
    }

    @Override
    public String cooking() {
        String template = "Menu: " + name;
        template += "\n\n";
        template += "Category: " + category;
        template += "\n\n";
        template += "Ingredient";
        template += "\n";
        template += getIngredientDetail();
        template += "\n\n";
        template += "Cooking";
        template += "\n";
        template += description;
        
        return template;
    }
    
}
