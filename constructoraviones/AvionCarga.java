package constructoraviones;

import java.util.Scanner;

public class AvionCarga {

//Atributos
    
    private int Costo, Peso, Capacidad, Pasajeros, NumMotores;
    private int CalculoPeso, CalculoCapacidad, CalculoPasajeros, CalculoNumMotores;

    Scanner entrada = new Scanner(System.in);
    
//Metodo Constructor
    
    public void setPeso(int xPeso1){
        
        this.Peso = xPeso1;
        
    }
    
    public void setCapacidad(int xCapacidad1){
        
        this.Capacidad = xCapacidad1;
        
    }    
    
    public void setPasajeros (int xPasajeros1){
        
        this.Pasajeros = xPasajeros1;
        
    }    
    
    public void setNumMotores(int xNumMotores1){
        
        this.NumMotores = xNumMotores1;
        
    }
    
    //Metodo Peso
    
    public void CalcularPeso(){
        
        CalculoPeso = Peso * 1000;
        
    }
    
        //Getter: Peso

            public int getInfoPeso(){

                return Peso;

            }
            
    //Metodo Capacidad
            
    public void CalcularCapacidad(){
        
        CalculoCapacidad = Capacidad * 10;
        
    }
            //Getter: Capacidad


            public int getInfoCapacidad(){

                return Capacidad;

            }
    
    //Metodo Pasajeros
            
    public void CalcularPasajeros(){
        
        CalculoPasajeros = Pasajeros * 50;
        
    }
            //Getter: Pasajeros

            public int getInfoPasajeros(){

                return Pasajeros;

            }
    
    //Metodo NumMotores
            
    public void CalculoNumMotores(){
        
        CalculoNumMotores = NumMotores * 500000;
        
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
