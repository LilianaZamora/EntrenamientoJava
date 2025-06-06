package Arreglos;

public class PasarArregloAMetodo {
	
	//Pasar arreglo a método
	
	public static void encontrarArreglo(int arregloTres[]) {
		int min = arregloTres[0];
		 for (int i=0; i<arregloTres.length; i++) {
			 if (min>arregloTres[i]) {
			 min = arregloTres[i];				 		 
		     }
		 }
		 System.out.println("Elemento menor del arreglo es: " + min);		
	}
	
	public static int[] getArreglo() {
		return new int[] {1,2,3,4,5,6,7,8};
	}

	public static void main(String[] args) {	
		int arregloPrueba[] = {18, 9, 33, 67, 89};
	    PasarArregloAMetodo.encontrarArreglo(arregloPrueba);
	    
	
		System.out.println("//*****************************************//");		
	
	    int arregloCuarto[] = PasarArregloAMetodo.getArreglo();
        System.out.println(arregloCuarto[2]);
	}
}
