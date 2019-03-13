/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaparcial2sistemasdistribuidos;

/**
 *
 * @author sauln
 */
public class Adivinador extends Thread implements IAdivinador {
    private Generador generador;
    
    public Adivinador(Generador generador){
        this.generador = generador;
    }
    
    @Override
    public void run(){
    
    }

    @Override
    public void IntentosTerminados() {
        System.out.println("Adivinador: :(");
    }
}
