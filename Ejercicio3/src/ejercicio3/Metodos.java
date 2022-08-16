package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Metodos {       
    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
    
        //Metodo de Ordenamiento QuickSort
    public static void Quicksort(int numeros[], int izq, int der)  {
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] <= pivote && i < j) 
                  i++;

               while (numeros[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1)
                Quicksort(numeros,izq,j-1);

             if (j+1 < der)
                Quicksort(numeros,j+1,der);
      }
    
 
    
   public static void Imprimir(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++)    {
            System.out.println(arreglo[i]);
        }
    }
   
    public static int getRandomIntegerBetweenRange(int min, int max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return (int) x;
    }
    
     public static int[] listNumber(){
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++)    { 
          numeros.add(getRandomIntegerBetweenRange(1,50));               
        }
        System.out.println("***LISTA CREADA USANDO LA CLASE MATH***");
        System.out.println(numeros);
        int[] arr = numeros.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    

    
}

