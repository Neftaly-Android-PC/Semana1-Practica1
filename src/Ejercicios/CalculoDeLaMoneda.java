/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


import java.util.Scanner;
/*2-. Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: Europa, Reino Unido, 
Australia y Canadá. El programa tiene declarada una variable con el valor $100.00 de tipo double y tenemos que 
realizar la conversión de dólares a las monedas solicitadas. A continuación se muestra los valores de conversión:
1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá
 */
public class CalculoDeLaMoneda {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String USD, Europa, ReinoUnido, Australia, Canada, ValorMoneda;
        double dolar, euro, LibraEsterlina,DolarAustraliano, DolarCanadiense;
        
        double valor=100.00, conver1=0.00, conver2=0.00, conver3=0.00, conver4=0.00;
        
        System.out.println("Ingrese la cantidad de USD a convertir: ");
        dolar= lector.nextInt();
        
        conver1 = valor*0.70;
        conver2 = valor*0.61;
        conver3 = valor*0.95;
        conver4 = valor*0.97;
        
        
        System.out.println("El valor de $100.00 convertidos a Euros es: " + conver1);
        System.out.println("El valor de $100.00 convertidos a Libra esterlina es: " + conver2);
        System.out.println("El valor de $100.00 convertidos a Dolar Australiano es: " + conver3);
        System.out.println("El valor de $100.00 convertidos a Dólar canadiense es: " + conver4);
        
       
        
    }
    
}
