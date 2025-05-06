package Opps;

public class BancoNuPrestamo extends BancoPrestamo{
		
	public static void main(String args[]) {
		
		BancoNuPrestamo prestamo = new BancoNuPrestamo();
		prestamo.setNombre("GaiAngel");
		prestamo.setEdad(63);
		prestamo.setCantidad(50000);
		
		System.out.println("El nombre es: " + prestamo.getNombre());
		System.out.println("Tiene: " + prestamo.getEdad() + " años");
		System.out.println("El préstamo aprobado es por $: " + prestamo.getCantidad());
	}

}
