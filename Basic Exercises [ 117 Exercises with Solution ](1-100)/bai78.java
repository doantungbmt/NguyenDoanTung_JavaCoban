package JavaBasic;

import java.util.Arrays;

public class bai78 {
	 public static void main(String[] args)
	 {
	    int[] mang = {5, 7};
		System.out.println("Mang: "+Arrays.toString(mang)); 
		if(mang[0] == 4 || mang[0] == 7)
			System.out.println("True");
		else
	    System.out.println(mang[1] == 4 || mang[1] == 7);
		 
	 }
}
