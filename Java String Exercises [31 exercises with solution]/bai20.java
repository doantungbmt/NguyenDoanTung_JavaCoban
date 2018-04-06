package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to get the canonical representation of the string object.
public class bai20 {

	public static void main(String[] args) {
		String chuoi1 = "Hello World";
		String chuoi2 = new StringBuffer("Hello").append("World").toString();
		String chuoi3 = chuoi2.intern();
		System.out.println("chuoi1 == chuoi2? "+(chuoi1==chuoi2));
		System.out.println("chuoi1 == chuoi3? "+(chuoi1==chuoi3));
	}

}
