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
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class AlumnadoToCSV {
    
    public static void alumnadoToCsv(Alumnado alumno , TreeMap<String,String> datosEj1){
        crearDirectorio("./alumnado");
        String nombreSinEspacio = alumno.getNombreAlumno().replaceAll(" ","");
        nombreSinEspacio=nombreSinEspacio.replaceAll(",","-");

        Map<String,String> notasAlumno = new TreeMap<>();
        
        for(Map.Entry<String,String> entry : datosEj1.entrySet()){
            for(Map.Entry<String,String> entryAlumno : alumno.getMapa().entrySet()){
                if(entry.getKey().equals(entryAlumno.getKey())){
                    notasAlumno.put(entry.getValue(),entryAlumno.getValue());
                }
            }
        }

        escribirCsv("./alumnado/"+nombreSinEspacio+".csv",notasAlumno);
    }
    
    private static <T> void escribirCsv(String nombre, Map<T,T> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for(Map.Entry<T,T> entry : datos.entrySet()){
                bw.write(entry.getKey() + "\t" + entry.getValue());
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
