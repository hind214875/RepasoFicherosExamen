/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class LecturaCSV {

    public static ArrayList<Map<String, String>> LecturaCSV(String idFichero, String ruta) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        ArrayList<Map<String, String>> listaAux = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new File(idFichero))) {
            // Guarda la línea completa en un String
            linea = datosFichero.nextLine();
            // Se guarda en el array de String cada elemento de la
            tokens = linea.split(";");
            //crear objeto mapa
            Map<String, String> mapa = new TreeMap<>();
            

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaAux;
    }
}
