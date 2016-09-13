/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary2;

/**
 *
 * @author wboyer
 */
public abstract class Location {
    private float[] coordinates = new float[2];
    /**
     * Returns a float array with coordinates.
     * @return float[0]: N, float[1]: W
     */
    public float[] getCoordinates(){
        return coordinates;
    }
    
    /**
     * Set coordinates in decimal degrees.
     * @param n
     * @param w
     */
    public void setCoordinates(float n, float w){
        //Needs validation
        coordinates[0] = n;
        coordinates[1] = w;
    }
}
