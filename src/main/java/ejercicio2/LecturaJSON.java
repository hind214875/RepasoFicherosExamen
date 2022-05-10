/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hinda
 */
public class LecturaJSON {

    public static ArrayList<RegistroJSON> lecturaJson(String idFichero, String ruta) {
        ArrayList<RegistroJSON> listaObjetos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            //mapeador.registerModule(new JavaTimeModule());
            listaObjetos = mapeador.readValue(new File(ruta+idFichero),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listaObjetos;
    }

}
