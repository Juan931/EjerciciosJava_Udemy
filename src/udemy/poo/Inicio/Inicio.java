/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.Inicio;

import udemy.poo.codigo.juego;

/**
 *
 * @author Nicolas
 */
public class Inicio {
    public static void main(String[] args) {
        juego[] juego = new juego[10];
        
        for (int i = 0; i < 10; i++) {
            juego[i]= new juego();
        }
        int indice = 1;
        
        for (juego juegos : juego) {
            juegos.iniciarJuego("Jugador: " + indice);
            indice ++;
        }
    }
}
