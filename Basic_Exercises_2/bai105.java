package JavaBasic;

import java.util.Arrays;

public class bai105 {
	public static void main(String[] args)
	 {
		int[] mangso = {11, 15, 13, 10, 45, 20, 11, 15};
	    System.out.println("Mang: "+Arrays.toString(mangso)); 
		
		int ketqua = 0;
		int l = 2;
	    int a = 0;
		int b = mangso.length-l;
		for(; l > 0; l--)
		{
			if(mangso[a] != mangso[b])
				ketqua = 1;
			else
			{
				a++;
				b++;
			}
		}
		                
	    if (ketqua==1)
		 {
		  System.out.println(String.valueOf(false));
		 }
		else
		 {
		   System.out.println(String.valueOf(true));
		 }
	  }
}
