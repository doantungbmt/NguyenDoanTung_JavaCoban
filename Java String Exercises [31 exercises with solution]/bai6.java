package Java_String_Exercises_31_exercises_with_solution;
	//Write a java program to compare two strings lexicographically, ignoring case differences
public class bai6 {

	public static void main(String[] args) {
		String chuoi1="Hello World";
		String chuoi2="Hello Java";
		System.out.println("chuoi 1: "+chuoi1);
		System.out.println("chuoi 2: "+chuoi2);
		int rs = chuoi1.compareToIgnoreCase(chuoi2);
		if(rs<0) {
			System.out.println(chuoi1 +" it ky tu hon " +chuoi2);
		}
		if(rs==0) {
			System.out.println(chuoi1+" co ky tu bang " +chuoi2);
		}
		if(rs>0) {
			System.out.println(chuoi1+" nhieu ky tu hon "+chuoi2);
		}
	}

}
