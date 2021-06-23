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
public class Camiones extends OperacionesA {
    Camiones cam;
    Carros AC;
    String MatriculaC;
    double VelocidadC;
    double AceleracionC;
    String Remolque;
    
    public Camiones(){
        MatriculaC ="a";
        VelocidadC=1.00;
        AceleracionC = 1.00;
        Remolque ="null";
    }
    public Camiones(String MatriculaC, double VelocidadC, double AceleracionC){
        
    }
    public String GetMatriculaC(){
        return MatriculaC;
    }
    public void SetMatriculaC(String MatriculaC){
        this.MatriculaC=MatriculaC;
    }
    public double GetVelocidadC(){
        return VelocidadC;
    }
    public void SetVelocidadC(double VelocidadC){
    this.VelocidadC=VelocidadC;
    }
    public double GetAceleracionC(){
        return AceleracionC;
    }
    public void SetAceleracionC(double AceleracionC ){
        this.AceleracionC=AceleracionC;
    }
    
    @Override
    public void toStringA(int velocidadR, String matricula){ //devuelve info de matri y velo
        int a;
         if (velocidadR >100.00){
            System.out.println(" su velocidad es: "+ velocidadR);
            System.out.println("Demasiado rapido");
        }
        else{
            System.out.println("** Su velocidad es: "+velocidadR);
        }
        String velocidad = Integer.toString(velocidadR);
        System.out.println(" Su velocidad es: "+velocidad + " y su matricula es :"+matricula);
    }
    public void PonRemolque(String Remolque){
        
    }
    public void QuitaRemolque(String MatriculaC, double VelocidadC, String Remolque){
        
    } 
    public void demasiadorapido(){
        
    }
    
}
