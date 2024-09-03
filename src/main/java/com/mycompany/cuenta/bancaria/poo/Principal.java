package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
       CuentaBancaria cuenta = new CuentaBancaria("Janier","34",30.000);
        
       cuenta.CalcularInteres();
       cuenta.setTipoInteres(20);
    }
}
