/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class LeerJsonDate {
      public static ArrayList<Persona> LeerFicheroJson(String idFichero, String ruta) {
        ArrayList<Persona> lista = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        
        try {
            mapeador.registerModule(new JavaTimeModule());
            lista = mapeador.readValue(new File(ruta+idFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Persona.class));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
