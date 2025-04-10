package com.empresa;

public class CondicionalesIf {
	public static void main(String args[]) {
		int a = 400;
		
		/*if(a>100)
		{		
			System.out.println("La variable a es mayor a 100");		
		}*/		
		/*if(a<1000)
		{		
			System.out.println("La variable a es menor a 1000");		
		}
		else {
			System.out.println("La variable a es mayor a 1000");
		}*/
		if(a==100)
		{
			System.out.println("La variable a igual a 100");
		} 
		else if (a==200){
			System.out.println("La variable a igual a 200");
		}
		else if (a==300){
			System.out.println("La variable a igual a 300");
		}
		else {			
				System.out.println("La variable a no es igual a ningún número");
		}
	}
}
