package JavaBasic;

import java.util.Arrays;

public class bai93 {
	public static void main(String[] args)
	 {
		int[] mang = {10, 10, 2, 4, 20, 20};  
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Mang: "+Arrays.toString(mang)); 
		    
	    boolean a = false;
	    boolean b = false;
	      
	    for(int i = 0; i < mang.length - 1; i++) {
	        if(mang[i] == 10 && mang[i+1] == 10)
	            a = true;
	                        
	        if(mang[i] == 20 && mang[i+1] == 20)
	            b = true;
	    }
	   
		System.out.printf( String.valueOf(a != b));	
		System.out.printf("\n");
	  }
}
