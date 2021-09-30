/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Elipse;
import udemy.poo.codigo.Empleado;
import udemy.poo.codigo.JefeDeArea;
import udemy.poo.codigo.Rectangulo;

/**
 *
 * @author Nicolas
 */
public class Inicio {
    public static void main(String[] args) {
        Elipse elp = new Elipse(3, 2);
        Rectangulo rec = new Rectangulo(4, 4);
        Empleado emp = new Empleado("JhoN ", 10000);
        JefeDeArea jef = new JefeDeArea("Juan", 20000);
        
        
        JOptionPane.showMessageDialog(null, elp.area() + "\n" + rec.area());
        JOptionPane.showMessageDialog(null, emp.incrementoSueldo());
        JOptionPane.showMessageDialog(null, jef.incrementoSueldo());
        
    }
}
