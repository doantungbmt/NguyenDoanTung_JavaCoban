package JavaBasic;

import java.util.Arrays;

public class bai113 {
	 public static void main(String[] arg) 
	 {
       int mang1[]=new int[8];
       mang1[0]=1;
       mang1[1]=2;
       mang1[2]=3;
       mang1[3]=4;
       int[] mang2 = {2,5,7,8};
        System.out.println("mang 1: "+Arrays.toString(mang1));  
	    System.out.println("mang 2: "+Arrays.toString(mang2));
		int m =4, n=4;
		int i = m-1, j = n-1, a = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (mang1[i] > mang2[j]) {
            	mang1[a--] = mang1[i--];
            } else {
            	mang1[a--] = mang2[j--];
            }
        }
        while (i >= 0) {
        	mang1[a--] = mang1[i--];
        }
        while (j >= 0) {
        	mang1[a--] = mang2[j--];
        }
 
    	System.out.println("mang ket hop: "+Arrays.toString(mang1));  
	}
}
