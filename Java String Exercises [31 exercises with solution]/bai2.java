package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to get the character (Unicode code point) at the given index within the String.
public class bai2 {

	public static void main(String[] args) {
		String chuoi = "Hello world";
		System.out.println(chuoi);
		int a = chuoi.codePointAt(1);
		System.out.println("ky tu thu 1(unicode point): " + a);
	}

}
