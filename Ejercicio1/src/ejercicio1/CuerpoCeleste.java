/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Yurleidy Alcazar 
 */
//Atributos de la clase planeta
public abstract class CuerpoCeleste {
    public int id;
    public String nombre;       
    public double masa;
    public int densidad;
    public int diametro;
    public double distanciaSol; 
    public double distanciaLuna;  

    
    /**
     * CONSTRUCTOR
     * @param id
     * @param nombre
     * @param masa
     * @param densidad
     * @param diametro
     * @param distanciaSol
     * @param distanciaLuna 
     */
    public CuerpoCeleste(int id, String nombre, double masa, int densidad, int diametro, double distanciaSol, double distanciaLuna) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.distanciaLuna = distanciaLuna;
    }

    

    
    
}
 


