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
         for(int i =0;i<array.length-1;i++){  //Primer ciclo for en posición i 
             menor=i;                      //Menor se vuelve la posición i
         for(int j=i+1;j<array.length;j++)  //Segundo ciclo for en posición j
            
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
    
   @Override
    public int[] inserccion(int[] array) {  //El método recibe un array
          
          int temporal;
          int j;
          
          //Variables   
         for(int i =1;i<array.length-1;i++){ 
            temporal=array[i];
            j=1-1;
        while((j>=0)&&(array[j]>temporal)){
            array[j+1]=array[j];
            j--;
        }
        array[j+1]=temporal;
    }
 return array;   //Se regresa el array
 
       }
    @Override
    public  int [] burbuja(int[] array )
    {
      int auxiliar;
        for(int i =0;i<array.length-1;i++) //Se corre el arreglo en la posición i
        {
            for(int j =0;j<array.length-1;j++){  //Se corre el arreglo en la posición j
                if(array[j]>array[j+1]){  //Si el valor actual es mayor que el de la derecha se hace el intercambio
                auxiliar=array[j];  
         array[j]=array[j+1];  
         array[j+1]=auxiliar;  
                }
                
            }
        }
            
        return array; //Se regreso el array
    }
   @Override
    public void quickSort(int principio, int fin)
    {
    int i,j,pivot;
    i=principio;
    j=fin;
    pivot = vector[(principio+fin)/2];  //Se  saca el pivotr sumando el inicio más el fin y diviendo entre 2
    do{ 
    while (vector[i] < pivot)  //Mientras el valor en i sea menor al pivote
    {
    i++; //Se suma en i
    }
      while (vector[j] > pivot) 
      {
     j--;   //Mientras la posción en j sea mayor al pivote se resta en j
    }
   if (i <= j)   //Si  la el vlaor en j es menor que el j se llama al metódo de intercmabio
   {
    Intercambio(i,j);
    }
                
   } while (i<=j);    //Mientras i sea menor o igual que j se utiliza la recursividad haciendo a j el fin
   if (principio < j)
   {
   quickSort(principio,j);
   }
   if (i < fin)   //SI i es menor que el fin  se utiliza la recursividad haciendo a i el principio
   {
    quickSort(i,fin);                   
     }
    }
    
    public void  Intercambio(int p1,int p2){  //Se reciben 2 números y se hace el interacmbio de la mayóría de los meódos
         
        
        int auxiliar=vector[p1];     
        vector[p1]=vector[p2];
        vector[p2]=auxiliar;
        
       
    }
    /** public int Quicksort(int[]array,int inicio,int fin){
        int i,j,pivote,auxiliar;
        i=inicio;
         j=fin;
         
        
    }
    **/
    @Override
     public  void mergeSort(int array[],int izquierda, int derecha){
    if (izquierda<derecha){ //verifica si si izquierda es menor que derecha si no es asì es por que el arreglo ya esta ordenado
            int medio=(izquierda+derecha)/2; //Se divide en 2
            mergeSort(array,izquierda, medio); //Se vuelve a ordenar usando recursividad 
            mergeSort(array,medio+1, derecha);  //Para los dos mitades
            merge(array,izquierda, medio, derecha);//   Ya ordenados se llama ala funciòn merge
    }
}

public static void merge(int array[],int izquierda, int medio, int derecha){
   int i, j, k;
   int [] arrayAuxiliar = new int[array.length]; // Se crea un array auxiliar para guardar datos
   for (i=izquierda; i<=derecha; i++) //Se recorre de izquierda derecha
             arrayAuxiliar[i]=array[i];  //En array auxiliar se guarda el valor  de i

             i=izquierda; j=medio+1; k=izquierda;  //Se etablecen posiciones
             while (i<=medio && j<=derecha)  //Mientras que la posiciòn de la izquierda se menor que el  de en medio y la posici``on de enmedio se menor que derecha
             if (arrayAuxiliar[i]<= arrayAuxiliar [j]){ //Se accede y se pregunta si el valor de i es  menor que el j
                     array[k++]= arrayAuxiliar [i++]; //Medio se vueleve izquierda
             }
             else{
                     array [k++]= arrayAuxiliar [j++]; //Si no medio se vuelve derecha y
             }
                     while (i<=medio) {
                           array [k++]= arrayAuxiliar [i++]; //primera mitad (si los hay)
 
             }



 

   
}

}
       