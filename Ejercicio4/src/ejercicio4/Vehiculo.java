
package ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
//atributos de la clase vehiculo 
public class Vehiculo {
   private String pasajeros;
    private String tripulacion;
    private String ruedas;
    private Date fechamatricula;
   private String medio;
   private String tipo;
   
   public static Date transFechaDate(String fecha) {

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDate = null;
        try {
            fechaDate = (Date) formato.parse(fecha);
        } catch (ParseException ex) { 
        }
        return fechaDate;
        
      
        }
//constructores de la clase 

    public Vehiculo(String pasajeros, String tripulacion, String ruedas, Date fechamatricula, String medio, String tipo) {
        this.pasajeros = pasajeros;
        this.tripulacion = tripulacion;
        this.ruedas = ruedas;
        this.fechamatricula = fechamatricula;
        this.medio = medio;
        this.tipo = tipo;
    }
//metodo que sirve para mostrar todos los datos de la clase por pantalla
    @Override
    public String toString() {
        return "Vehiculo{" + "pasajeros=" + pasajeros + ", tripulacion=" + tripulacion + ", ruedas=" + ruedas + ", fechamatricula=" + fechamatricula + ", medio=" + medio + ", tipo=" + tipo + '}';
    }

        
        
    }
 
   

   


