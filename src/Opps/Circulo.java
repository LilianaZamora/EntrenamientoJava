package Opps;

public class Circulo extends Formas{		
	
	public static void main(String args[]) {
		Formas c = new Circulo();
		Formas t =  new Triangulo();
		Formas r =  new Rectangulo();
		c.mostrarForma();
		t.mostrarForma();
		r.mostrarForma();	
	}

	public void mostrarForma() {
		System.out.println("La forma es una circunferencia");		
	}
}
