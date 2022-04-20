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
public class Perro extends AnimalDomestico{
    private boolean esterilizado;

    public Perro(boolean esterilizado, String propietario, String nombre, int yearNacimeinto, String color, String raza, int costoMaximo) {
        super(propietario, nombre, yearNacimeinto, color, raza, costoMaximo);
        this.esterilizado = esterilizado;
    }




    public boolean getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
    
    
}
