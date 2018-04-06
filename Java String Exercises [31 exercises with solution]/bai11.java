package Java_String_Exercises_31_exercises_with_solution;

public class bai11 {

	public static void main(String[] args) {
		char[] mang = new char[] {'a','b','c','d'};
		String chuoi = String.copyValueOf(mang,2,3);
		System.out.println(chuoi);
	}

}
