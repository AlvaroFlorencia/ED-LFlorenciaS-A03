/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class binaria extends Busquedas {
   @Override
   public int busqueda (int valor){ 
    int medio;
    int inicio=0;   //Atributos inicio,medio y fin
    int fin=vector.length-1;       //-1 Para evitar una excepción  
    int centro=(inicio+fin)/2;  
    int posicionCentro;
    
       while(inicio < fin)
        {
            posicionCentro=vector[centro]; 
            if(posicionCentro==valor){  //Si la posición es igual al valor regresar centror
                return centro;
            }
            else
            {
                if(valor<posicionCentro){  //si el valor es menor es menor a la poisción del centros es decir que si va por ese "lado"
                    fin=centro;
                centro=(inicio+fin)/2; //el fin se hace el centro  y se vuelve a predefinir el centro 
            }
            else
            {
              inicio=centro; //si noel inicio se hace el centro  y se vuelve a predefinir el centro 
                centro=(inicio+fin)/2;       
                    }
   }
}return-1; //Si no se encuentra se devuelve -1
   }
    
   
}
