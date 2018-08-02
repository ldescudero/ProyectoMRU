/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFisica;

/**
 *
 * @author Mela
 */
public class Mruv {

    public Mruv() {
    }
    
    public double calcularVelocidadFinal(double vi,double ac,double tiempo){
        return vi+(ac*tiempo);
    }
    
    public double calcularDistancia(double vi,double vf,double tiempo){
        return ((vi+vf)/2)*tiempo;
    }
    public double calcularTiempo(double vi,double vf,double aceleracion){
        return (vf-vi)/aceleracion;
    }
    
    public double calcularAceleracion(double vi,double vf,double tiempo){
         return (vf-vi)/tiempo;
    }
}
