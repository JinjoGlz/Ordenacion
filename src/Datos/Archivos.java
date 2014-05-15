/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;
import java.io.File;
import java.io.FileWriter;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author jinjo
 */
public class Archivos {
    private String[] cabecera;
    private ArrayList<Fila> array= new ArrayList<Fila>();
    private boolean cargado=false;
    
    public Fila[] leer(Fila[] arreglo, File file ){
    try{
        CsvReader datos_import = new CsvReader(file.toString());  
         datos_import.readHeaders();
         cabecera=datos_import.getHeaders();
         int columnas= this.cabecera.length;
         System.out.println(columnas);
         String[] aux=new String[columnas];
         
         while(datos_import.readRecord()){
             for (int i = 0; i < aux.length; i++) {
                 aux[i]=datos_import.get(i);
                 
             }
             array.add(new Fila(aux));
             
         }
        arreglo=new Fila[array.size()];
        System.out.println(arreglo.length);
        System.out.println(array.get(0).getDatos().length);
        for (int i = 0; i < array.size(); i++) {
            arreglo[i]=array.get(i);
            
        }
        System.out.println("cargados");
        
        datos_import.close();
        cargado=true;
        return arreglo;
    }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
    }
    return arreglo;
    }
    
    public void escribir(Fila[] arreglo, File file){
        try{
             boolean alreadyExists = file.exists();
         
        if(alreadyExists){
            File ficheroUsuarios =file;
            ficheroUsuarios.delete();
        }
        
        CsvWriter csvOutput = new CsvWriter(new FileWriter(file, true), ',');
            for (int i = 0; i < cabecera.length; i++) {
                csvOutput.write(cabecera[i]);
            }csvOutput.endRecord();
            for (int i = 0; i < arreglo.length; i++) {
                Fila fila = arreglo[i];
                for (int j = 0; j < fila.getDatos().length; j++) {
                csvOutput.write(fila.getDatos()[j]);
                }
                csvOutput.endRecord();
            }
            csvOutput.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
    }
    }

    /**
     * @return the cargado
     */
    public boolean isCargado() {
        return cargado;
    }

    /**
     * @param cargado the cargado to set
     */
    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }
}
