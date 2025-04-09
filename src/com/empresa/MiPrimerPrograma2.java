package com.empresa;

public class MiPrimerPrograma2 {

	
	public static String saludo() //Retorna
	{
		return "Hola mundo";
	}
	
	public static void main(String args[]) { //No retorna
		System.out.println("This is my second program!");			
		String mensaje = saludo();
		System.out.println(mensaje);	
	}
}


