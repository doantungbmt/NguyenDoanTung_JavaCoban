package JavaBasic;

import java.util.Arrays;

public class bai106 {
	public static void main(String[] args)
	 {
		int[] mangso = {11, 15, 13, 10, 45, 20};
	    System.out.println("mang: "+Arrays.toString(mangso)); 
		
		if(mangso.length >1)
	    {          
	    int a = mangso[0];
	              
	    for(int i = 1; i < mangso.length; i++)
	    	mangso[i - 1] = mangso[i];
	                        
	    mangso[mangso.length - 1] = a;
		System.out.println("Mang moi: "+Arrays.toString(mangso)); 
		}
	  }
}
