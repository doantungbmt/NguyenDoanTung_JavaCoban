package JavaBasic;

import java.util.Arrays;

public class bai107 {
	public static void main(String[] args)
	 {
		int[] mangso = {11, 12, 13, 14, 45, 20};
	    System.out.println("Mang: "+Arrays.toString(mangso)); 
		int ketqua =1;
		
	      for(int i = 0; i <= mangso.length - 3; i++) {
	        if(mangso[i] + 1 == mangso[i+1] && mangso[i+1] + 1 == mangso[i+2])
	        	ketqua =0;
	    }
	                
		if (ketqua==1)
		 {
		  System.out.println(String.valueOf(false));
		 }
		else
		 {
		   System.out.println(String.valueOf(true));
		 }
		 System.out.printf("\n");
	 }
}
