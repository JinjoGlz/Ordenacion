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
public class Burbuja {
    public static int burbuja(Fila [] A, int contador){
         Fila aux;
         for(int i=0;i<A.length-1;i++)
              for(int j=0;j<A.length-i-1;j++)
                   if(comparar(A[j+1],A[j])<0){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
         return contador;
}
    
    public static int comparar(Fila a, Fila b){
        int resultado=a.getDatos()[0].compareTo(b.getDatos()[0]);
        return resultado;
    }
}
