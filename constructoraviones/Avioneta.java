package constructoraviones;

import java.util.Scanner;

public class Avioneta {

//Atributos
    
    private int Costo, Peso, Capacidad, Pasajeros, NumMotores;
    private int CalculoPeso, CalculoCapacidad, CalculoPasajeros, CalculoNumMotores;

    Scanner entrada = new Scanner(System.in);
    
//Metodo Constructor
    
    public void setPeso(int xPeso3){
        
        this.Peso = xPeso3;
        
    }
    
    public void setCapacidad(int xCapacidad3){
        
        this.Capacidad = xCapacidad3;
        
    }    
    
    public void setPasajeros (int xPasajeros3){
        
        this.Pasajeros = xPasajeros3;
        
    }    
    
    public void setNumMotores(int xNumMotores3){
        
        this.NumMotores = xNumMotores3;
        
    }
    
    //Metodo Peso
    
    public void CalcularPeso(){
        
        CalculoPeso = Peso * 250;
        
    }
    
        //Getter: Peso

            public int getInfoPeso(){

                return Peso;

            }
            
    //Metodo Capacidad
            
    public void CalcularCapacidad(){
        
        CalculoCapacidad = Capacidad * 50;
        
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
        
        CalculoNumMotores = NumMotores * 150000;
        
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
