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
public class ElipseDos extends FiguraDos {
    private double ejeUno;
    private double ejeDos;

    public ElipseDos(double ejeUno, double ejeDos, double x, double y) {
        super(x, y);
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }
    
    
    @Override
    public double perimetro() {
         return (Math.PI *(3* (ejeUno * ejeDos)) - 
                (Math.sqrt((3* ejeUno + ejeDos)*(ejeUno + 3 * ejeDos)))); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area() {
         return (Math.PI *(3* (ejeUno * ejeDos)) - 
                (Math.sqrt((3* ejeUno + ejeDos)*(ejeUno + 3 * ejeDos))));
    }

    public double getEjeUno() {
        return ejeUno;
    }

    public void setEjeUno(double ejeUno) {
        this.ejeUno = ejeUno;
    }

    public double getEjeDos() {
        return ejeDos;
    }

    public void setEjeDos(double ejeDos) {
        this.ejeDos = ejeDos;
    }
    
    
    
}
