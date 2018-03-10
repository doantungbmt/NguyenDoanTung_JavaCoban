package JavaBasic;

import java.util.Arrays;

public class bai104 {
	public static void main(String[] args)
	 {
		int[] mangso = {11, 15, 13, 10, 45, 20, 33, 53};
	    int ketqua = 0; 
		System.out.println("Mang: "+Arrays.toString(mangso)); 
		
		int l = 0;
		int[] mangmoi;
		while(mangso[l] != 10)
		  l++;
		mangmoi = new int[l];
		for(int i = 0; i < l; i++)
			mangmoi[i] = mangso[i];
		System.out.println("Mang moi: "+Arrays.toString(mangmoi)); 
	  }
	}

