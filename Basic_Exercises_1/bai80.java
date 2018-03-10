package JavaBasic;

import java.util.Arrays;

public class bai80 {
	 public static void main(String[] args)
	 {
	    int[] mang = {20, 30, 40};
		System.out.println("Mang: "+Arrays.toString(mang)); 
		int gtriln = mang[0];
		if(mang[2] >= gtriln)
			gtriln = mang[2];
		System.out.println("Gia tri lon nhat trong mang: "+gtriln); 	 
	 }	
}
