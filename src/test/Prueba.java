/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import vehiculos.Vehiculo;

/**
 *
 * @author admin
 */
public class Prueba {
    public static void main(String[]args){ 
        Vehiculo v = new Vehiculo("Moto", "Yamaha");
        System.out.println(v.tipo);
        System.out.println(v.marca);
    }
}
