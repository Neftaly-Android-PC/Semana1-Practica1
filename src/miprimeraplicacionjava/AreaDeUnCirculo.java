/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraplicacionjava;

import java.text.DecimalFormat;    // Importar la clase para el formato
import java.text.NumberFormat;
/**
 *
 * @author ITCA
 */
public class AreaDeUnCirculo {
    public static void main(String[] args) {
        
        //Declara variables
        NumberFormat formato = new DecimalFormat ("#0.00");
        double area, radio;
        final double pi = 3.1416; //la palabra final indica que ese valor de la variable no cambiara
        //Inicializacion de variables
        area = 145;
        //Uso de varibles 
        radio = Math.sqrt(area/pi); //Calcular raiz cuadrada con la funcion Match.sqrt
        System.out.println("Radio: " + formato.format(radio) + "cm");
    }
    
}
