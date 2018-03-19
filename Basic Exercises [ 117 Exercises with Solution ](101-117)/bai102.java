package JavaBasic;

import java.util.Arrays;

public class bai102 {
	public static void main(String[] args)
	 {
		int[] mangso = {11, 11, 13, 31, 45, 20, 33, 53};
	    int ketqua = 1; 
		System.out.println("Mang: "+Arrays.toString(mangso)); 
		
		for(int i = 0; i < mangso.length; i++)
	     {
	      	if(mangso[i] == 10 || mangso[i] == 30)
			{	
	  		
	      		ketqua =0;
			}
	      }
		 if (ketqua==0)
	 	   System.out.println( String.valueOf(true));	         
	     else
		   System.out.println(String.valueOf(false));
	  }
}
