
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public abstract  class Busquedas {  
     int[] vector ;  //Atributos
    
public int[] CrearVector(int tamaño)  //metodo crear vecotr recibe el taño
{
vector = new int[tamaño];
for (int i=0;i<tamaño;i++){
   vector[i] = (int) (Math.random()*100); //Se corre el arreglo y se lenna el vector se multiplica por 100 para que salgan números enteros
}
  return vector; 
}

    public int[] getVector() {   //getter
        return vector;
    }

    public void MostrarVector(int[] vector) { //Mostrar vector se corre el arreglo y se va imprimiendo
     
           System.out.println(Arrays.toString(vector));
    }

    public void setVector(int[] vector) {  //Setter
        this.vector = vector;
    }
    public void MostrarF (int n)  // Dependiendo del número recabado de las claese hijas con los metodos de busquedaa se entrega la posición  pero si es -1 se dice que no se encontro
    {
        if(n==-1)
        {
            System.out.println("El dato no se encuetra dentro del vector");       
        }
        else
        {
            System.out.println("El dato  se encuentra dentro del  vector " + n ) ;
        }
    }
    
    public abstract int busqueda (int valor);  //Método abstracto
    }
    


