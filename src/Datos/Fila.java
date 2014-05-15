/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author jinjo
 */
public class Fila {
    private String[] datos;
    
    public Fila(String[] i){
        datos= new String[i.length];
        for (int j = 0; j < i.length; j++) {
            datos[j]=i[j];
        }
    }

    /**
     * @return the datos
     */
    public String[] getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(String[] datos) {
        this.datos = datos;
    }
    
    public String toString(){
        String a="";
        for (int i = 0; i < datos.length; i++) {
            a=a+"|"+datos[i];
            
        }
        return a;
    }
    
}
