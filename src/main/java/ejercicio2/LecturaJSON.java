/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class LecturaJSON {

    public static ArrayList<RegistroJSON> LeerFicheroJson(String idFichero, String ruta) {
        ArrayList<RegistroJSON> lista = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        
        try {
           // mapeador.registerModule(new JavaTimeModule());
            lista = mapeador.readValue(new File(ruta+idFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
