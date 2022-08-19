/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;
import java.util.Calendar;
import presentacion.Ubicacion;

/**
 *
 * @author wilmar
 */
public abstract class Individuo extends Persona{
    public String apodo;
    private String profesion;
    private ArrayList<String> hobbys;
    private Creencias creencias;
    private final String descripcion;
    public boolean mostrarCreencias = true;
    
    protected Individuo(String nombre, String descripcion) {
        super(nombre);
        this.descripcion = descripcion;
    }

    protected Individuo(String nombre, Calendar fechaNacimiento, String descripcion) {
        super(nombre, fechaNacimiento);
        this.descripcion = descripcion;
    }

    protected Individuo(String nombre, Calendar fechaNacimiento, Genero genero, Ubicacion ubicacion, String descripcion) {
        super(nombre, fechaNacimiento, genero, ubicacion);
        this.descripcion = descripcion;
    }
    
    protected String getProfesion() {
        return profesion;
    }

    protected void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    protected ArrayList<String> getHobbys() {
        return hobbys;
    }

    protected void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

    protected Creencias getCreencias() {
        return creencias;
    }

    protected void setCreencias(Creencias creencias) {
        this.creencias = creencias;
    }

    protected String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        String o = super.toString();
        o += "\nApodo: " + apodo + "\nProfesión: " + profesion + "\nHobbys: " + hobbys;
        if(mostrarCreencias){o += "\nCreencias: " + creencias;}
        o += "\nAcerca de mi:\n" + descripcion;
        return o;
    }
    
    
}
