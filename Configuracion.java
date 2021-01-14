/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pooespol.proyectop2g11;
import java.util.*;

/**
 *
 * @author alecs
 */
public class Configuracion {
    private boolean visible;
    private int numOponentes;
    

    public Configuracion(boolean visible, int numOponentes){
        this.visible = visible;
        this.numOponentes = numOponentes
    }
    public boolean isVisible(){
        return visible;
    }
    
    public void setVisible(boolean visible){
        this.visible = visible;
    }
    public Configuracion getNumOponentes(){
        return numOponentes
    }
}
