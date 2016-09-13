/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real2;

/**
 *
 * @author wboyer
 */
public abstract class Plant {
    private int age; //In days.
    
    public void setAge(int a){
        //Validate
        age = a;
    }
    
    public final int getAge(){
        return age;
    }
}
