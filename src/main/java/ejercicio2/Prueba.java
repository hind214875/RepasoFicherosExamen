/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        String idFichero = "calificacionesGrupo.Json";
        String ruta = "./";
        LecturaJSON.lecturaJson(idFichero, ruta).forEach(System.out::println);
    }
}
