package Opps;

public class BancoPrestamo {
	
	//Encapsulamiento
	private String nombre; 
	private int edad;
	private int cantidad;
	
	public void setNombre(String nombre) { //Lo que entre por acá
		this.nombre = nombre;		
	}
	
	public void setEdad(int edad) {
		
		if (edad>=18 && edad <=60)
		{
			this.edad = edad;
		}
		else {
			System.out.println("Ingrese una edad válida");
		}
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;		
	}
	
	public String getNombre() { //Lo retorna por acá
		return nombre;		
	}
	
	public int getEdad() {
		return edad;		
	}
	
	public int getCantidad() {
		return cantidad;		
	}
}
