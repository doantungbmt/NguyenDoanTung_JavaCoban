package Java_String_Exercises_31_exercises_with_solution;

public class bai10 {

	public static void main(String[] args) {
		String chuoi1="facebook.net", chuoi2="facebook.com";
		StringBuffer check=new StringBuffer(chuoi1);
		System.out.println("So sanh chuoi 1 "+chuoi1 +" va " + check +": "+ chuoi1.contentEquals(check));
		System.out.println("So sanh chuoi 2 "+chuoi2 +" va " + check +": "+ chuoi2.contentEquals(check));
	}

}
