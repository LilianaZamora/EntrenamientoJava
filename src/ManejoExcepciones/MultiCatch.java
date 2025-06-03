package ManejoExcepciones;

import java.io.FileReader;
import java.io.IOException;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int resultado = 10/0;
			FileReader file = new FileReader("archivo.txt");
		} catch (ArithmeticException e) {
			System.out.println("Error: Ocurrio un error arimético");	
			System.out.println(e.getClass().getSimpleName());	
		} catch (IOException e) {
			System.out.println("Error: Ocurrio un error de archivo");	
			System.out.println(e.getClass().getSimpleName());	
		}
	}

}
