/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public interface Ordenamiento {
    public abstract int[] seleccion(int[] array);   //Método a implementar
    public abstract int[] inserccion(int[] array );
    public abstract int [] burbuja(int[] array );
     public abstract void quickSort(int inicio, int fin);
      public abstract void mergeSort(int array[],int izquierda, int derecha);
    
    
    
    
    
    
}
