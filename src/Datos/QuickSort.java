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
public class QuickSort {
    
    public static int quicksort(Fila A[], int izq, int der, int contador) {
        Fila pivote = A[izq];
        int i = izq;
        int j = der;
        Fila aux;

        while (i <= j) {
            while (comparar(A[i], pivote)<0) {
                contador++;
                i++;
            }
            while (comparar(A[j], pivote)>0) {
                contador++;
                j--;
            }
            if (i <= j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j,contador );
            System.out.println("1");
        }
        if (j + 1 < der) {
            quicksort(A, i, der,contador);
        }
        return contador;
    }

    public static int comparar(Fila a, Fila b){
        int resultado=a.getDatos()[0].compareTo(b.getDatos()[0]);
        return resultado;
    }
}
