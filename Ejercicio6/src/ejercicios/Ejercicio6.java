
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yurleidy Alcazar
 * 
 */
public class Ejercicio6 {

 
    public static void main(String[] args) {
        // TODO code application logic here
     listaDinamica();
       String entradaTeclado = "";
    }

    private static void listaDinamica() {
    ArrayList <String> lista=new ArrayList<>();
    
    for (int i=0; i<100; i++){
        System.out.println("Introduzca el numero");
        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
        String entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
   
   boolean respuesta= false;
           
    
    for (int j=0; j<lista.size(); j++){
        if(lista.get(j).equalsIgnoreCase(entradaTeclado)){
         System.out.println("El numero introducido ya se encuentra en la lista");
         System.out.println(lista);   
         respuesta=true;
         break;
        }
        
     } 
    if(respuesta == true){
        break;
       
    }
    else{
         lista.add(entradaTeclado);
    }
   
    
     }     
    
    
    
    
    }    
    
}
