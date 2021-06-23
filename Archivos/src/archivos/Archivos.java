package archivos;
import java.io.*;
import java.io.*;
/**
 *
 * @author ADRIANA
 */
public class Archivos {
    private String ID;
    private int Cantidad;
    File Archivo = new File( "Archivo.txt");  // crear archivo
    
public void IngresoLibros(String tituloL, int codigoL, int añoL){
        try{
        BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Archivo, true)));
        Fescribe.write(tituloL+"   "+codigoL+"    "+ añoL);
        Fescribe.write("\n");
        Fescribe.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void MostarLibros(){
        try{
            FileReader FR= new FileReader("Archivo.txt");
            BufferedReader BR = new BufferedReader(FR);
            String cadena;
            while((cadena=BR.readLine())!=null){
                System.out.println(" "+cadena);
                
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

