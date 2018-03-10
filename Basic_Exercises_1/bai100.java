package JavaBasic;

import java.util.Arrays;

public class bai100 {
	public static void main(String[] args)
	 {
		int[] mang1 = {10, 11, 10, 20, 43, 20, 50};
		int[] mang2 = {10, 13, 11, 20, 44, 30, 50};
		System.out.println("Mang 1: "+Arrays.toString(mang1)); 
		System.out.println("Mang 2: "+Arrays.toString(mang2)); 
		int ctr = 0;
	    
	    for(int i = 0; i < mang1.length; i++) {
	        if(Math.abs(mang1[i] - mang2[i]) <= 1 && mang1[i] != mang2[i])
	            ctr++;
	    }
	                    
	    System.out.printf("ket qua: "+ctr);
		System.out.printf("\n");	 
	  }
}
