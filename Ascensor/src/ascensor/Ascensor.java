/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;
//realize un programa que me permita simular un asensor desde afuera 7 pisos el usuario ingresa 
// en el piso que se encuentra, solo se sale si da en sotano(puede ser 0), en 8 debe digitar otro numero
// el ascensor empiezza en cualquier lugar-->random
// puede tener varios sotanos 

public class Ascensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proceso ob1 = new Proceso();
        Usuario ob2 = new Usuario();
        ob1.SetRan(ob1.Ran());
        System.out.println(ob1.GetRan());
       // ob1.Ran();
       // ob2.SetIngreso(ob2.ingresoValor());
        ob2.ingresoValor();
        // TODO code application logic here
    }
    
}
