/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

/**
 *
 * @author faria
 */
public class imcmetodo {
    public double calcIMC (double Peso, double Altura) {
        return Peso / (Altura * Altura);
    }
    
    
    
    public String VerfIMC (double v1){
        if (v1 < 18.5) {
            return "magreza";
        } else if ( v1 <= 24.9 ) {
            return "Normal";
        } else if (v1 <= 30) {
            return "Sobrepeso";
        } else{
            return "Obesidade";
        }
        
       
    }
    
}
