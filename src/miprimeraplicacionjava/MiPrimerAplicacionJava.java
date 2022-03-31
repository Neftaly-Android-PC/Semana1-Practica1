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
public class MiPrimerAplicacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar variables (ejemplos de algunos tipos de datos)
        String nombreCompleto, direccion, estadoCivil; //Tipo cadena de texto ejemplo Juan Perez
        int edad;                                      //Tipo entero ejemplo 23
        double gastosDiarios;                          //Tipo double ejemplo 12.34
        char genero;                                   //Tipo char ejemplo F o M
        boolean poseeVehiculo;                         //Tipo booleana ejemplo true o false 
        
        //Inicializamos las variables
        nombreCompleto = "Camila Esperanza Rosales";
        direccion = "Calle de la armagura desvio la trizteza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        //Uso de variables (mostrar en pantalla las vavriables)
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Direccion      : " + direccion);
        System.out.println("Estado Civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee Vehiculo : " + poseeVehiculo);
    }
    
}
