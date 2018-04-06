package Java_String_Exercises_31_exercises_with_solution;
	// Write a java program to count a number of Unicode code points in the specified text range of a String. 
public class bai4 {
	public static void main (String[]args) {
		String chuoi = "Hello world";
		System.out.println(chuoi);
		int a = chuoi.codePointCount(1,4);
		System.out.println("So luong codepoint: " + a);
	}
}
