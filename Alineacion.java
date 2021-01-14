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
public class Alineacion {
    private ArrayList<String> ubicacion;
    private ArrayList<String> nombre;
    
    public voidseleccionarAlineacion(){
        Random random = new Random();
        int indice= random.nextInt(ubicacion.size());
        System.out.println(nombre.get(indice));
    }
    
}
