/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.time.LocalDate;

/**
 *
 * @author hinda
 */

public class Persona {
    private String nombre;
    private String nota;
    private LocalDate date;

    public Persona() {
    }

    public Persona(String nombre, String nota, LocalDate date) {
        this.nombre = nombre;
        this.nota = nota;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public LocalDate getdate() {
        return date;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return nombre + ";" + nota + ";" + date;
    }
    
    
    
}
