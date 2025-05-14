package Arreglos;

public class Arreglo {
	
	public static void main(String args[]) {
		//Definición arreglo
		int arregloUno[] = new int[6];
		
		//Definición valores
		 arregloUno[0] = 5;
		 arregloUno[1] = 3;
		 arregloUno[2] = 46;
		 arregloUno[3] = 2;
		 arregloUno[4] = 47;	
		 
		 //Acceder a los valores del arreglo
		 System.out.println(arregloUno[4]);
		 
		 //Iterar el arreglo
		 for (int i=0; i<arregloUno.length; i++) {
			 System.out.println(arregloUno[i]);			 
		 }
		 
		 //Otra manera de definir un arreglo
		 int arregloDos[] = {5,3,46,2,47};
		 System.out.println("Tamaño del segundo arreglo " + arregloDos.length);		
	}
}
