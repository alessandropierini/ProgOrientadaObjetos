package constructoraviones;

import java.util.Scanner;

public class vehiculoAereo {
    
    int xPeso1, xPeso2, xPeso3, xPeso4;
    int xCapacidad1, xCapacidad2, xCapacidad3, xCapacidad4;
    int xPasajeros1, xPasajeros2, xPasajeros3, xPasajeros4;
    int xNumMotores1, xNumMotores2, xNumMotores3, xNumMotores4;
    
    public static void main(String args[]){
    
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("************************************************");
        System.out.println("* Sistema de Construccion de Aeronaves Virtual *");
        System.out.println("************************************************");
                
        System.out.println("");
        System.out.println("Por favor elija el tipo de aeronave que desea construir:");
        System.out.println("");
                
        System.out.println("  ~OPCIONES~");
        System.out.println("1. Avion de Carga");
        System.out.println("2. Avion de Pasajeros");
        System.out.println("3. Avioneta");
        System.out.println("4. Helicoptero");
        System.out.println("Introduzca su opcion a continuacion: ");
        int seleccion = entrada.nextInt();
        System.out.println();
        
        switch(seleccion){
            
            case 1:
                
                AvionCarga avioncarga = new AvionCarga();
                
                System.out.println("CONSTRUCTOR VIRTUAL: Avion de Carga");
                System.out.println("");
                
                System.out.println("Peso ($1000/kg): ");
                int xPeso = entrada.nextInt();
                avioncarga.setPeso(xPeso);
        
                System.out.println("Capacidad de carga, ($10/kg): ");
                int xCapacidad = entrada.nextInt();
                avioncarga.setCapacidad(xCapacidad);
                
                System.out.println("Numero de pasajeros, ($50/pasajero): ");
                int xPasajeros = entrada.nextInt();
                avioncarga.setPasajeros(xPasajeros);
        
                System.out.println("Numero de motores, ($500,000/motor): ");
                int xNumMotores = entrada.nextInt();
                avioncarga.setNumMotores(xNumMotores);

        
                avioncarga.CalcularCapacidad();
                avioncarga.CalcularPasajeros();
                avioncarga.CalcularPeso();
                avioncarga.CalculoNumMotores();
                avioncarga.CalculoCosto();
                
                
                        System.out.println("");
        System.out.println("Construyendo su aeronave, esto puede tomar unos segundos...");
        System.out.println("");
        
        System.out.println("DETALLES DE AERONAVE:");
        System.out.println("");
        System.out.println("El tipo de su aeronave es: Avion de Carga");
        System.out.println("El peso de su aeronave es de: " + avioncarga.getInfoPeso() + " kg.");
        System.out.println("La capacidad de carga de su aeronave es de: " + avioncarga.getInfoCapacidad() + " kg.");
        System.out.println("La cantidad de asientos para pasajeros es de: " + avioncarga.getInfoPasajeros() + ".");
        System.out.println("La cantidad de motores de su aeronave es de: " + avioncarga.getInfoNumMotores() + " motores.");
        
        System.out.println("");
        System.out.println("El costo de la aeronave tipo Avion de Carga es de: $" + avioncarga.getInfoCosto() + ".");
                
                break;
                
            case 2:
                
                AvionPasajeros avionpasajeros = new AvionPasajeros();
                
                System.out.println("CONSTRUCTOR VIRTUAL: Avion de Pasajeros");
                System.out.println("");
                
                System.out.println("Peso ($750/kg): ");
                int xPeso2 = entrada.nextInt();
                avionpasajeros.setPeso(xPeso2);
        
                System.out.println("Capacidad de carga, ($25/kg): ");
                int xCapacidad2 = entrada.nextInt();
                avionpasajeros.setCapacidad(xCapacidad2);
                
                System.out.println("Numero de pasajeros, ($20/pasajero): ");
                int xPasajeros2 = entrada.nextInt();
                avionpasajeros.setPasajeros(xPasajeros2);
        
                System.out.println("Numero de motores, ($400,000/motor): ");
                int xNumMotores2 = entrada.nextInt();
                avionpasajeros.setNumMotores(xNumMotores2);

        
                avionpasajeros.CalcularCapacidad();
                avionpasajeros.CalcularPasajeros();
                avionpasajeros.CalcularPeso();
                avionpasajeros.CalculoNumMotores();
                avionpasajeros.CalculoCosto();
                
                
                        System.out.println("");
        System.out.println("Construyendo su aeronave, esto puede tomar unos segundos...");
        System.out.println("");
        
        System.out.println("DETALLES DE AERONAVE:");
        System.out.println("");
        System.out.println("El tipo de su aeronave es: Avion de Pasajeros");
        System.out.println("El peso de su aeronave es de: " + avionpasajeros.getInfoPeso() + " kg.");
        System.out.println("La capacidad de carga de su aeronave es de: " + avionpasajeros.getInfoCapacidad() + " kg.");
        System.out.println("La cantidad de asientos para pasajeros es de: " + avionpasajeros.getInfoPasajeros() + ".");
        System.out.println("La cantidad de motores de su aeronave es de: " + avionpasajeros.getInfoNumMotores() + " motores.");
        
        System.out.println("");
        System.out.println("El costo de la aeronave tipo Avion de Pasajeros es de: $" + avionpasajeros.getInfoCosto() + ".");
                
                break;
                
            case 3:
                
                Avioneta avioneta = new Avioneta();
                
                System.out.println("CONSTRUCTOR VIRTUAL: Avioneta");
                System.out.println("");
                
                System.out.println("Peso ($250/kg): ");
                int  xPeso3 = entrada.nextInt();
                avioneta.setPeso(xPeso3);
        
                System.out.println("Capacidad de carga, ($50/kg): ");
                int xCapacidad3 = entrada.nextInt();
                avioneta.setCapacidad(xCapacidad3);
                
                System.out.println("Numero de pasajeros, ($50/pasajero): ");
                int xPasajeros3 = entrada.nextInt();
                avioneta.setPasajeros(xPasajeros3);
        
                System.out.println("Numero de motores, ($150,000/motor): ");
                int xNumMotores3 = entrada.nextInt();
                avioneta.setNumMotores(xNumMotores3);

        
                avioneta.CalcularCapacidad();
                avioneta.CalcularPasajeros();
                avioneta.CalcularPeso();
                avioneta.CalculoNumMotores();
                avioneta.CalculoCosto();
                
                
                        System.out.println("");
        System.out.println("Construyendo su aeronave, esto puede tomar unos segundos...");
        System.out.println("");
        
        System.out.println("DETALLES DE AERONAVE:");
        System.out.println("");
        System.out.println("El tipo de su aeronave es: Avioneta");
        System.out.println("El peso de su aeronave es de: " + avioneta.getInfoPeso() + " kg.");
        System.out.println("La capacidad de carga de su aeronave es de: " + avioneta.getInfoCapacidad() + " kg.");
        System.out.println("La cantidad de asientos para pasajeros es de: " + avioneta.getInfoPasajeros() + ".");
        System.out.println("La cantidad de motores de su aeronave es de: " + avioneta.getInfoNumMotores() + " motores.");
        
        System.out.println("");
        System.out.println("El costo de la aeronave tipo Avioneta es de: $" + avioneta.getInfoCosto() + ".");
                
                break;
                
            case 4:
                
                Helicopteros helicopteros = new Helicopteros();
                
                System.out.println("CONSTRUCTOR VIRTUAL: Helicoptero");
                System.out.println("");
                
                System.out.println("Peso ($500/kg): ");
                int xPeso4 = entrada.nextInt();
                helicopteros.setPeso(xPeso4);
        
                System.out.println("Capacidad de carga, ($1000/kg): ");
                int xCapacidad4 = entrada.nextInt();
                helicopteros.setCapacidad(xCapacidad4);
                
                System.out.println("Numero de pasajeros, ($100/pasajero): ");
                int xPasajeros4 = entrada.nextInt();
                helicopteros.setPasajeros(xPasajeros4);
        
                System.out.println("Numero de motores, ($250,000/motor): ");
                int xNumMotores4 = entrada.nextInt();
                helicopteros.setNumMotores(xNumMotores4);

        
                helicopteros.CalcularCapacidad();
                helicopteros.CalcularPasajeros();
                helicopteros.CalcularPeso();
                helicopteros.CalculoNumMotores();
                helicopteros.CalculoCosto();
                
                
                        System.out.println("");
        System.out.println("Construyendo su aeronave, esto puede tomar unos segundos...");
        System.out.println("");
        
        System.out.println("DETALLES DE AERONAVE:");
        System.out.println("");
        System.out.println("El tipo de su aeronave es: Helicoptero");
        System.out.println("El peso de su aeronave es de: " + helicopteros.getInfoPeso() + " kg.");
        System.out.println("La capacidad de carga de su aeronave es de: " + helicopteros.getInfoCapacidad() + " kg.");
        System.out.println("La cantidad de asientos para pasajeros es de: " + helicopteros.getInfoPasajeros() + ".");
        System.out.println("La cantidad de motores de su aeronave es de: " + helicopteros.getInfoNumMotores() + " motores.");
        
        System.out.println("");
        System.out.println("El costo de la aeronave tipo Helicoptero es de: $" + helicopteros.getInfoCosto() + ".");                
                
                break;
                
            default: 
                
                System.out.println("Su seleccion fue invalida.");
                
                break;
            
        }
        
    }
    
}
