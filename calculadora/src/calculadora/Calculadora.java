package calculadora;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
        static String numero1st;
        static String numero2st;
        static int numero1int; //integer
        static int numero2int;
        static int opcion;
        static  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        repetirfunciones();
    }
        
    static void repetirfunciones(){
        int contador = 0;
        int cantidadrepetir;
        System.out.println("cuantas veces lo quiere repetir ♥ ");
        cantidadrepetir = s.nextInt();
        while(contador < cantidadrepetir){
            menu();
            opciones();
            contador= contador +1;
        }
        System.out.println("me sali del while");
    }   
    static void menu(){
        numero1st = "5";
        numero2st = "10";
        
        Scanner s;
        s = new Scanner(System.in);
        
        
        System.out.println(" Menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("digite su opción");
        opcion = s.nextInt();
    }
    static void opciones(){
       
        if(opcion == 1){
            System.out.println("digite un numero");
            numero1st=s.next();
            
            System.out.println("digite otro numero");
            numero2st=s.next();
            
            numero1int = Integer.parseInt(numero1st);
            numero2int= Integer.parseInt(numero2st);
            int resultadosuma;
            resultadosuma = numero1int + numero2int;
            System.out.print("el resultado de la suma de los numero  " 
                + numero1int 
                +" y "
                +numero2int 
                +" es "
                +resultadosuma );
        }
        if(opcion == 2){
            System.out.println("digite un numero");
            numero1st=s.next();
            numero1int = Integer.parseInt(numero1st);
            numero2int= Integer.parseInt(numero2st);
            int resultadoresta;
            resultadoresta = numero1int - numero2int;
            System.out.println("la resta" + resultadoresta);
        }
        // TODO code application logic here
        if(opcion == 3){
            System.out.println("digite un numero");
            numero1st=s.next();
            System.out.println("digite otro numero");
            numero2st=s.next();
            
            numero1int = Integer.parseInt(numero1st);
            numero2int= Integer.parseInt(numero2st);
            int resultadomultiplicacion;
            resultadomultiplicacion = numero1int * numero2int;
            System.out.println("la multiplicacion" +resultadomultiplicacion);
            
        }
        if (opcion == 4){
            double divisor;
            double dividendo;
            
            System.out.println("digite un numero");
            divisor=s.nextDouble();
            System.out.println("digite otro numero"); 
            dividendo=s.nextDouble();
            double resultadodivision;
            resultadodivision = dividendo /divisor;
            System.out.println("la division" + resultadodivision);
        }
        
        if (opcion == 5){
            System.out.println("digite un numero:");
            numero1st = s.next();
            
            System.out.println("digite otro numero");
            numero2st= s.next();
            
            numero1int= Integer.parseInt(numero1st);
            numero2int= Integer.parseInt(numero2st);
            int resultadomodulo;
            resultadomodulo = numero1int % numero2int;
            System.out.println("el residuo es" + resultadomodulo);
        }
        
        if (opcion > 5 || opcion > 1){
            System.out.println("opcion invalida");
        }
    }
    
}  

