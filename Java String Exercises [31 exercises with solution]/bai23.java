package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to find whether a region in the current string matches a region in another string
public class bai23 {
	public static void main(String[] args) {
		String chuoi1 = "Con bo an co ben canh dong canh bo de";
		String chuoi2 = "Con bo an co ben canh bo de";
		
		boolean match1 = chuoi1.regionMatches(0, chuoi2, 28, 8);
		boolean match2 = chuoi1.regionMatches(9, chuoi2, 9,8);
		System.out.println("chuoi1[0 - 7]==chuoi2[29 - 35]? "+ match1);
		System.out.println("chuoi1[9 - 15]==chuoi2[9 - 15]? "+ match2);
		
	}
}
