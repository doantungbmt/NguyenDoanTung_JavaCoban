package JavaBasic;

import java.util.Arrays;

public class bai92 {
	public static void main(String[] args)
	 {
	    int[] mang = {5, 7, 2, 4, 9};
		int a = 0, b = 0;
		System.out.println("Mang: "+Arrays.toString(mang)); 
		    
	    for(int i = 0; i < mang.length; i++) {
	        if(mang[i] % 2 == 0)
			{         
	          a++;
			}
			else
			   b++;	
	    }                 
	    System.out.println("So phan tu chan cua mang: "+a);
		System.out.println("so phan tu le cua mang: "+b);
			
	  }
}
