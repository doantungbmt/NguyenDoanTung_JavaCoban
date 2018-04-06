package Java_String_Exercises_31_exercises_with_solution;
	// Write a Java program to check whether a given string starts with the contents of another string. 
public class bai26 {

	public static void main(String[] args) {
		String chuoi1="Mau` do la mau`  mau'";
		String chuoi2="Mau` vang` la` mau` da";
		String check="Mau` do";
		boolean check1=chuoi1.startsWith(check);
		boolean check2=chuoi2.startsWith(check);
		System.out.println("chuoi 1: "+"'"+chuoi1+"'"+"bat dau bang: "+"'"+check+"' "+check1);
		System.out.println("chuoi 2: "+"'"+chuoi2+"'"+"bat dau bang: "+"'"+check+"' "+check2);

	}

}
