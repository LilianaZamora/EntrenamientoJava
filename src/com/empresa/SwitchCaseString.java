package com.empresa;

public class SwitchCaseString {
	public static void main(String args[]) {
		
	String modulo="Contabilidad";
	
	switch(modulo){
	case "Contabilidad": 
		System.out.println("Ingreso módulo Contabilidad");
	break;	
	case "Presupuesto": 
		System.out.println("Ingreso módulo Presupuesto");
	break;		
	case "Ventas": 
		System.out.println("Ingreso módulo Ventas");
	break;		
	case "Tesoreria": 
		System.out.println("Ingreso módulo Tesorería");
	break;		
	case "Sistemas": 
		System.out.println("Ingreso módulo Sistemas");
	break;		
	case "Nomina": 
		System.out.println("Ingreso módulo Nómina");
	break;		
	case "Inventarios": 
		System.out.println("Ingreso módulo Inventarios");
	break;		
	default: 
		System.out.println("Regrese a la página y seleccione un módulo");					
	}
  }
}
