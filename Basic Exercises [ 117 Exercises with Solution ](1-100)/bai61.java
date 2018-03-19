package JavaBasic;

import java.util.Scanner;

public class bai61 {
	 public static void main(String[] args){	
	     Scanner key = new Scanner(System.in);
	     System.out.print("Nhap tu: ");
		 String tu = key.nextLine();
		 tu = tu.trim();
		 String ketqua = ""; 
	     char[] ch=tu.toCharArray();  
		 for (int i = ch.length - 1; i >= 0; i--) {
				 ketqua += ch[i];
			 }
		 System.out.println("Reverse word: "+ketqua.trim()); 
		 }			
}
