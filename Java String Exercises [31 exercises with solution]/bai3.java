package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to get the character (Unicode code point) before the specified index within the String.
public class bai3 {

	public static void main(String[] args) {
		String chuoi = "Hello world";
		System.out.println(chuoi);
		int a = chuoi.codePointBefore(1);
		System.out.println("ky tu thu 1 (unicode point): " + a);
	}

}
