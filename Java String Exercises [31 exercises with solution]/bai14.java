package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to compare a given string to another string, ignoring case considerations. 
public class bai14 {

	public static void main(String[] args) {
		String chuoi1="Hello World";
		String chuoi2="Hello Java";
		String chuoi3="hello world";
		boolean check1=chuoi1.equalsIgnoreCase(chuoi2);
		boolean check2=chuoi1.equalsIgnoreCase(chuoi3);
		System.out.println(chuoi2+" = "+chuoi1+" ? "+check1);
		System.out.println(chuoi3+" = "+chuoi1+" ? "+check2);
	}

}
