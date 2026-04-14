/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import vehiculos.Vehiculo;
import vehiculos.Moto;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args){
        Vehiculo v = new Vehiculo("Carro");
        Moto m = new Moto("Deportiva");
        
        v.mostrar();
        m.mostrar();
    }
}
