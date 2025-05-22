package Strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" world!");
		sb.insert(5, " all");
		sb.replace(0, 5, "Hi");
	    sb.delete(3, 7);	   
	    sb.reverse();
		System.out.println(sb.toString());
	}
}
