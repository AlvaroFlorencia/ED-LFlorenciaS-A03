/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public  class secuencial extends Busquedas {
    @Override
    public  int busqueda (int valor){ //se recibe el valor buscado
       
        for (int i=0;i<vector.length;i++){   //Se corre el arreglo  
            if(valor==vector[i]){   //si se encuetra se regresa la posción
                return i;
            }
           
        }
         return -1;  //Si no se encuentra se regresa -1
    }
    
    }
    

