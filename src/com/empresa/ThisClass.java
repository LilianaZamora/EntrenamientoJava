package com.empresa;

public class ThisClass {
	
	int numeromatricula;
	String nombre;
	String grado;
	
	public ThisClass(int numeromatricula, String nombre, String grado) {
		this.numeromatricula	= numeromatricula;
		this.nombre = nombre;
		this.grado = grado;
	}

	public void display () {
		System.out.println("Número matrícula: " + numeromatricula + " Nombre: " + nombre + " Grado: " + grado); 		
	}
	
	public static void main(String args[]) {
		ThisClass est = new ThisClass(1, "GaiAngo", "Primero");
		est.display();		
	}
}
