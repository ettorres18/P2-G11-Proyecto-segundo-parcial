/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.clases;

import com.pooespol.clases.Carta;

/**
 *
 * @author Torres Jara
 */
public class CartaJuego {
    private Carta carta;
    private boolean marcada;

    public Carta getCarta() {
        return carta;
    }

    public CartaJuego(Carta carta) {
        this.carta = carta;
        marcada = false;
    }
    public void marcaCarta(){
        marcada=true;
    }
    
    
}
