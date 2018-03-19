package JavaBasic;

public class bai72 {
	 public static void main(String[] args)
	 {
	    String a = "";    
		int b = a.length();
		if(b >= 3)
			System.out.println( a.substring(0, 3));
		else if(b == 1)
			System.out.println( (a.charAt(0)+"##"));
		else
			System.out.println("###");
		}
}
