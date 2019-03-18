/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaparcial2sistemasdistribuidos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Generador.Pistas pistaActual;
        int intento;
        do {
            intento = (int)Math.floor(random.nextInt(max - min + 1)) + min;
            System.out.println("Adivinador: Elijo el " + Integer.toString(intento));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Adivinador.class.getName()).log(Level.SEVERE, null, ex);
            }
            pistaActual = generador.intento(intento);
            switch(pistaActual){
                case INTENTA_MAYOR:
                    min = intento;
                    break;
                case INTENTA_MENOR:
                    max = intento;
                    break;
                case INTENTOS_ACABADOS:
                    System.out.println("Adivinador: :(");
                    break;
                case CORRECTO:
                    System.out.println("Adivinador: :D");
                    break;
            }
            
        } while (pistaActual != Generador.Pistas.CORRECTO 
                && generador.todaviaMeQuedanIntentos());
    }
}
