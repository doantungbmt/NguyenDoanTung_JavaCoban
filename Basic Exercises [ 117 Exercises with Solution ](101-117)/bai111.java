package JavaBasic;

import java.util.Scanner;

public class bai111 {
	 public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner key = new Scanner(System.in);	
	   System.out.println("Nhap so thu nhat: ");
	   x = key.nextInt(); 
	   System.out.println("Nhap so thu hai: ");
	   y = key.nextInt(); 
      while(y != 0){
            int z = x & y;
            x = x ^ y;
            y = z << 1;
        }
        System.out.println("Tong: "+x);     	
	}
}
