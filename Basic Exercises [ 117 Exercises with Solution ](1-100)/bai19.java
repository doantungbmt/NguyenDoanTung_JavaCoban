package JavaBasic;

import java.util.Scanner;

public class bai19 {
	public static void main(String args[])
    {
        int sothapphan, b, i=1, j;
        int sonhiphan[] = new int[100];
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so thap phan : ");
        sothapphan = key.nextInt();
		
        b = sothapphan;
		
        while(b != 0)
        {
        	sonhiphan[i++] = b%2;
            b = b/2;
        }
		
        System.out.print("So nhi phan la: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(sonhiphan[j]);
        }
        System.out.print("\n");
    }
}
