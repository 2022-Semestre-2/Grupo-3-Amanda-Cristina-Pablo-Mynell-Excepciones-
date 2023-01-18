/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleresponsibility;

/**
 *
 * @author Amanda
 */
public class Cliente {
    //atributos
    private String nombre;
    private String direccion;
    
    
    //getters y setters
    public String getName() { return nombre; }
    public void setName(String nombre) { this.nombre = nombre; }
    
    public String getAddress() { return direccion; }
    public void setAddress(String direccion)
    {
        this.direccion = direccion;
    }
}
