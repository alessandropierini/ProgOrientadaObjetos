package constructoraviones;

import java.util.Scanner;

public class AvionPasajeros {

//Atributos
    
    private int Costo, Peso, Capacidad, Pasajeros, NumMotores;
    private int CalculoPeso, CalculoCapacidad, CalculoPasajeros, CalculoNumMotores;

    Scanner entrada = new Scanner(System.in);
    
//Metodo Constructor
    
    public void setPeso(int xPeso2){
        
        this.Peso = xPeso2;
        
    }
    
    public void setCapacidad(int xCapacidad2){
        
        this.Capacidad = xCapacidad2;
        
    }    
    
    public void setPasajeros (int xPasajeros2){
        
        this.Pasajeros = xPasajeros2;
        
    }    
    
    public void setNumMotores(int xNumMotores2){
        
        this.NumMotores = xNumMotores2;
        
    }
    
    //Metodo Peso
    
    public void CalcularPeso(){
        
        CalculoPeso = Peso * 750;
        
    }
    
        //Getter: Peso

            public int getInfoPeso(){

                return Peso;

            }
            
    //Metodo Capacidad
            
    public void CalcularCapacidad(){
        
        CalculoCapacidad = Capacidad * 25;
        
    }
            //Getter: Capacidad


            public int getInfoCapacidad(){

                return Capacidad;

            }
    
    //Metodo Pasajeros
            
    public void CalcularPasajeros(){
        
        CalculoPasajeros = Pasajeros * 20;
        
    }
            //Getter: Pasajeros

            public int getInfoPasajeros(){

                return Pasajeros;

            }
    
    //Metodo NumMotores
            
    public void CalculoNumMotores(){
        
        CalculoNumMotores = NumMotores * 400000;
        
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
