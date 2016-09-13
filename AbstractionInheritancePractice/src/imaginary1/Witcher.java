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
public abstract class Witcher extends Protagonist {
    private int monstersSlain;
    private boolean outOfCombat;
    
    private void meditate(int hours){
        if(outOfCombat){
            //Meditate
        }
    }
    
    private int getMonstersSlain(){
        return monstersSlain;
    }    
}
