/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.OperacionesRacionales;
import udemy.poo.codigo.Racional;

/**
 *
 * @author Nicolas
 */
public class Inicio {
    public static void main(String[] args) {
        String datoUno = JOptionPane.showInputDialog(null, "Dame el numerador 1: ");
        String datoDos = JOptionPane.showInputDialog(null, "Dame el denominador 1: ");
        
        String datoTres = JOptionPane.showInputDialog(null, "Dame el numerador 2 : ");
        String datoCuatro= JOptionPane.showInputDialog(null, "Dame el denominador 2 : ");
    
        int numUno = Integer.parseInt(datoUno);
        int denUno = Integer.parseInt(datoDos);
        int numDos = Integer.parseInt(datoTres);
        int denDos = Integer.parseInt(datoCuatro);
        
        Racional objUno= new Racional(numUno, denUno);
        Racional objDos= new Racional(numDos, denDos); 
        
        OperacionesRacionales op = new OperacionesRacionales(objUno, objDos);
        
        //Guarda en variables operaciones
        Racional objTres = op.suma();
        Racional objCuatro = op.resta();
        
        JOptionPane.showMessageDialog(null, "La suma de " + objUno + " + " + objDos + " = " + objTres + "\n" 
                +  "La resta de " + objUno + " - " + objDos + " = " + objCuatro + "\n"  
                + "La multiplicacion de " + objUno + " * " + objDos + " = " + op.multiplicacion() + "\n"
                  +  "La division  de " + objUno + " / " + objDos + " = " + op.division() + "\n");
        
    }
   
}
