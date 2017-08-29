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
        int [] vector = {7,6,5,4,3,2,1,9,8}; 
        
        secuencial secuencial1 = new secuencial();  
       /** binaria binaria1 = new binaria();
        binaria1.inserccion(vector);
        secuencial1.setVector(vector);
        binaria1.MostrarVector(vector);
        secuencial1.MostrarF(secuencial1.busqueda(2));
        *  */
       binaria binaria1 = new binaria();
       
       binaria1.mergeSort(vector,0,vector.length-1);
       binaria1.MostrarVector(vector);
       

        
        
     
        
    }
    
}
