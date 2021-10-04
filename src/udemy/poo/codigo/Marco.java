/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Nicolas
 */
public class Marco extends JFrame {
    
    private static final int anchura =300;
    private static final int altura =  300;

    public Marco() throws HeadlessException {
        this.setSize(anchura, altura);
        this.setLocationRelativeTo(this);
    }
    
    
    
}
