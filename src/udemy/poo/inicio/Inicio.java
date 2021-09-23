/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import javax.swing.JOptionPane;
import udemy.poo.codigo.TiroParabolico;

/**
 *
 * @author Nicolas
 */
public class Inicio {
    public static void main(String[] args) {
       String datoUno= JOptionPane.showInputDialog(null,"Dame la velocidad inicial: ");
        float numUno=Float.parseFloat(datoUno);
        String datoDos= JOptionPane.showInputDialog(null,"Dame el grado ");
        int numDos=Integer.parseInt(datoDos);
        TiroParabolico objetoUno= new TiroParabolico(numUno, numDos);
        
        JOptionPane.showMessageDialog(null, "La altura maxima es : " + objetoUno.alturaMaxima() + "\n" +
                 "el alcance es: "+ objetoUno.alcance() + "Resultado" + JOptionPane.INFORMATION_MESSAGE);
    }
}
