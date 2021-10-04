/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JFrame;
import udemy.poo.codigo.Marco;


// de esta forma java nos hace nuestro marco

/**
 *
 * @author Nicolas
 */
public class PruebaVentana {
    public static void main(String[] args) {
        Marco mc = new Marco();
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mc.setVisible(true);// de esta forma java nos hace nuestro marco
    }
}
