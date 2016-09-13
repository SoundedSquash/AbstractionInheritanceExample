/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real3;

/**
 *
 * @author wboyer
 */
public abstract class Feline implements Animal {
    private int age;
    
    @Override
    public void setAge(int a){
        //Validate
        age = a;
    }
    
    @Override
    public int getAge(){
        return age;
    }
}
