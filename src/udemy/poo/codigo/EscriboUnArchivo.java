/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas
 */
public class EscriboUnArchivo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/archivo.txt");// acá úedo crear el archivo que yo quiera poniendole el nombre "/archivo"
            fo = new FileOutputStream(f);
            ObjectOutput ou = new ObjectOutputStream(fo);
            //Acá escribiremos a la persona en el archivo
            ou.writeObject(new Persona("Juan", "Perez","Medina", 21));
            ou.writeObject(new Persona("Pepe", "Perez","Medina", 23));
            ou.writeObject(new Persona("Maria", "Perez","Medina", 25));
            ou.writeObject(new Persona("Rosa", "Perez","Medina", 28));
            ou.writeObject(new Persona("Martha", "Perez","Medina", 30));
            ou.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
