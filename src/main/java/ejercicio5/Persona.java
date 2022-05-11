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
    private LocalDate hora;

    public Persona() {
    }

    public Persona(String nombre, String nota, LocalDate hora) {
        this.nombre = nombre;
        this.nota = nota;
        this.hora = hora;
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

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return nombre + ";" + nota + ";" + hora;
    }
    
    
    
}
