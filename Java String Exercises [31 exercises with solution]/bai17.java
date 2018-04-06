package Java_String_Exercises_31_exercises_with_solution;

public class bai17 {

	public static void main(String[] args) {
		String str = "This is a sample string.";
        char[] mang = new char[] { ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ' };
        str.getChars(4, 10, mang, 2);
        System.out.println(mang);
	}

}
