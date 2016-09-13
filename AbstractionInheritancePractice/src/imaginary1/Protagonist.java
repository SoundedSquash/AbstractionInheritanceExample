/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary1;

/**
 *
 * @author wboyer
 */
public abstract class Protagonist {
    private String firstName;
    private String lastName;
    
    public String getName(){
        return firstName + ' ' + lastName;
    }
}
