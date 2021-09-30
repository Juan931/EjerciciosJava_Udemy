/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.util.Random;

/**
 *
 * @author Nicolas
 */
public class Dado {
    private int cara;

    public Dado() {
    }
    
    public void lanzar(){
        Random rd = new Random();
        this.cara = rd.nextInt(6) + 1;
        
    }

    public int getCara() {
        return cara;
    }
    
    
}
