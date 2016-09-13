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
public class SpruceTree extends Tree {
    private double resinLeft = super.getTrunkVolume() * 0.0001; //In fluid oz possibly. Made fake formula.
    
    public void tapResin(){
        //Validate resin left.
        
        //Tap resin.
        resinLeft -= 0.5;
    }
}
