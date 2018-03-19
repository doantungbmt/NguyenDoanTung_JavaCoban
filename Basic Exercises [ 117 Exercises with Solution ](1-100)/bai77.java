package JavaBasic;

import java.util.Arrays;

public class bai77 {
	public static void main(String[] args)
	 {
	    int[] mang1 = {50, -20, 0};
		int[] mang2 = {5, -50, 10};
		System.out.println("Array1: "+Arrays.toString(mang1)); 
		System.out.println("Array2: "+Arrays.toString(mang2)); 
	    int[] mang3 = {mang1[0], mang2[2]};	
		System.out.println("mang 3: "+Arrays.toString(mang3)); 	 
	 }
}
