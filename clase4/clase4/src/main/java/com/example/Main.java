package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Producto p1 = new Producto();
        p1.mostrarinformacion();
        p1.actualizarstock();
        p1.calcularpreciototal();

        Tienda p2 = new Tienda();

        p2.agregarproducto();

        

        
    }
}