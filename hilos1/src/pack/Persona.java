/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author USUARIO
 */
public class Persona {

    String idPersona;
    String nombre;
    int dinero;

    public Persona(String idPersona, String nombre, int dinero) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.dinero = dinero;
    }
    
    public Object[] getRow() {
        Object [] row = new Object[3];
        row[0] = idPersona;
        row[1] = nombre;
        row[2] = dinero;
        
        return row;
    }
}
