/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoSeguro;

/**
 *
 * @author admin
 */
public class BancoSeguro {
    private double saldo;
    
    public BancoSeguro(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0){
            saldo += cantidad;
        }
    }
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            
        }
    }
}
