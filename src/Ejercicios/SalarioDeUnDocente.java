/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/*3-. Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de 
calcular el salario del docente sabiendo que le van a descontar el 10% de la renta. ¿Cuánto ganara el docente al final de
un mes de clases menos el descuento de la renta?@author nefta
 */
public class SalarioDeUnDocente {
    public static void main(String[] args) {
        
    
    double PrecioHora, HorasMes,SalarioNeto,Salario, Renta,ProcesoRenta;
         
         PrecioHora= 8;
         HorasMes=36;
         Renta= 0.10;
         
         SalarioNeto= PrecioHora * HorasMes ;
          ProcesoRenta= SalarioNeto * Renta;
          Salario= SalarioNeto- ProcesoRenta;
                  
         System.out.println("El salario del profesor es de :" + Salario);
         
     
    
    }
}
