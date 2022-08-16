
package ejercicio5;

/**
 *
 * @author Lenovo
 */
//atributos de la clase vehiculo 
public class Vehiculo {
   public String pasajeros;
    public String tripulacion;
    public int ruedas; 
    public String medio;
    public boolean motor;

    public Vehiculo(String pasajeros, String tripulacion, int ruedas, String medio, boolean motor) {
        this.pasajeros = pasajeros;
        this.tripulacion = tripulacion;
        this.ruedas = ruedas;
        this.medio = medio;
        this.motor = motor;
    }
   

//metodo que sirve para mostrar todos los datos de la clase por pantalla

    @Override
    public String toString() {
        return "Vehiculo{" + "pasajeros=" + pasajeros + ", tripulacion=" + tripulacion + ", ruedas=" + ruedas + ", medio=" + medio + ", motor=" + motor + '}';
    }
     }
   

   


