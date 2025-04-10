package com.empresa;

public class Gato {
	
	String nombre = "Gaia";
	String raza = "Criolla naranja";
	int edad = 3;
	
	public void maullar() {
		System.out.println(nombre+" está maullando");
	}
	
	 public static void main(String args[]) {
       Gato gato = new Gato();    	     
	   gato.maullar();
	   System.out.println("y es de raza "+gato.raza);
	   System.out.println("y tiene "+gato.edad+" años");
	 }
}

