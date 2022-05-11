/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioStream;

import ejercicio2.RegistroJSON;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hinda
 */
public class Estadistica {
    private ArrayList<Integer> listaCalificacion;

    public Estadistica() {
        
    }

    public Estadistica(ArrayList<Integer> listaCalificacion) {
        this.listaCalificacion = listaCalificacion;
    }

    public ArrayList<Integer> getListaCalificacion(ArrayList<RegistroJSON> listaRegistros) {
        return listaCalificacion;
    }

    public void setListaCalificacion(ArrayList<Integer> listaCalificacion) {
        this.listaCalificacion = listaCalificacion;
    }

    @Override
    public String toString() {
        return "Estadistica{" + "listaCalificacion=" + listaCalificacion + '}';
    }
    
    private List<String> calificacionesporModelo(String inicial,ArrayList<RegistroJSON> lista){
        List<String> calificacion = null;
        
        //calificacion = lista.stream();
             
        
        return calificacion;
                
    } 
    
    public static int isNumerico(String cadena){
        try{
            return Integer.parseInt(cadena);
        }catch(NumberFormatException nfe){
            return -1;
        }    
    }

    
}
