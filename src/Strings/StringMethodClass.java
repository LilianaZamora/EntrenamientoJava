package Strings;

public class StringMethodClass {

	public static void main(String[] args) {
		String saludo = "Hello world";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud: " + saludo.length());
		System.out.println("En mayúsculas: " + saludo.toUpperCase());
		System.out.println("En mayúsculas: " + saludo.toLowerCase());
		System.out.println("Contiene 'wor'?: " + saludo.contains("world"));
		System.out.println(saludo.replace("world", "World"));
		System.out.println(saludo.concat(" cats!"));
		System.out.println(saludo.endsWith("world"));
		
		String text1 = "Hello world cats!";
		System.out.println(text1.equals(saludo));
		System.out.println("Indice de W: " + saludo.indexOf("world"));
	}
}
