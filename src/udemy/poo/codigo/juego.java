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
public class juego {
    private jugador jugador;
    private Dado dadoUno;
    private Dado dadoDos;
    int resultado = 1;

    public juego() {
    }
    
    public void iniciarJuego(String nombre){
        this.jugador = new jugador(nombre);
        this.dadoUno = new Dado();
        this.dadoDos = new Dado();
    
        while(this.jugador.getCredito().getCredito() > 0){
            comprobarResultado();
            System.out.println(this.jugador.toString());
        }
    }

    private void comprobarResultado() {
        this.dadoUno.lanzar();
        this.dadoDos.lanzar();
        int suma = this.dadoUno.getCara() +  this.dadoDos.getCara();
 
        if (suma ==7) {
            this.jugador.getCredito().incremento();
            System.out.println("Ha ganado " + resultado + " veces");
            resultado ++;
        } else {
            this.jugador.getCredito().decremento();
        }
    }
    
}
