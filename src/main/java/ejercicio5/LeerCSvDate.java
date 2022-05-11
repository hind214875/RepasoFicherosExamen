/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class LeerCSvDate {
       public static TreeMap<String,LocalDate> leerFicheroCsv(String idFichero) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        TreeMap<String,LocalDate> mapa = new TreeMap<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new File(idFichero))) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                linea = linea.replaceAll("\"", "");//para quitar las comillas dobles
                linea = linea.replaceAll(" ", "");//para quitar espacios en blanco
                // Se guarda en el array de String cada elemento de la
                tokens = linea.split(";");
                //implementa lo que tienes que hacer
                //crear objeto 
                mapa.put(tokens[0], LocalDate.parse(tokens[2]));
               
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return mapa;
    }
       
    /**
     *
     * @param <T>
     * @param idFichero
     * @return
     */
       //devuelve una Lista
    public static List<Persona> leerFicheroCsvFecha(String idFichero) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        List<Persona> lista=new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new File(idFichero))) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                linea = linea.replaceAll("\"", "");//para quitar las comillas dobles
                linea = linea.replaceAll(" ", "");//para quitar espacios en blanco
                // Se guarda en el array de String cada elemento de la
                tokens = linea.split(";");
                //implementa lo que tienes que hacer
                //crear objeto 
                Persona p=new Persona();
                p.setNombre(tokens[0]);
                p.setNota(tokens[1]);
                //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM yyyy");
                p.setdate(LocalDate.parse(tokens[2]));
                lista.add(p);
               
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
