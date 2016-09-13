/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary2;

import java.util.ArrayList;

/**
 *
 * @author wboyer
 */
public abstract class Island {
    private ArrayList<Object> volcanoes = new ArrayList<Object>();
    
    private void addVolcano(Object volcano){
        volcanoes.add(volcano);
    }
    
    public Object getVolcano(int idx){
        if(idx > 0 && idx < volcanoes.size()){
            return volcanoes.get(idx);
        } else return null;
    };
}
