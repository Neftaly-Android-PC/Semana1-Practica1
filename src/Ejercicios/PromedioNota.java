/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author nefta
 */
public class PromedioNota {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double P1, P2, P3, P4, P5, pm;
        
        P1 = 8.0;
        P2 = 2.5;
        P3 = 9.0;
        P4 = 8.0;
        P5 = 9.0;
        
        pm = ((P1*0.25) + (P2*0.15) + (P3*0.15) + (P4*0.20) + (P5*0.25));
        System.out.println("Promedio final: " + formato.format(pm));
    }
    
}
