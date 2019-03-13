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
public class GuiaParcial2SistemasDistribuidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generador generador = new Generador();
        generador.start();
        
        Adivinador adivinador = new Adivinador(generador);
        adivinador.start();
    }
    
}
