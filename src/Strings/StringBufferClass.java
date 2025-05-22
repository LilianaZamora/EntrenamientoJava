package Strings;

public class StringBufferClass {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world!");    
        sb.insert(5, " all");
        sb.replace(0, 5, "Hi");
        sb.delete(3, 7);        
        System.out.println(sb.toString());        
    }
}