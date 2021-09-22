/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

/**
 *
 * @author Nicolas
 */
public class TiroParabolico {
       private float velocidadInicial;
       private int grado;
       private float gravedad= 9.8f;// siempre se debe poner la f al final para que nos nos presente ningun problema

    public TiroParabolico(float velocidadInicial, int grado) {
        this.velocidadInicial = velocidadInicial;
        this.grado = grado;
    }
       
       public float alturaMaxima(){
           return 0.0f;
       }
       public float alcance(){
           return 0.0f;
       }

    /**
     * @return the velocidadInicial
     */
    public float getVelocidadInicial() {
        return velocidadInicial;
    }

    /**
     * @param velocidadInicial the velocidadInicial to set
     */
    public void setVelocidadInicial(float velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    /**
     * @return the grado
     */
    public int getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado) {
        this.grado = grado;
    }

    /**
     * @return the gravedad
     */
    public float getGravedad() {
        return gravedad;
    }

    /**
     * @param gravedad the gravedad to set
     */
    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }
}
