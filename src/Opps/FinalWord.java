package Opps;

public class FinalWord {
	
	final int maxAge = 100;
	
	public void setAge() {
	//	maxAge = 110; // No se puede cambiar porque tiene final		
	}
	
	public static void main(String args[]) {
		FinalWord fw = new FinalWord();
		System.out.println(fw.maxAge);
	}	
}
