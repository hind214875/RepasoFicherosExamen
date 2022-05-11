/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class Main {

    public static void main(String[] args) {
        escribirJSON("persona.json",newPerson());
        escrituraFicheroCsv("persona.csv",newPerson());
        LeerJsonDate.LeerFicheroJson("persona.json", "./").forEach(System.out::println);
        
        TreeMap<String,LocalDate> mapa=LeerCSvDate.leerFicheroCsv("./persona.csv");
        for (Map.Entry<String, LocalDate> entry : mapa.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
            
        }
        
        List<Persona> lista=LeerCSvDate.leerFicheroCsvFecha("persona.csv");
        lista.forEach(System.out::println);
        //crear objeto typo comparator
         Comparator<Persona> criterioNombre= ( l1, l2)->l1.getNombre().compareTo(l2.getNombre());
         Comparator<Persona> criterioDate= ( l1, l2)->l1.getdate().compareTo(l2.getdate()); 
         //comaparar con dos critirios
         Comparator<Persona> critirioNombreDate=criterioNombre.thenComparing(criterioDate);
         //ordenar con los dos critirios
         Collections.sort(lista,critirioNombreDate);
         lista.forEach(System.out::println);

        
    }

    //crear una lista de persona para que puedo leerla
    private static ArrayList<Persona> newPerson() {
        Persona person = new Persona();

        ArrayList<Persona> lista = new ArrayList<>();
        Persona p = new Persona("saida", "7", LocalDate.now());
        Persona p1 = new Persona("hind", "7", LocalDate.now());
        Persona p2 = new Persona("wiam", "7", LocalDate.now());
        lista.add(p);
        lista.add(p1);
        lista.add(p2);

        return lista;
    }

    //crear el fichero Json desde una lista
    public static <T> void escribirJSON(String nombre, List<T> datos) {
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.registerModule(new JavaTimeModule()); //Formato fechas

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mappeador.writeValue(new File(nombre), datos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //escribir fichero csv para que leerlo despues
     public static <T> void escrituraFicheroCsv(String idFichero, ArrayList<T> lista) {

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (T obj : lista) {
                flujo.write(obj.toString());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
