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
           float v0y=(float) (this.velocidadInicial * Math.sin(Math.toRadians(grado))); //(float) esto es castear a flotante
           float tiempo =v0y / this.gravedad;
           float y = (float) (v0y * tiempo -(4.9f * Math.pow(tiempo, 2)));
           return y;
       }
       public float alcance(){
           float v0x=(float) (this.velocidadInicial * Math.cos(Math.toRadians(grado))); //(float) esto es castear a flotante
            float tiempo=(float) (2*((this.velocidadInicial * Math.sin(Math.toRadians(grado)))/this.gravedad));
            float x= (v0x * tiempo);
           return x;
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
