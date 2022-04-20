/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;

import java.time.LocalDate;

/**
 *
 * @author juansinmiedo
 */
public class Animal {

    public Animal(String nombre, int yearNacimeinto, String color, String raza, int costoMaximo) {
        this.nombre = nombre;
        this.yearNacimeinto = yearNacimeinto;
        this.color = color;
        this.raza = raza;
        this.costoMaximo = costoMaximo;
    }
    private String nombre;
    private int yearNacimeinto;
    private String color;
    private String raza;
    private int costoMaximo;

    public int calcularEdad(){ 
        return LocalDate.now().getYear()-this.yearNacimeinto;
    }

    //getters y setters
    public int getyearNacimiento(){
        return this.yearNacimeinto;
    }
    public void setyearNacimiento(int y){
        this.yearNacimeinto=y;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCostoMaximo() {
        return costoMaximo;
    }

    public void setCostoMaximo(int costoMaximo) {
        this.costoMaximo = costoMaximo;
    }
    
}
