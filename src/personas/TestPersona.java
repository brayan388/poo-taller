/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author admin
 */
public class TestPersona {

    public static void main(String[] args) {
        Persona P = new Persona("juan", 20);
        System.out.println(P.getNombre());
        System.out.println(P.edad);

        P.setNombre("carlos");
        System.out.println(P.getNombre());
    }
}
