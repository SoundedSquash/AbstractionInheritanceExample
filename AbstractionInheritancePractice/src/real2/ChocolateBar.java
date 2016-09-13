/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real2;

import java.util.ArrayList;

/**
 *
 * @author wboyer
 */
public abstract class ChocolateBar implements Sweet {
    private ArrayList<String> ingredients = new ArrayList<String>();
    private String chocolateType; //"Milk", "Dark", "White", etc.
    
    public String getChocolateType(){
        return chocolateType;
    }
    
    private void addIngredient(String s){
        //Validate
        ingredients.add(s);
    }
    
    @Override
    public ArrayList<String> getIngredients(){
        //Validate ingredients exist.
        return ingredients;
    }
}
