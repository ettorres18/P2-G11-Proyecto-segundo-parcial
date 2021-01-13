/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proyectop2g11;
import java.util.*;

/**
 *
 * @author Torres Jara
 */
public class Mazo {
    private Carta[] cartas;
    
    public void barajar(){
        int indice;
        Carta temp;
        Random random = new Random();
        for (int i = cartas.length - 1; i > 0; i--){
            indice = random.nextInt(i + 1);
            temp = cartas[indice];
            cartas[indice] = cartas[i];
            cartas[i] = temp;
        }
    }
    public void mostrarCarta(){
        for (Carta carta:cartas){
            System.out.println(carta.getNumero());
            System.out.println(carta.getNombre());
            }
    }
    
}
