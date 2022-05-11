/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio2.LecturaJSON;
import ejercicio2.RegistroJSON;
import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        String idFichero = "calificacionesGrupo.Json";
        String ruta = "./";
        ArrayList<RegistroJSON> listaJson = LecturaJSON.LeerFicheroJson(idFichero, ruta);
        RegistrosToAlumnado.registrosToAlumnados(listaJson).forEach(System.out::println);
        
        
    }
}
