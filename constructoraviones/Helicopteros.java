package constructoraviones;

import java.util.Scanner;

public class Helicopteros {

//Atributos
    
    private int Costo, Peso, Capacidad, Pasajeros, NumMotores;
    private int CalculoPeso, CalculoCapacidad, CalculoPasajeros, CalculoNumMotores;

    Scanner entrada = new Scanner(System.in);
    
//Metodo Constructor
    
    public void setPeso(int xPeso4){
        
        this.Peso = xPeso4;
        
    }
    
    public void setCapacidad(int xCapacidad4){
        
        this.Capacidad = xCapacidad4;
        
    }    
    
    public void setPasajeros (int xPasajeros4){
        
        this.Pasajeros = xPasajeros4;
        
    }    
    
    public void setNumMotores(int xNumMotores4){
        
        this.NumMotores = xNumMotores4;
        
    }
    
    //Metodo Peso
    
    public void CalcularPeso(){
        
        CalculoPeso = Peso * 500;
        
    }
    
        //Getter: Peso

            public int getInfoPeso(){

                return Peso;

            }
            
    //Metodo Capacidad
            
    public void CalcularCapacidad(){
        
        CalculoCapacidad = Capacidad * 1000;
        
    }
            //Getter: Capacidad


            public int getInfoCapacidad(){

                return Capacidad;

            }
    
    //Metodo Pasajeros
            
    public void CalcularPasajeros(){
        
        CalculoPasajeros = Pasajeros * 100;
        
    }
            //Getter: Pasajeros

            public int getInfoPasajeros(){

                return Pasajeros;

            }
    
    //Metodo NumMotores
            
    public void CalculoNumMotores(){
        
        CalculoNumMotores = NumMotores * 250000;
        
    }
            //Getter: NumMotores

            public int getInfoNumMotores(){

                return NumMotores;

            }
    
    //Metodo Costo
            
    public void CalculoCosto() {
        
        Costo = CalculoPeso + CalculoCapacidad + CalculoPasajeros + CalculoNumMotores;
 
    }
            //Getter: Costo


            public int getInfoCosto(){

                return Costo;

            }    
    
    
}
