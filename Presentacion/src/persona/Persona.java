/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Calendar;
import presentacion.Ubicacion;

/**
 *
 * @author wilmar
 */
class Persona {
    private String nombre;
    private Calendar fechaNacimiento;
    private Ubicacion ubicacion;
    private Genero genero = null;
    public boolean mostrarFecha = true;
    public boolean mostrarUbicacion = true;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    Persona(String nombre, Calendar fechaNacimiento, Genero genero, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.ubicacion = ubicacion;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    Genero getGenero() {
        return genero;
    }

    void setGenero(Genero genero) {
        this.genero = genero;
    }

    Ubicacion getUbicacion() {
        return ubicacion;
    }

    void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        String o = "Nombre: " + nombre;
        if(mostrarFecha){o += "\nFecha Nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH)+"/"+fechaNacimiento.get(Calendar.MONTH)+"/"+fechaNacimiento.get(Calendar.YEAR);}
        o += "\nGenero: " + genero;
        if(mostrarUbicacion){o += "\nUbicación: " + ubicacion;}
        return o;
    }    
}
