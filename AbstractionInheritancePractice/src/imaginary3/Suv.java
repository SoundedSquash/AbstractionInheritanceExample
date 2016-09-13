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
public abstract class Suv {
    //The term "SUV" is still used to describe nearly anything with available all-wheel drive and raised ground clearance.
    private int seats;
    
    private void setSeats(int s){
        if(s > 0 && s < 10){
            seats = s;
        }
    }
}
