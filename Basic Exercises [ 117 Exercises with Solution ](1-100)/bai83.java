package JavaBasic;

import java.util.Arrays;

public class bai83 {
	 public static void main(String[] args){	
		   String ketqua = "";
		   int[] mangtrai = {1, 3, -5, 4};
		   int[] mangphai = {1, 4, -5, -2};
		   System.out.println("Mang 1: "+Arrays.toString(mangtrai));  
		   System.out.println("Mang 2: "+Arrays.toString(mangphai)); 
	       for (int i = 0; i < mangtrai.length; i++) {
					int num1 = mangtrai[i];
					int num2 = mangphai[i];
					ketqua += Integer.toString(num1 * num2) + " "; 
				}
			System.out.println("ket qua: "+ketqua);     
		 }	
}
