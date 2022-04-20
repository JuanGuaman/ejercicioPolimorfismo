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
public class Loro extends Animal{
    private int numeroPalabras;

    public Loro(int numeroPalabras, String nombre, int yearNacimeinto, String color, String raza, int costoMaximo) {
        super(nombre, yearNacimeinto, color, raza, costoMaximo);
        this.numeroPalabras = numeroPalabras;
    }





    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }
    
    
    
    
    
    public boolean tieneAmpliuoVocabulario(){
        var retorno=false;
        if (this.numeroPalabras>=5){
            retorno=true;
        }else{
            retorno = false;
        }
        
        
     return retorno;   
    }
}
