/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleresponsibility;

/**
 *
 * @author Amanda
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        
        //datos cliente y su orden
        Cliente customer1 = new Cliente();
        customer1.setName("Juan");
        customer1.setAddress("Cartago");
        Orden orden1 = new Orden();
        orden1.setItemName("Pizza");
        orden1.setQuantity(2);
        orden1.setCliente(customer1);
  
        //pedir la orden
        orden1.prepareOrder();
  
        //calcular la factura
        CalculoFactura billCalculation = new CalculoFactura(orden1);
        billCalculation.calculateBill();
  
        AppDelivery deliveryApp = new AppDelivery(orden1);
        deliveryApp.delivery();
    }
}
