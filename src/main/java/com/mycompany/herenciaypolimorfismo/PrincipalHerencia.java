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
public class PrincipalHerencia {
    public static void main(String [] args){
        
        var gatoMama = new Gato(3, 4, "Juan", "Jose", 2021,"Azul", "Raza", 35);
        var loroMama = new Loro(7, "Loro", 2021, "Verde", "Raza 2",90);
        var perroMama = new Perro(false, "Pedro", "Firu", 2018, "Blanco", "Raza3", 50);
        
        

        
        
       
        
        
        System.out.println(gatoMama.getNombre());
        System.out.println(gatoMama.calcularVidasRestantes());
        
    }
}
