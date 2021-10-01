/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.Elipse;
import udemy.poo.codigo.ElipseDos;
import udemy.poo.codigo.ElipseImplements;
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
        ElipseDos elpDos = new ElipseDos(3, 2, 3, 2);
        ElipseImplements elpImp = new ElipseImplements(3, 2);
        Rectangulo rec = new Rectangulo(4, 4);
        Empleado emp = new Empleado("JhoN ", 10000);
        JefeDeArea jef = new JefeDeArea("Juan", 20000);
        
        
        /*JOptionPane.showMessageDialog(null, elp.area() + "\n" + rec.area());
        JOptionPane.showMessageDialog(null, emp.incrementoSueldo());
        JOptionPane.showMessageDialog(null, jef.incrementoSueldo());*/
        JOptionPane.showMessageDialog(null,"Area de Elipse (abstract)" + elp.area() + "\n" 
                +"Area de Elipse (Normal)" + elpDos.area() + "\n"
                +"Area de Elipse (Interface)" + elpImp.area() + "\n" );
    }
}
