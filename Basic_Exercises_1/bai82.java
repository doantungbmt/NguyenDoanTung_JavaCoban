package JavaBasic;

import java.util.Arrays;

public class bai82 {
	public static void main(String[] args)
	 {
	    int[] mang = {20, 30, 40, 50, 67};
		System.out.println("Original Array: "+Arrays.toString(mang)); 
		int gtrilonnhat = mang[0];
		if(gtrilonnhat <= mang[mang.length-1])
			gtrilonnhat = mang[mang.length-1];
		if(gtrilonnhat <= mang[mang.length/2])
			gtrilonnhat = mang[mang.length/2];
		System.out.println("Gia tri lon nhat: "+gtrilonnhat);  
	 }
}
