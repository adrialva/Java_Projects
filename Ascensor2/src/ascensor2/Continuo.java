/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor2;

/**
 *
 * @author ADRIANA
 */
// extends para dos clases¿?
public class Continuo extends Elevator {
    private int c=0;
    private int g=0;
    private int mk=0;
    private int mel=0;
    
    public void Move2(){
        c= super.Ingreso();//ingreso usuario
        g=super.IngresoE();//posicion ascensor
        if(c<=0){
            System.out.println("ha salido del ascensor");
        }
        else{
            mel=super.MovimientoE(g);
        }
    } 
}
