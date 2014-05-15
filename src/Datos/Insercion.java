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
public class Insercion {
    public static int insercion(Fila[] a,int contador,int criterio){
        int j;
        Fila aux;
        for (int i = 0; i < a.length; i++) {
            j=i;
            aux=a[i];
            while(j>0&&comparar(aux, a[j-1],criterio)<0){
                contador++;
                a[j]=a[j-1];
                j--;
            }
            a[j]=aux;
        }
        return contador;
    }
    
    public static int comparar(Fila a, Fila b, int criterio){
        int resultado=a.getDatos()[criterio].compareTo(b.getDatos()[criterio]);
        return resultado;
    }
}
