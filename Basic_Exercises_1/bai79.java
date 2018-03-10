package JavaBasic;

import java.util.Arrays;

public class bai79 {
	public static void main(String[] args)
	 {
	    int[] mang = {20, 30, 40};
		System.out.println("Mang: "+Arrays.toString(mang)); 
		int[] mang2 = {mang[1], mang[2], mang[0]};
		System.out.println("mang xoay chieu: "+Arrays.toString(mang2)); 	 
	 }
}
