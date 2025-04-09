package com.empresa;

public class VariableDeInstancia {
	String nombre;
	
	void mostrarNombre() //Método que no retorna nada
	{
		System.out.println("Nombre: " + nombre);
	}
	
	public static void main(String args[]) {
		VariableDeInstancia p1 = new VariableDeInstancia();
		p1.nombre = "LIiana Zamora"; //Instancia de la clase
		p1.mostrarNombre();		
	}
}
