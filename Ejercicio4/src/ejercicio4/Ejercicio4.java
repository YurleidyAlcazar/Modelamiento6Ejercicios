
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yurleidy Alcazar
 */
public class Ejercicio4 {
//declarar la clase vehiculo
    private static Vehiculo vehiculo;
    //instanciar la clase para crear un vehiculo nuevo 
    public static void main(String[] args) {
       
        String entradaTeclado = "";
        ArrayList<Vehiculo> arrayOfVehiculo = new ArrayList<>();
        
        
        arrayOfVehiculo.add( new Vehiculo(
                "10",
                "presencia",
                "4", 
                vehiculo.transFechaDate("24-07-2022") 
                ,"terrestre"
                , "bus"));
        arrayOfVehiculo.add( new Vehiculo( 
                "1",
                "presencia",
                "4", 
                vehiculo.transFechaDate("14-05-1995") 
                ,"terrestre"
                , "Tractor"));
        arrayOfVehiculo.add( new Vehiculo( 
                "45",
                "presencia",
                "8", 
                vehiculo.transFechaDate("01-03-1980") 
                ,"Aereo"
                , "Avion"));
        arrayOfVehiculo.add( new Vehiculo( 
                "2",
                "presencia",
                "12", 
                vehiculo.transFechaDate("14-05-1995") 
                ,"terrestre"
                , "Tracto camion"));
        arrayOfVehiculo.add( new Vehiculo( 
                "1",
                "presencia",
                "0", 
                vehiculo.transFechaDate("07-10-2001") 
                ,"acuatico"
                , "Lancha"));
        arrayOfVehiculo.add( new Vehiculo( 
                "25",
                "presencia",
                "0", 
                vehiculo.transFechaDate("27-03-2010") 
                ,"acuatico"
                , "Yate"));
        arrayOfVehiculo.add( new Vehiculo( 
                "2",
                "presencia",
                "4", 
                vehiculo.transFechaDate("02-12-1956") 
                ,"terrestre"
                , "Cuatrimoto"));
        arrayOfVehiculo.add( new Vehiculo( 
                "10",
                "presencia",
                "0", 
                vehiculo.transFechaDate("07-10-2001") 
                ,"acuatico"
                , "Barco"));
        arrayOfVehiculo.add( new Vehiculo( 
                "20",
                "presencia",
                "4", 
                vehiculo.transFechaDate("12-01-1994") 
                ,"terrestre"
                , "Chiva"));
        arrayOfVehiculo.add( new Vehiculo( 
                "1",
                "presencia",
                "2", 
                vehiculo.transFechaDate("11-11-1975") 
                ,"terrestre"
                , "Moto"));
        for (Vehiculo vehiculo: arrayOfVehiculo) {
            System.out.println(vehiculo);
            
        }
       
            
    }
    
}
