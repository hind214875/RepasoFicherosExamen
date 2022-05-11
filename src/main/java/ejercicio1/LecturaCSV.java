/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class LecturaCSV {

    public static TreeMap<String, String> LecturaCSV(String idFichero, String ruta) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        TreeMap<String, String> mapaOrdenada = new TreeMap<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new File(ruta + idFichero))) {
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                linea = linea.replaceAll(" ", "");//para quitar espacios en blanco
                // Se guarda en el array de String cada elemento de la
                tokens = linea.split(";");

                String nombre = tokens[0];
                String descripcion = tokens[1];
                
                if (!nombre.equals(" ") && !descripcion.equals(" ")) {
                    mapaOrdenada.put(nombre, descripcion);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return mapaOrdenada;
    }
}
