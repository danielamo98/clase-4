package com.example;

import java.util.ArrayList;


public class Tienda {
  
private ArrayList<String>productosArrayList;

    public Tienda(){}
    ArrayList<String> productosArrayList = new ArrayList<>();

    public void agregarproducto(){
        System.out.println("camiza" + productosArrayList);
        System.out.println("pantalones" + productosArrayList);
    }

    public void buscarproducto(){
        System.out.println(productosArrayList);
    }
    
    
    public void mostrarproductostockbajo(){
        System.out.println();
    }







   

}
