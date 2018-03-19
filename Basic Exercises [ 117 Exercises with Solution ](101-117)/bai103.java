package JavaBasic;

import java.util.Arrays;

public class bai103 {
	 public static void main(String[] args)
	 {
		int[] mangso = {11, 10, 13, 10, 45, 20, 33, 53};
	    int ketqua = 0; 
		System.out.println("Mang: "+Arrays.toString(mangso)); 
		
		int l = mangso.length - 1;
		int[] mangmoi;
		while(mangso[l] != 10)
			l--;
		mangmoi = new int[mangso.length - 1 - l];
		for(int i = l + 1; i < mangso.length; i++)
			mangmoi[i - l - 1] = mangso[i];
		System.out.println("Mang moi: "+Arrays.toString(mangmoi)); 
	  }
}	
