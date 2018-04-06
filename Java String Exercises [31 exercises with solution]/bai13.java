package Java_String_Exercises_31_exercises_with_solution;
	//Check whether two String objects contain the same data
public class bai13 {

	public static void main(String[] args) {
		String chuoi1="Hello World";
		String chuoi2="Hello Java";
		String chuoi3="Hello World";
		boolean check1=chuoi1.equals(chuoi2);
		boolean check2=chuoi1.equals(chuoi3);
		System.out.println(chuoi2+" = "+chuoi1+" ? "+check1);
		System.out.println(chuoi3+" = "+chuoi1+" ? "+check2);
	}

}
