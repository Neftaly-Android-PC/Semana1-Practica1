/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*4-. Si un trabajador de la empresa privada está afiliado a las AFP y los porcentajes que se paga a las AFP es de 6% por parte del 
trabajador y 6.5% por parte del empleador, si el empleado gana $500 al mes, ¿Cuánto está pagando a la AFP el trabajador en 
concepto de empleado y de empleador?
 */
public class PagoDeLaAFPaUnTrabajador {
        public static void main(String[] args) {
    NumberFormat formato; formato = new DecimalFormat ("#0.00");
        double AFPtrabajador,AFPempleador,salario,AFPtrabajo,AFPempleado ;
        AFPtrabajador=0.06;
        AFPempleador=0.065;
        salario=500;
        
        AFPtrabajo= salario * AFPtrabajador;
        AFPempleado= salario * AFPempleador;
        
         System.out.println("el trabajador paga en concepto de trabajador en la AFP  :" + formato.format(AFPtrabajo) );
         System.out.println("el trabajador paga en concepto de empleador en la AFP  :" + formato.format(AFPempleado) );
        
    }
}
    

