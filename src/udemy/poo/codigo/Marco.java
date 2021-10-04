/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
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
        
        // Toolkit
        Toolkit Kit = Toolkit.getDefaultToolkit();
        Dimension pantalla = Kit.getScreenSize();
        int altura = pantalla.height;
        int anchura = pantalla.width;
        this.setSize(anchura / 2, altura /2 );
        this.setLocation(anchura / 4, altura / 4);
        
        this.setTitle("Programacion con Swing");
        
        
        //Agregar lamina
        Lamina lamina = new Lamina(new Dimension(anchura / 2, altura /2));
        this.add(lamina);
    }
    
    
    
}
