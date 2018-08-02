/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFisica;

/**
 *
 * @author PC
 */
public class MovParabolico {
     public double calcularVelocidad(double angulo,double distancia){
         System.out.println(""+Math.sin(angulo));
         System.out.println(""+Math.sqrt((distancia*9.8)));
        return Math.sqrt((distancia*9.8)/(2*Math.sin(angulo)*Math.cos(angulo)));
    }
    
    public double calcularAngulo(double tiempo,double velocidadAngular){
        return velocidadAngular*tiempo;
    }
    public double calcularDistancia(double velocidad,double angulo){
        System.out.println(""+Math.sin(angulo));
        return (2*Math.pow(velocidad, 2)*Math.sin(angulo)*Math.cos(angulo))/9.8;
    }
    public double gradosARadianes(double grados){
        return (grados*Math.PI)/180;
    }
}
