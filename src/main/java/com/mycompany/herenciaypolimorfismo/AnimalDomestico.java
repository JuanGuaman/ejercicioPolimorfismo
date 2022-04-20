/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaypolimorfismo;

public class AnimalDomestico extends Animal{
    
    private String propietario;

    public AnimalDomestico(String propietario, String nombre, int yearNacimeinto, String color, String raza, int costoMaximo) {
        super(nombre, yearNacimeinto, color, raza, costoMaximo);
        this.propietario = propietario;
    }



    
    
    //Getters & Setters
    
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
}
