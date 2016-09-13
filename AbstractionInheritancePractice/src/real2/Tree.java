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
public abstract class Tree extends Plant {
    private int age; //In days.
    private int trunkRadius, trunkHeight;
    
    public final double getTrunkRadius(){
        return trunkRadius;
    }
    
    public final double getTrunkVolume(){
        return Math.PI * Math.pow(trunkRadius, 2) * trunkHeight;
    }
}
