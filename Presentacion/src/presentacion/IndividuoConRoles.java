/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.GregorianCalendar;
import persona.Individuo;

/**
 *
 * @author wilmar
 */
public class IndividuoConRoles extends Individuo{
    private static final String DESCRIPCION = ""
            + "\tSoy un hombre muy honrado, que me gusta lo mejor.\n"
            + "\tLas mujeres no me faltan, ni el dinero, ni el amor.\n"
            + "\tJineteando en mi caballo por la sierra yo me voy,\n"
            + "\tlas estrellas y la luna ellas me dicen donde voy.";
    
    
    public IndividuoConRoles() {
        super("Wilmar Arcila Castaño", new GregorianCalendar(1983,3,6), DESCRIPCION);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
