package com.example;

public class Producto {
    private String nombre;
    private Double precio;
    private int stock;

    public Producto(){
        nombre = "sin nombre";
        precio = 0.0;
        stock = 0;
    }
    public Producto ( String nombre, Double proecio, int stock){
        this.nombre = nombre;
        this.precio = proecio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void mostrarinformacion(){
        System.out.println("nombre del producto: " + nombre);
        System.out.println("precio del producto: " + precio);
        System.out.println("cantidad del producto: " + stock);
    }
    
    public void actualizarstock(){
        System.out.println("¡herro!, la cantidad es negativa");
    }

    public void calcularpreciototal(){
        System.out.println("el precio total es" + precio * stock);
    }
}
