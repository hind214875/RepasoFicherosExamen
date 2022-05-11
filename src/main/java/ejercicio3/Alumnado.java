/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class Alumnado implements Comparable<Alumnado> {
    private String nombreAlumno;
    private TreeMap<String,String> mapa;

    //constrectores
    public Alumnado(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.mapa=new TreeMap<>();
    }

    public Alumnado() {
    }
    
    //getters y setters 
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Map<String, String> getMapa() {
        return mapa;
    }

    public void setMapa(TreeMap<String, String> mapa) {
        this.mapa = mapa;
    }
    
    //tostring
    @Override
    public String toString() {
        String moduloNota="";
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
               moduloNota="["+entry.getKey()+": "+entry.getValue()+"] ";
        };
        
        return "["+nombreAlumno +"]"+ "\n"
                + "["+moduloNota+"]";
                }
    
    
    
    @Override
    public int compareTo(Alumnado o) {
        return this.nombreAlumno.compareToIgnoreCase(o.nombreAlumno);
    }
    
    
}
