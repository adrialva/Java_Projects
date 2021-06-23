
package archivos;
import java.util.*;
public class main
{
   public static void main(String args[])
   {
       Scanner input =new Scanner (System.in);
       int salir=1;
       Archivos objeto1 = new Archivos(); //puedo mandar los datos directo desde un metodo
       System.out.println("preisone: 2=asignar datos,3=mostrar datos,4=buscar registro,5=ver un usuario y sus saldo aparte, 6=salir");
       while(salir!=6)
       {
       try{
       System.out.println("===================================================================================================");
       System.out.println("Elija una opcion");
       salir=input.nextInt();
       input.nextLine();
       //if (salir==1){objeto1.Crear();} //crear el archivo si es que no esta creado
       if (salir==2){
        System.out.println("Ingresa el titulo");
                String titulo=input.nextLine();
                System.out.println("Ingresa el codigo");
                int codigo =input.nextInt();
                input.nextLine();
                System.out.println("Ingresa el año");
                int año=input.nextInt();
                input.nextLine();
                objeto1.IngresoLibros(titulo,codigo, año);
        }//dentro del parentesis le puedo enviar datos para que valla guardando
       if (salir==3){
            objeto1.MostarLibros();//mostrar lo que hay dentro de un archivo
       }
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
           input.nextLine();
       }
   }
  }
}

