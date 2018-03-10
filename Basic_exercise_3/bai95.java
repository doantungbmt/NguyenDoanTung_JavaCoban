package JavaBasic;

import java.util.Arrays;

public class bai95 {
	public static void main(String[] args)
	 {
	    int n= 5;
		String[] mang = new String[n];
		
	    for(int i = 0; i < n; i++)
	    	mang[i] = String.valueOf(i);                                  
		 System.out.println("Mang moi: "+Arrays.toString(mang)); 
		 }
}
