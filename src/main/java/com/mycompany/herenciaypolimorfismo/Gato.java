/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author juansinmiedo
 */
public class Gato extends AnimalDomestico{
    private int numeroVidas;
    private int numeroAccidentesFsatales;  

    public Gato(int numeroVidas, int numeroAccidentesFsatales, String propietario, String nombre, int yearNacimeinto, String color, String raza, int costoMaximo) {
        super(propietario, nombre, yearNacimeinto, color, raza, costoMaximo);
        this.numeroVidas = numeroVidas;
        this.numeroAccidentesFsatales = numeroAccidentesFsatales;
    }




    
    
    
    public int calcularVidasRestantes(){
        return this.numeroVidas-this.numeroAccidentesFsatales;
    }
    
    
    
    
    
    
    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroAccidentesFsatales() {
        return numeroAccidentesFsatales;
    }

    public void setNumeroAccidentesFsatales(int numeroAccidentesFsatales) {
        this.numeroAccidentesFsatales = numeroAccidentesFsatales;
    }
    
}
