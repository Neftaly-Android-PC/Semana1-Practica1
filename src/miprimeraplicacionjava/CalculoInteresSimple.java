/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraplicacionjava;

/**
 *
 * @author ITCA
 */
public class CalculoInteresSimple {
    public static void main(String[] args) {
        //Declara variables
        double interes, capitalPrestado, tiempo, tasaDeInteres, tiempoEnMeses;
        
//inicializar variables
        interes = 144;
        capitalPrestado = 1200.00;
        tasaDeInteres = 0.08;
        
        //Uso de variables
        tiempo = interes /(capitalPrestado * tasaDeInteres);
        tiempoEnMeses = tiempo * 12;
        System.out.println("Tiempo: " + tiempo + "años");
        System.out.println("Tiempo: " + tiempoEnMeses + "meses");
    }
  
}
