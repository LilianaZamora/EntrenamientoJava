package ManejoExcepciones;

import java.util.Scanner;

public class Excepciones {
	public static void main(String[] args) {		
		try {
			//String texto = null;
			String texto = "GaiAngo";
			System.out.println(texto.length());				
		} catch(NullPointerException e) {
			System.out.println("Error: Estás intentando acceder a un objero nulo");				
		}
		
		int numero = pedirNumeroEntero();
		System.out.println("Número ingresado correctamente: " + numero);				
		
	}
	
	public static int pedirNumeroEntero() {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		boolean a = false;
		
		while (!a) {
			System.out.println("Ingrese un número entero: ");		
			String entrada = scanner.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				a = true;
			}catch (NumberFormatException e) {
				System.out.println("Error: No ingresaste un número válido. intenta nuevamente.");	
			}			
		}	
		scanner.close();
		return numero;
	}
}
