/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ed.lflorencias.a03.*;

/**
 *
 * @author Dell
 */
public class EDLFlorenciaSA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = {8,9,11,13,15,6,7,81,99}; 
        secuencial secuencial1 = new secuencial();  
        binaria binaria1 = new binaria();
        secuencial1.setVector(vector);
        binaria1.setVector(vector);
        secuencial1.MostrarF(secuencial1.busqueda(2));
        binaria1.MostrarF(binaria1.busqueda(3));
        
    }
    
}
