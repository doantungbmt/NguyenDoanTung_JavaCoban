package JavaBasic;

import java.util.Arrays;

public class bai81 {
	public static void main(String[] args)
	 {
	    int[] mang = {20, 30, 40};
		System.out.println("Mang: "+Arrays.toString(mang)); 
		int x = mang[0];
		mang[0] = mang[mang.length-1];
		mang[mang.length-1] = x;
		System.out.println("Mang moi: "+Arrays.toString(mang));  
	 }
}
