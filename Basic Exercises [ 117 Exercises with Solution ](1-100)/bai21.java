package JavaBasic;

import java.util.Scanner;

public class bai21 {
	 public static void main(String args[])
	    {
	            int sothapphan, a, i=1, j;
	        int mang[] = new int[100];
	        Scanner key = new Scanner(System.in);
			
	        System.out.println("Nhap so thap phan: ");
	        sothapphan = key.nextInt();
			
	        a = sothapphan;
			
	        while(a != 0)
	        {
	            mang[i++] = a%8;
	            a = a/8;
	        }
			
	        System.out.println("So bat phan: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(mang[j]);
	        }
	    }
}
