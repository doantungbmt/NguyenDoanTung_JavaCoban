package JavaBasic;

import java.util.Scanner;

public class bai57 {
	 public static void main(String[] args){
	      Scanner key = new Scanner(System.in);
	      System.out.print("Nhap so: ");
	      int x = key.nextInt(); 

			System.out.println(ketqua(x));
		 } 		
		public static int ketqua(int num) {	
			int a = 0;
	        for(int i=1; i<=(int)Math.sqrt(num); i++) {
	            if(num%i==0 && i*i!=num) {
	                a+=2;
	            } else if (i*i==num) {
	                a++;
	            }
	        }
	        return a;
		}
}
