/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.io.Serializable;

/**
 *
 * @author Nicolas
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String apelldioPaterno;
    private String apellidoMaterno;
    private int edad;

    public Persona(String nombre, String apelldioPaterno, String apellidoMaterno, int edad) {
        this.nombre = nombre;
        this.apelldioPaterno = apelldioPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldioPaterno() {
        return apelldioPaterno;
    }

    public void setApelldioPaterno(String apelldioPaterno) {
        this.apelldioPaterno = apelldioPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", Apellido Paterno: " + apelldioPaterno 
                + ", Apellido Materno: " + apellidoMaterno + ", Edad: " + edad ;
    }
    
    
    
}
