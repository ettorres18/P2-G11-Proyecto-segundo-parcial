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
public class Reporte{
    private Juego fecha;
    private Juego duracion;
    private Juego ganador;
    private Configuracion numOponentes;
    private Juego alineacion;
    
    public Reporte(Juego fecha, Juego duracion, Juego ganador, Configuracion numOponentes, Juego alineacion){
        this.fecha = fecha;
        this.duracion = duracion;
        this.ganador = ganador;
        this.numOponentes = numOponentes;
        this.alineacion = alineacion;
    }
    
    public Juego getFecha() {
        return fecha;
    }
    public Juego getDuracion() {
        return duracion;
    }
    public Juego getGanador() {
        return ganador;
    }
    public Juego getNumOponentes() {
        return numOponentes;
    }
    public Juego getAlineacion() {
        return alineacion;
    }
}
