/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleresponsibility;

/**
 *
 * @author Amanda
 */
public class AppDelivery {
    private Orden orden;
    public AppDelivery(Orden orden) { this.orden = orden; }
  
    public void delivery()
    {
        // Here, we would want to interface with another
        // system which actually assigns the task of
        // delivery to different persons
        // based on location, etc.
        System.out.println("Enviando la orden");
        System.out.println(
            "Orden: "
            + this.orden.getOrdenId()
            + " está siendo entregada al cliente "
            + this.orden.getCliente().getName());
        System.out.println(
            "La orden debe ser entregada en: "
            + this.orden.getCliente().getAddress());
    }
}
