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
public class OperacionesRacionales {
    
    private Racional racionalUno;
    private Racional racionalDos;

    public OperacionesRacionales(Racional racionalUno, Racional racionalDos) {
        this.racionalUno = racionalUno;
        this.racionalDos = racionalDos;
    }
    
    public Racional suma(){
        int numerador = (this.racionalUno.getNumerador() * this.racionalDos.getDenominador())
                + (this.racionalUno.getDenominador() *this.racionalDos.getNumerador());
        int denomindor   = this.racionalUno.getDenominador() *this.racionalDos.getDenominador();
        return new Racional(numerador, denomindor);
    }
     public Racional resta(){
        int numerador = (this.racionalUno.getNumerador() * this.racionalDos.getDenominador())
                - (this.racionalUno.getDenominador() *this.racionalDos.getNumerador());
        int denomindor   = this.racionalUno.getDenominador() *this.racionalDos.getDenominador();
        return new Racional(numerador, denomindor);
    }
     public Racional multiplicacion(){
         int numerador = this.racionalUno.getNumerador() * this.racionalDos.getNumerador();
         int denominador = this.racionalDos.getDenominador() * this.racionalDos.getDenominador();
         return new Racional(numerador, denominador);
     }
            
     public Racional division (){
         int numerador = this.racionalUno.getNumerador() * this.racionalDos.getDenominador();
         int denominador = this.racionalUno.getDenominador() * this.racionalDos.getNumerador();
         return new Racional(numerador, denominador);
     }

    public Racional getRacionalUno() {
        return racionalUno;
    }

    public Racional getRacionalDos() {
        return racionalDos;
    }
    
}
