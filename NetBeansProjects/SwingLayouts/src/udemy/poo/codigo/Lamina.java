/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.BorderPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Nicolas
 */
public class Lamina extends JPanel implements ActionListener{
    private JPanel panel = new JPanel();
    private JButton button = new JButton("Agregar");
    private JTextField cajaTexto =  new JPasswordField(30);
    private JTextArea areaTexto = new JTextArea(10, 20);
    private JScrollPane scroll;

    public Lamina() {
        //Añadir el scroll al area de texto;
        this.scroll = new JScrollPane(this.areaTexto);
        
        //Agregar evento al oyente del boton 
        this.button.addActionListener(this);
        
        //Agregar los componentes al panel;
        panel.add(button);
        panel.add(cajaTexto);
        
        // Crear el border layout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(new TitledBorder("Componentes de Swing"));
        borderPanel.add(panel, BorderLayout.CENTER);
        this.add(borderPanel);
        this.add(scroll);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen= e.getSource();
        
        //Si el boton genera el vento
        
        if (origen == this.button) {
            //Tomar el texto de caja de texto
            this.areaTexto.append(this.cajaTexto.getText() + "\n");
            
            //Limpiar la caja de texto
            this.cajaTexto.setText("");
            //transferir el foco al boton 
            this.button.transferFocus();
        }
 
    }
    
}
