/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.automoviles;

/**
 *
 * @author ADRIANA
 */
public class Carros extends OperacionesA {
    Carros AC;
     Camiones cam;
    String MatriculaA;
    double VelocidadA;
    double AceleracionA;
    int puertas;
    
    public Carros(){
        MatriculaA ="a";
        VelocidadA=1.00;
        AceleracionA = 1.00;
        puertas=0;
    }
    public Carros(String MatriculaA, double VelocidadA, double AceleracionA, int puertas){
        
    }
    public String GetMatriculaA(){
        return MatriculaA;
    }
    public void SetMatriculaA(String MatriculaA){
        this.MatriculaA=MatriculaA;
    }
    public double GetVelocidadA(){
        return VelocidadA;
    }
    public void SetVelocidadC(double VelocidadA){
    this.VelocidadA=VelocidadA;
    }
    public double GetAceleracionA(){
        return AceleracionA;
    }
    public void SetAceleracionA (double AceleracionA ){
        this.AceleracionA=AceleracionA;
    }
    public int Getpuertas(){
        return puertas;
    }
    public void Setpuertas(int puertas){
        this.puertas=puertas;
    }
    @Override
    public void toStringA(int velocidadR,String matricula){ // comparte con Cammiones 
        String velocidad = Integer.toString(velocidadR);
        System.out.println(" Su velocidad es: "+velocidad + " y su matricula es :"+matricula);
    }
    public void IngPuertas(){
        System.out.println(" Ingrese la cantidad de puertas que tiene su carro");
        puertas=input.nextInt();
        input.nextLine();
        if (puertas>6){
            System.out.println(" Su carro tiene demasiadas puertas!");
        }
        else{
            System.out.println(" Lo tendremos en cuenta");
        }
    }
}
