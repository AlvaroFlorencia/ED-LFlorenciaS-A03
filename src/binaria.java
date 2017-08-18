/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class binaria extends Busquedas implements Ordenamiento  {
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
            if(posicionCentro==valor){  //Si la posición es igual al valor regresar centro
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

    @Override
    public int[] seleccion(int[] array) {  //El método recibe un array
        int menor,auxiliar;                   //Variables   
         for(int i =0;1<array.length;i++){  //Primer ciclo for en posición i 
             menor=i;                      //Menor se vuelve la posición i
         for(int j=1+1;i<array.length;j++)  //Segundo ciclo for en posición j
            
         {
             if(array[j]<array[menor]){  //Si la posción en j es menor que la posición menor..
                 menor=j;
             }
         }
         auxiliar=array[i];   //Auxiliar guarda la posición de i
         array[i]=array[menor];  //La posición de i se vuelve la posición menor
         array[menor]=auxiliar;   //La posición menor se guarda en auxiliar
    }
 return array;   //Se regresa el array
 
       }
    
   
}
