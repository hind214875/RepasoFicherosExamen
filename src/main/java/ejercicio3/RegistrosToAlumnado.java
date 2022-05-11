/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio2.RegistroJSON;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class RegistrosToAlumnado {

    public static ArrayList<Alumnado> registrosToAlumnados(ArrayList<RegistroJSON> lista) {
        ArrayList<Alumnado> listaAlumnado = new ArrayList<>();
        
        
        
        for (RegistroJSON rj : lista) { 
            Alumnado e=new Alumnado();
            e.setNombreAlumno(rj.getAlumnoA());
            
            TreeMap<String, String> myMap = new TreeMap<>();
            
            myMap.put("OACV", rj.getoACV());
            myMap.put("EA", rj.geteA());
            myMap.put("TII", rj.gettII());
            myMap.put("TC", rj.gettC());
            myMap.put("ING", rj.getiNG());
            myMap.put("FOL", rj.getfOL());
            myMap.put("CEAC", rj.getcEAC());  
            e.setMapa(myMap);
           
           listaAlumnado.add(e);                  
        }
            Collections.sort(listaAlumnado);
        return listaAlumnado;
    }
}
