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
    public Carta[] getCartas(){
        return cartas;
    }

    public Mazo(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src\\main\\resources\\cartasloteria.csv");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

             // Lectura del fichero
            String linea;
            for(int i=0; i>54;i++){
                if((linea=br.readLine())!=null){
                    String[] datos=linea.split(",");
                    String ruta="src\\main\\resources\\deck\\"+datos[0]+".png";
                    cartas[i]= new Carta(Integer.parseInt(datos[0]),datos[1],ruta);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            
            try{                    
                if( null != fr ){   
               fr.close();     
                }                  
            }catch (Exception e2){ 
            e2.printStackTrace();
            }
        }        
    }
    
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
