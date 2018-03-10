package JavaBasic;

import java.util.Arrays;

public class bai94 {
	 public static void main(String[] args)
	 {
	    int[] mangso = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
		  
		int i = 0;
	    System.out.println("Mang: "+Arrays.toString(mangso)); 
	    while(i < mangso.length && mangso[i] % 2 == 0)
	        i++;
	              
	    for(int j = i + 1; j < mangso.length; j++) {
	        if(mangso[j] % 2 != 0) {
	            int temp = mangso[i];
	            mangso[i] = mangso[j];
	            mangso[j] = temp;
	            i++;
	        }
	    }                                                    
	  
		 System.out.println("Mang moi: "+Arrays.toString(mangso)); 
	  }
}
