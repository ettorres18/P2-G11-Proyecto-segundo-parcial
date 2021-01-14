/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.clases;
import java.util.*;

/**
 *
 * @author Torres Jara
 */
public class Tablero {
    private Carta[] cartas=new Carta[16];
    
    public void llenarTablero(Carta[] c){
        int indice;
        Carta temp;
        Random random = new Random();
        for (int i = cartas.length - 1; i > 0; i--){
            indice = random.nextInt(i + 1);
            temp = c[indice];
            cartas[indice] = cartas[i];
            cartas[i] = temp;
        }
    }
    
}
