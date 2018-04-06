package Java_String_Exercises_31_exercises_with_solution;
	//Write a Java program to create a unique identifier of a given string.
public class bai18 {

	public static void main(String[] args) {
		String chuoi = "hom nay la thu high";
		int a = chuoi.hashCode();
		System.out.println("code dinh danh cua "+"'"+chuoi+"'"+" la: "+a);
	}

}
