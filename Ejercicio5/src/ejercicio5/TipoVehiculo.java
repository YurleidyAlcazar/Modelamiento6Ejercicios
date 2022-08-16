
package ejercicio5;

/**
 *
 * @author Lenovo
 */
public class TipoVehiculo {
    public void RespuestaTipoVehiculo(boolean motor,int ruedas, String medio){
        if ("agua".equals(medio)){
           System.out.println("El vehiculo es una Lancha");
        }
        else {
        if (motor==true){
            if(ruedas == 4){
                 System.out.println("El vehiculo es un coche");
            }else if (ruedas==2 )  {
                 System.out.println("El vehiculo es una moto");
            }
            else if (ruedas>4 )  {
                 System.out.println("El vehiculo es un camion ");
            }
        }else {
            System.out.println("El vehiculo es una bicicleta");
        }
      }   
    }
            
    
}
