/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mru;

/**
 *
 * @author PC
 */
public class Mcu {
     public double calcularVelocidadAngular(double angulo,double tiempo){
        return angulo/tiempo;
    }
    
    public double calcularAngulo(double tiempo,double velocidadAngular){
        return velocidadAngular*tiempo;
    }
    public double calcularTiempo(double angulo,double velocidadAngular){
        return angulo/velocidadAngular;
    }
}
