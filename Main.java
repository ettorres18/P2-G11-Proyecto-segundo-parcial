/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Reporte.java;

/**
 *
 * @author alecs
 */
class Main{
public ArrayList<Reporte> reporte;

public Main(){
reporte = new ArrayList<>();
}

public void mostrarReporte(){
    for (Reporte r:reporte){
        System.out.print("----Fecha------Duracion-----Ganador----Oponentes-----Alineacion-----");
        System.out.print("   "+r.getFecha(),+"    "+r.getDuracion,+"    "+r.getGanador,+"   "+r.getJugadores,+"   "+r.getAlineacion)
    }
}
}
