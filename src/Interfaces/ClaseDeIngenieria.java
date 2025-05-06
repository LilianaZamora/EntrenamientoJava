package Interfaces;

public class ClaseDeIngenieria implements Estudiante{	

	public void mostrarNombre() {
		System.out.println("Hola, somos estudiantes de ingeniería");		
	}

	public void obtenerNumeroDeEstudiantes() {
		System.out.println("Somos 50 estudiantes de ingeniería");				
	}

	public void obtenerGrado() {
		System.out.println("Somos de último semestre");		
	}
	
	public void obtenerUniversidad() {
		System.out.println("La universidad es:" + universidad);			
	}
	
	public void ObtenerNombreInterface() {
		
		
	}
	
	public static void main(String[] args) {
		ClaseDeIngenieria ing  = new ClaseDeIngenieria();
		ClaseDeMedicina med  = new ClaseDeMedicina();
		
		ing.mostrarNombre();
		ing.obtenerGrado();
		ing.obtenerNumeroDeEstudiantes();
		ing.obtenerUniversidad();
		
		System.out.println("*******************************");	
		
		med.mostrarNombre();
		med.obtenerGrado();
		med.obtenerNumeroDeEstudiantes();
		med.obtenerUniversidad();		
	}
}
