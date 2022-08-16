package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String entradaTeclado = "";
       
        //SE LLENA EL ARRAY 
        int numeros[] = Metodos.listNumber();
        
         //SE PREGUNTA POR QUE METODO QUIERE ORDENAR 
         System.out.println("ESCRIBA EL NUMERO CORRESPONDIENTE AL ALGORITMO A USAR Y DE ENTER");
         System.out.println("1 BURBUJA");
         System.out.println("2 QUICK SORT");
         Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
         entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner   
         if(entradaTeclado.equalsIgnoreCase("1")){
             System.err.println("*****ORDENADO CON EL METODO BURBUJA****");
             Metodos.burbuja(numeros);
         } else if(entradaTeclado.equalsIgnoreCase("2")){
             System.err.println("*****ORDENADO CON EL METODO QUICK SORT****");
             Metodos.Quicksort(numeros, 0, numeros.length -1);
         } else {
             System.err.println("ERROR NO ELIGIO UN DATO VALIDO");
         }        
        //SE IMPRIME LOS VALORES
        Metodos.Imprimir(numeros);
    }
  }  
