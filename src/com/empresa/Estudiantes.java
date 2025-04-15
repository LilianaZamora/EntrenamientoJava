package com.empresa;

public class Estudiantes {
	
	public Estudiantes() {	
	System.out.println("Hola, estoy en el constructor");
	}
	
	int numero;
	String nombre;
	
	public Estudiantes(int i, String n) { //Sobrecarga de constructores
		numero = i;
		nombre = n;
	}
	
	public void desplegar() { 
		System.out.println("Numero es: " + numero + " Nombre es: " + nombre);
	}
	
	public static void main(String args[]) {
       Estudiantes est1 = new Estudiantes(); 
       Estudiantes est2 = new Estudiantes(1,"Lili");       
       Estudiantes est3 = new Estudiantes(2,"Gaia");   
       Estudiantes est4 = new Estudiantes(3,"Ango"); 
       est2.desplegar();
       est3.desplegar();
       est4.desplegar();
	}
}

