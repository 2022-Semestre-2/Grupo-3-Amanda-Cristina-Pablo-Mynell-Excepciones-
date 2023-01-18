/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleresponsibility;

import java.util.Random;

/**
 *
 * @author Amanda
 */
public class CalculoFactura {
    private Orden orden;
    public CalculoFactura(Orden orden)
    {
        this.orden = orden;
    }
  
    public void calculateBill()
    {
        /* In the real world, we would want a kind of lookup
          functionality implemented here where we look for
          the price of each item included in the orden, add
          them up and add taxes, delivery charges, etc on
          top to reach the total price. We will simulate
          this behaviour here, by generating a random number
          for total price.
        */
        Random rand = new Random();
        int totalAmt
            = rand.nextInt(200) * this.orden.getQuantity();
  
        this.orden.setTotalBillAmt(totalAmt);
        System.out.println("La orden "
                           + this.orden.getOrdenId()
                           + " tiene un costo de:  "
                           + this.orden.getTotalBillAmt());
    }
}
