/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Map;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        String ruta="./";
        String idFichero="nombresModulos.csv";   
        Map<String,String> mapDesdeFichero=LecturaCSV.LecturaCSV(idFichero, ruta);
        
         // iterate over TreeMap entries
        for (Map.Entry<String, String> entry :
             mapDesdeFichero.entrySet()) {
            System.out.println(entry.getKey() + " : "
                               + entry.getValue());
        }
        
    }
}
