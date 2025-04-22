package Opps; //Polimorfismo por ejecución

public class CalcularIntereses {
	public static void main(String args[]) {
		Bancolombia ba = new Bancolombia();
		Davivienda da = new Davivienda();
		System.out.println("El interes de Bancolombia es :" + ba.getIntereses());
		System.out.println("El interes de Davivienda es :" + da.getIntereses());
	}		
}
