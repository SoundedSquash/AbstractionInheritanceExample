/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary;

/**
 *
 * @author wboyer
 */
public abstract class Vehicle {
    private float mph; //44.6
    
    public abstract void startVehicle();
    
    public void setMph(int value){
        //Validate
        mph = value;
    }
    
    public final float getMph(){
        return mph;
    }
}
