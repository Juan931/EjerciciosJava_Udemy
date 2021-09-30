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
public abstract class Figura {// se utiliza la palabra reservada abstract para decir que la clase es abstracta
    private double x;
    private float y;

    public Figura() {
    }

    
    public Figura(double x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public abstract double area(); //Metodo abstracto
    public abstract double perimetro();
    
}
