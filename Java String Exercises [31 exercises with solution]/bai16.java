package Java_String_Exercises_31_exercises_with_solution;
	// Write a Java program to get the contents of a given string as a byte array.
public class bai16 {

	public static void main(String[] args) {
		String chuoi="day la chuoi";
		byte[] mang_byte = chuoi.getBytes();
		String mangmoi=new String(mang_byte);
		System.out.println(mangmoi);
	}

}
