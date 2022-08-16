
package ejercicio1;
 
/**
 *
 * @author Yurleidy Alcazar 
 */
//double masaTierraKg = 5.973E24;   
  // double masaLunaKg = 7.349E22;
  // double distanciaTierraLunaKm =  384E6;
public class Principal {
 
    private static FuerzaAtraccion fuerzaAtraccion= new FuerzaAtraccion();
   
    public static void main(String[] args) {
       
       CuerpoCeleste tierra = new CuerpoCeleste(1,"Tierra",5.973E24 , 105, 205,105,384E6) {};
       CuerpoCeleste luna = new CuerpoCeleste(2,"Luna",7.349E22 , 303, 5052, 1233, 0) {};
       System.out.println(tierra.nombre);
       fuerzaAtraccion.atraccionDosCuerpos(tierra.nombre, luna.nombre, tierra.masa, luna.masa, tierra.distanciaLuna);
    }
    
   
}
