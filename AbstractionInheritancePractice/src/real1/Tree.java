/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real1;

/**
 *
 * @author wboyer
 */
public abstract class Tree implements Plant {
    private int age; //In days.
    private int trunkDiameter;
    
    public final int getTrunkDiameter(){
        return trunkDiameter;
    }
    
    @Override
    public void setAge(int a){
        //Validate
        age = a;
    }
    
    @Override
    public final int getAge(){
        return age;
    }
}
