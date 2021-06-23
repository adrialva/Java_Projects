/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasombreada;

/**
 *
 * @author ADRIANA
 */
public class Esfera implements IFigura {
    
    Circunferencia ob1= new Circunferencia();
    public String color;
    public double tamaño;
    
public Esfera(){ 
    
    System.out.println("soy el constructor de esfera");
}    
    @Override
    public double area(){
     double volumen=0;
     ob1.area();
     //super.Setradio(super.pedir());
    volumen= 4*ob1.area();
    //super.Setcolor(super.Colores(volumen));
    //super.Tamaño(acirculo);
   // super.Colores(volumen);
    return volumen;
}
public double Tamaño3 (double volumen){
        tamaño=volumen+3;
        return tamaño; 
    }
    @Override
    public String color(double tamaño){
        if (tamaño <=5){
            color ="rojo";
            System.out.println(" su tamaño es pequeño");
            System.out.println(color);
        }
        else{
             if (tamaño <=10){
                color = "morado";
                System.out.println("su tamaño es mediano");
                System.out.println(color);
            }
             else{
                    if (tamaño <=15){
                         color ="azul";
                         System.out.println(" su tamaño es grande");
                         System.out.println(color);
            }
                    else{
                        color ="verde";
                        System.out.println(" su tamaño es demasiado grande");
                         System.out.println(color);
                    }
}
        }
        return color ;
    }
}
//agregre a su programa dos cualidades color y tamaño depede del tamaño sera el color a su vez
//dee agregarse otro cotructor que permita inicializar como parametros esas dos 
//el tamaño depede del resultado 