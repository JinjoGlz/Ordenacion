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
public class Shaker {
     public static int ordenacionShaker(Fila[] v,int contador,int criterio) {
        int limInferior = 0;
        int limSuperior = v.length-1;
        Fila aux;
        while(limInferior <= limSuperior) {
            for(int j=limInferior; j<limSuperior; j++) {
                if(comparar(v[j],v[j-1],criterio)>0) {
                    contador++;
                     aux = v[j];
                    v[j]    = v[j+1];
                    v[j+1]  = aux;
                }
            }
            limSuperior--;
            for(int j=limSuperior;j>limInferior; j--) {
                if(comparar(v[j],v[j-1],criterio)<0) {
                    contador++;
                    aux = v[j];
                    v[j]    = v[j-1];
                    v[j-1]  = aux;
                }
            }
            limInferior++;
        }
        return contador;
    }
    
     public static int comparar(Fila a, Fila b, int criterio){
        int resultado=a.getDatos()[criterio].compareTo(b.getDatos()[criterio]);
        return resultado;
    }
}
