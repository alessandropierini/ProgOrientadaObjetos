import java.util.Scanner;

public class Tarea1 {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, result = 0, option = 0;
		
		System.out.println("****************************");
		System.out.println("* Bienvenido a Calculadora *");
		System.out.println("****************************");
		System.out.println("");
		
		System.out.print("Introduzca el primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("");
		
		System.out.print("Introduzca el segundo numero: ");
		num2 = input.nextInt();
		
		System.out.println("Elija una operacion aritmetica:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("");
		System.out.print("Introduzca el numero de la operacion: ");
		option = input.nextInt();
		
		System.out.println("");
		
		switch(option) {
		
		case 1:
		
			result = num1 + num2;
				System.out.println("El resultado de la suma es: " + result); break;
			
		case 2:
			
			result = num1 - num2;
				System.out.println("El resultado de la resta es: " + result); break;
			
		case 3:
			
			result = num1 * num2;
				System.out.println("El resultado de la multiplicacion es: " + result); break;
			
		case 4: 
			
			result = num1 / num2;
				System.out.println("El resultado de la division es: " + result); break;
				
		default:
			
			System.out.println("Opcion invalida."); break;
		
		
		}
		
	}
	
}
