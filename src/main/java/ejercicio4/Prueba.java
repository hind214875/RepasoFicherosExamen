/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio1.LecturaCSV;
import java.util.Map;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        
        Map<String,String> mapDesdeFichero=LecturaCSV.LecturaCSV("nombresModulos.csv", "./");
            // AlumnadoToCSV.escritura(alumnado, mapDesdeFichero);
      
   
      
    }
}
