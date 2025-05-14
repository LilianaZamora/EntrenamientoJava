package Strings;

public class IntroduccionString {
	
	public static void main(String[] args) {
		String nombre = "Gaia";
		String nombre2 = "Ango";
		String nombre3 = "Lilita";
		
		String pais = new String("Locombia");
		String pais2 = new String("Locombia");
		
		System.out.println(nombre.equals(nombre2));		
		System.out.println(nombre2.equals(nombre3));	
		System.out.println(pais.equals(pais2));
		System.out.println(nombre.equalsIgnoreCase(nombre2));
		 
		System.out.println("//*****************************************//");		
		System.out.println(nombre==nombre2);		
		System.out.println(pais==pais2);	 
		
		//Concatenación
		
		String primerString = nombre+nombre2;
		System.out.println(primerString);	
		String segundoString = nombre.concat(nombre2).concat(nombre3);
		System.out.println(segundoString);		 		 
	}
}
