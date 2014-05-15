/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.util.Calendar;

/**
 *
 * @author jinjo
 */
public class Tiempo {
    private Long tiempoInicio, tiempoFinal, dif;
    
    public void inicio(){
        this.tiempoInicio= Calendar.getInstance().getTime().getTime();
    }
    
    public void termina(){
        this.tiempoFinal= Calendar.getInstance().getTime().getTime();
    }
    
    public String diferencia(){
        this.dif= this.tiempoFinal - this.tiempoInicio;
        String a=(dif/(60*60*1000))%60  +"horas "+ (dif/(60*1000))%60 +"minutos "+ dif/1000%60 +"segundos "+ dif%1000 +"milisegundos"; 
        return a;
    }  
 
}
