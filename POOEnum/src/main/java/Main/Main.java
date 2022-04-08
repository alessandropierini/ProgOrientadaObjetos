package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
            System.out.println("****************************");
            System.out.println("* Calculador dia laborable *");
            System.out.println("****************************");
            System.out.println("");
            System.out.println("Introduce un dia de semana: ");
Scanner scanner = new Scanner(System.in);
System.out.println("");
String dia = scanner.next();

Enum diaS = Enum.valueOf(dia.toUpperCase());

System.out.println(diaS.toString());

 }
}