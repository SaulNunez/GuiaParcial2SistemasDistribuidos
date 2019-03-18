/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaparcial2sistemasdistribuidos;

import java.util.Random;

/**
 *
 * @author sauln
 */
public class Generador extends Thread {
    private static final int INTENTOS_POSIBLES = 5;
    private int numeroAdivinado;
    private int intentos = INTENTOS_POSIBLES;
    
    public enum Pistas { NADA, INTENTA_MAYOR, INTENTA_MENOR, CORRECTO, INTENTOS_ACABADOS }
    
    @Override
    public void run(){
        // Seleccionamos un número para comenzar
        // Math random retorna un numero entre 0 y 0.999999, pero no 1, imaginatelo como una asimptota shitty
        // Math.ceil retorna el entero del numero
        // Sumamos uno para que de 0-9 sea 1-10 
        numeroAdivinado = (int)Math.floor(Math.random() * 10.0) + 1;
        System.out.println("*Generador: Elijo el " + Integer.toString(numeroAdivinado) + "*");
    }
    
    public Pistas intento(int adivinacion){
        System.out.println("Generador: Dijiste " + Integer.toString(adivinacion));
        System.out.println("Generador: Tienes disponibles " + Integer.toString(intentos - 1) + " intentos");
        intentos--;
        
        if(intentos <= 0){
            return Pistas.INTENTOS_ACABADOS;
        }
        
        if(adivinacion > numeroAdivinado){
            return Pistas.INTENTA_MENOR;
        } else if (adivinacion < numeroAdivinado){
            return Pistas.INTENTA_MAYOR;
        } else {
            System.out.println("Generador: Ganaste :D");
            return Pistas.CORRECTO;
        }
    }
    
    public boolean todaviaMeQuedanIntentos(){
        return intentos > 0; 
        
    }
}
