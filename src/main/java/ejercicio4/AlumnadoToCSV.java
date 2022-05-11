/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio3.Alumnado;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class AlumnadoToCSV {

    public static void escritura(Alumnado alumnado, TreeMap<String, String> mapa) {
        crearDirectorio("./alumnado");
        String nombreSinEspacio = alumnado.getNombreAlumno().replaceAll(" ", "");
        nombreSinEspacio = nombreSinEspacio.replaceAll(",", "-");

      
    }

    public static void crearDirectorio(String ruta) {
        Path file = Paths.get(ruta);
        try {
            if (!Files.exists(file)) {
                Files.createDirectory(file);
                System.out.println("el directorio se crea correctamente");
            }
        } catch (FileAlreadyExistsException faee) {
            System.out.println("no puede crear porque existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
