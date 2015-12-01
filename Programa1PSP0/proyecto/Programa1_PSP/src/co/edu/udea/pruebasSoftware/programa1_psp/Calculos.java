
package co.edu.udea.pruebasSoftware.programa1_psp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joaquin David Hernández Cárdenas
 */
public final class Calculos {

    private int cantidadNumeros = 0;
    private double media = 0;
    private double desviacion = 0;
    private List listaNUmeros; 
    private String ruta = "datos.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calculos c = new Calculos();
       
    }

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }

    public double getMedia() {
        return media;
    }

    public double getDesviacion() {
        return desviacion;
    }

    public List getListaNUmeros() {
        return listaNUmeros;
    }

    public String getRuta() {
        return ruta;
    }

    public void setCantidadNumeros(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    public void setListaNUmeros(List listaNUmeros) {
        this.listaNUmeros = listaNUmeros;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    

    /**
     *Constructor vacio de la clase
     */
    public Calculos() {
        listaNUmeros = new ArrayList();
        leerArchivo(ruta);
        calcularMedia();
        calcularDesviacion();
        System.out.println("Media: "+ getMedia());
        System.out.println("Desviacion: "+ getDesviacion());
        
    }
    
    /**
     * Metodo encargado de calcular la media de los numeros en la lista 
     */
    public void calcularMedia(){
        double suma = 0 ;
        int limite = getCantidadNumeros();
        for (int i=0; i<limite; i++){
        suma = suma + new Double(listaNUmeros.get(i).toString());
        }
        double m = suma/cantidadNumeros; 
        setMedia(m);
    }
    
    public void calcularDesviacion(){
        double desviacion = 0;
        for(int i=0; i<cantidadNumeros; i++){
             desviacion = desviacion + Math.pow(new Double(listaNUmeros.get(i).toString())-getMedia(),2);
        }
        desviacion = desviacion/(cantidadNumeros-1);
        desviacion = Math.sqrt(desviacion);
        setDesviacion(desviacion);
    }
    
    /**
     * Metodo encargado de leer el archivo con los números y almacenarlos en la Lista
     * @param ruta String que contiene la ruta del archivo con los números 
     */
    public void leerArchivo(String ruta){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            try {
                linea = br.readLine();
                boolean primero = true;
                while(linea!=null){
                    if(primero==false){
                        linea = br.readLine();
                    }
                    if(linea!=null){
                    primero = false;
                    Float numero = Float.parseFloat(linea);
                    listaNUmeros.add(numero); 
                    }
                }
                setCantidadNumeros( listaNUmeros.size());
            } catch (IOException ex) {
                Logger.getLogger(Calculos.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error leyendo el archivo");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Calculos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error leyendo el archivo");
        }
    }
    
    
}
