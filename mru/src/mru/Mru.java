/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mru;

/**
 *
 * @author Mela
 */
public class Mru {
     public double calcularVelocidad(double distancia,double tiempo){
        return distancia/tiempo;
    }
    
    public double calcularDistancia(double tiempo,double velocidad){
        return velocidad*tiempo;
    }
    public double calcularTiempo(double distancia,double velocidad){
        return distancia/velocidad;
    }
}
