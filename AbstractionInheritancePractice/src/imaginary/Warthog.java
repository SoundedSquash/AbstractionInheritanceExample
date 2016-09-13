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
public class Warthog extends Suv {
    private int ammo = 999;
    
    private void fireGun(){
        if(ammo>1 && hasGunner()){
            ammo--;
            //Fire gun.
        }
    }
    
    private boolean hasGunner(){
        //Validate that seat 3 (gunner seat) has Person.
        return true;
        //else
        //return false;
    }
}
