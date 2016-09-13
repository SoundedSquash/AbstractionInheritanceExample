/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary3;

/**
 *
 * @author wboyer
 */
public class Warthog extends Suv {
    private int ammo = 999;
    
    private void fireGun(){
        if(ammo>1){
            ammo--;
            //Fire gun.
        }
    }
}
