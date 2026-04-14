/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author admin
 */
class Persona {
    private String nombre;
    int edad;
    
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    String getNombre() {
        return nombre;
    }
    
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
