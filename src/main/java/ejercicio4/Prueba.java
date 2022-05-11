/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio1.LecturaCSV;
import ejercicio2.LecturaJSON;
import ejercicio2.RegistroJSON;
import ejercicio3.Alumnado;
import ejercicio3.RegistrosToAlumnado;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        
        TreeMap<String,String> mapDesdeFichero=LecturaCSV.LecturaCSV("nombresModulos.csv", "./");
        List<RegistroJSON> notas = LecturaJSON.LeerFicheroJson("calificacionesGrupo.json","./");
        List<Alumnado> alumnos = RegistrosToAlumnado.registrosToAlumnados((ArrayList<RegistroJSON>) notas);
        
        Alumnado delia = alumnos.stream().filter(a -> a.getNombreAlumno().contains("Delia")).findFirst().get();
        AlumnadoToCSV.alumnadoToCsv(delia, mapDesdeFichero);
      
   
      
    }
}
