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
public class Adivinador extends Thread {
    private final Generador generador;
    private int min = 1;
    private int max = 10;
    
    public Adivinador(Generador generador){
        this.generador = generador;
    }
    
    @Override
    public void run(){
        Random random = new Random();
        // Next int saca numeros desde el cero hasta <max
        // Por eso usamos el floor para obtener numeros desde el cero hasta max y en int
        // Ademas, nuestro rango no es cero, así que sumamos min a cero
        Generador.Pistas pistaActual = generador.intento((int)Math.floor(random.nextInt(max - min + 1)) + min);
        while(pistaActual != Generador.Pistas.Correcto){
        
        }
    }

    public void IntentosTerminados() {
        System.out.println("Adivinador: :(");
    }
}
