package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
public class bai25 {

	public static void main(String[] args) {
		String a = "chu y: cam on ban da chu y toi chu y nay, chu y cua ban se duoc chu y";
		String b = a.replaceAll("chu y", "dung chu y");
		System.out.println("chuoi cu: "+a);
		System.out.println("chuoi moi: " +b);
	}

}
