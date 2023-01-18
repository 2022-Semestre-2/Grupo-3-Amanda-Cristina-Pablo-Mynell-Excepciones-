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
public class Orden {
    
    //atributos
    private Cliente customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;
  
    
    //getters y setters
    public Cliente getCliente() { return customer; }
    public void setCliente(Cliente customer)
    {
        this.customer = customer;
    }
    public String getOrdenId() { return orderId; }
    public void setOrdenId(String orderId)
    {
        Random random = new Random();
  
        this.orderId = orderId + "-" + random.nextInt(500);
    }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
        setOrdenId(itemName);
    }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getTotalBillAmt() { return totalBillAmt; }
    public void setTotalBillAmt(int totalBillAmt)
    {
        this.totalBillAmt = totalBillAmt;
    }
  
    //preparar orden
    public void prepareOrder()
    {
        System.out.println("Preparando orden para el cliente -"
                           + this.getCliente().getName()
                           + ", quien ha ordenado "
                           + this.getItemName());
    }
}
