/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import pila.Base;

/**
 *
 * @author Daniel Cárdenas
 */
public class Producto {
    private String nombreProducto;

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", valorUProducto=" + valorUProducto + ", Cantidad=" + Cantidad + '}';
    }
    
    private double valorUProducto;
    private int Cantidad;

    public Producto() {
    }

    public Producto(String nombreProducto, double valorUProducto, int Cantidad) {
        this.nombreProducto = nombreProducto;
        this.valorUProducto = valorUProducto;
        this.Cantidad = Cantidad;
    }
    
}
