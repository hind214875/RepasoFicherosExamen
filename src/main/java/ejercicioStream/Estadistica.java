/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioStream;

import ejercicio2.RegistroJSON;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<Integer> getListaCalificacion(ArrayList<RegistroJSON> listaRegistros,String inicial) {
       List<Integer> notas=new ArrayList<>();
       /*  notas=listaRegistros.stream()
                            .filter(r->r.getcEAC().equals(inicial)|| r.geteA().equalsIgnoreCase(inicial)||r.getfOL().equals(inicial)||
                                    r.getiNG().equals(inicial)||r.getoACV().equals(inicial)||r.gettC().equals(inicial)||r.gettII().equals(inicial))
                            .collect(Collectors.toList());*/
       return notas;
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
        
        //calificacion = lista.stream()
                           
             
        
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
