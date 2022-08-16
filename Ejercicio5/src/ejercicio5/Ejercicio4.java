
package ejercicio5;



/**
 *
 * @author Yurleidy Alcazar
 */
public class Ejercicio4 {
//declarar la clase vehiculo
    private static Coche coche;
    private static TipoVehiculo tipovehiculo = new TipoVehiculo();
    //instanciar la clase para crear un vehiculo nuevo 
    public static void main(String[] args) {
        coche = new Coche(false,"Si tiene", "presencia", 4, "terrestre", true);
        tipovehiculo.RespuestaTipoVehiculo(coche.motor,coche.ruedas,coche.medio);
       
                
        
}
}
