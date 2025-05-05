package Opps;

public class MazdaSuper extends CarroSuper{
	String nombre="Mazda";
	
	public void getNombre() {
		System.out.println(nombre);
		System.out.println(super.nombre);
	}
	
	public void run() {
		System.out.println("El carro está transitando");
		super.run();
	}
	
	MazdaSuper(){
		super();
		System.out.println("Llamando al constructor de Mazda");		
	}
	
	public static void main(String args[]) {
		MazdaSuper maz = new MazdaSuper();
		maz.getNombre();		
		maz.run();
	}
}
