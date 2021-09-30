/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

/**
 *
 * @author Nicolas
 */
public class Credito {
    private int credito= 10;

    public Credito() {
    }
    
    public void decremento(){
        credito --;
    }
    public void incremento(){
        credito ++;
    }

    public int getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "Credito{" + "credito=" + credito + '}';
    }
    
    
}
