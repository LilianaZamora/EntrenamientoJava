package Opps; //Polimorfismo por compilación

public class HijaDeSuma extends Suma{
	
	public static void main(String args[]) {
		Suma ad = new Suma();
		ad.Sumar(2, 6);
		ad.Sumar(1, 6, 10);	
		ad.Sumar(5.4, 7.8, 5.7);
	}
}
