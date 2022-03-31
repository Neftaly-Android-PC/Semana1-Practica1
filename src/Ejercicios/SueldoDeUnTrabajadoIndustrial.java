/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*5-. Un trabajador de la industria de la construcción gana $10 diarios en su jornada normal de trabajo. En ciertas ocasiones 
el empleado tiene que trabajar horas extras para cumplir con su trabajo. En el mes a acumulado 50 horas extras que se la 
pagan al 10% del valor del pago diario. ¿Cuánto ganara el trabajador al final de un mes de trabajo? 
Tomar en consideración que al trabajador le descontaran el 10% en concepto de renta
 */
public class SueldoDeUnTrabajadoIndustrial {
    public static void main(String[] args) {
          NumberFormat formato; formato = new DecimalFormat ("#0.00");
     
        double SalarioDiario, HorasExtra, SalarioNeto,SalarioMensual,SalarioFinal,Renta,PagoPorHoraExtra;
        
        SalarioDiario= 10;
        HorasExtra=50;
       
      
      SalarioNeto = 10*30 ;
       PagoPorHoraExtra= HorasExtra*1; 
       SalarioMensual = SalarioNeto + PagoPorHoraExtra;
      Renta= SalarioMensual*0.10;
      SalarioFinal= SalarioMensual - Renta;
      
      System.out.println("El trabajador ganara : $" + formato.format(SalarioFinal)+ " " + "al final del mes");
        
        
        
     }
}
