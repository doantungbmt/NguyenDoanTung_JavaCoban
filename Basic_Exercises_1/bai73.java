package JavaBasic;

public class bai73 {
	public static void main(String[] args)
	 {
	    String a = "Python"; 
		String b = ""; 
		
		int c = b.length();
		String result = "";
		result += (a.length() >= 1) ? a.charAt(0) : '#';
		result += (c >= 1) ? b.charAt(c-1) : '#';
		System.out.println(result);
	 }
}
