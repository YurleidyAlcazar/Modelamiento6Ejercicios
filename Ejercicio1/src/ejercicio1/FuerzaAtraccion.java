
package ejercicio1;

/**
 *
 * @author Yurleidy Alcazar
 */
public class FuerzaAtraccion { 
   double gravedad = 6.673E-11; 
   //double masaTierraKg = 5.973E24;   
  // double masaLunaKg = 7.349E22;
  // double distanciaTierraLunaKm =  384E6;
  
   //METODO QUE CALCULA LA ATRACCION GRAVITATORIA ENTRE DOS CUERPOS
   public void atraccionDosCuerpos(String cuerpoUno ,String cuerpoDos ,double masaTierraKg, double masaLunaKg, double distanciaTierraLunaKm){
        double distancia2 = Math.pow(distanciaTierraLunaKm, 2);       
        double F = gravedad*((masaTierraKg * masaLunaKg)/distancia2); 
        System.out.println("La Fuerza de atracciòn entre "+cuerpoUno+" y "+cuerpoDos+" es :"  + F + " Newtons.");
   }
  
    
//    double masa1, masa2, distancia;
//    double g = 0.00000006673;   
//    f= g * masa1 * masa2 / (distancia * distancia);
//    
//
//    public FuerzaAtraccion(double masa1, double masa2, double distancia) {
//        this.masa1 = masa1;
//        this.masa2 = masa2;
//        this.distancia = distancia;
//    }
//
//    private static class f {
//
//        public f() {
//        }
//    }

    
}
