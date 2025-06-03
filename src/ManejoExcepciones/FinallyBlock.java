package ManejoExcepciones;

public class FinallyBlock {

	public static void main(String[] args) {
		Integer resultado = null;
	try{
		System.out.println("Intentando dividir...");	
		resultado = 10 / 0;
		System.out.println("Resultado " + resultado);	
		System.out.println("Guardando resultado...");	
		}catch (ArithmeticException e) {
			System.out.println("Error: División entre cero...");			
		} finally {
			//Solo limpieza
			System.out.println("Cerrando conexión a BDD...");	
		}

	}

}
