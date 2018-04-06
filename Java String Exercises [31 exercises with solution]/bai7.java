package Java_String_Exercises_31_exercises_with_solution;
	// Write a Java program to concatenate a given string to the end of another string
public class bai7 {

	public static void main(String[] args) {
		String chuoi1="Hello World ";
		String chuoi2="Hello Java";
		System.out.println("chuoi 1: "+chuoi1);
		System.out.println("chuoi 2: "+chuoi2);
		String chuoi3=chuoi1.concat(chuoi2);
		System.out.println("chuoi 1 + chuoi 2 = " + chuoi3);
	}

}
