package JavaBasic;

import java.util.Arrays;

public class bai101 {
	public static void main(String[] args)
	 {
		int[] mang = {10, 11, 10, 30, 45, 20, 33, 53};
	    //int ketqua = 0; 
		System.out.println("Mang: "+Arrays.toString(mang)); 
	    
		int ctr1 = 0;
	    int ctr2 = 0;
	      
	    for(int i = 0; i < mang.length; i++) {
	        if(mang[i] == 10)
	            ctr1++;
	                        
	        if(mang[i] == 20)
	            ctr2++;
	    }                                      
	    System.out.println(String.valueOf(ctr1 > ctr2));
		System.out.println("\n");
	  }
}
