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
    public int numeroAdivinado;
    
    @Override
    public void run(){
        numeroAdivinado = (int)Math.ceil(Math.random() * 10.0) + 1;
        Random r = new Random();
        numeroAdivinado = r.nextInt((6 - 3) + 1) + 3;
    }
    
    public void añadirAdivinador(Adivinador adivinador){
    
    }
    
    public void tomarIntento(int adivinacion){
        
    }
    
    public void darPistas(){
    
    }
}
