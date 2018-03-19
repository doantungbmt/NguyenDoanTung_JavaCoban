package JavaBasic;

import java.util.Scanner;

public class bai24 {
	public static void main(String[] args) 
    {
        int nhiphan, nhiphan1,a, thapphan=0, b, i=1, j;
        int mang[] = new int[100];
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so nhi phan : ");
        nhiphan = key.nextInt();
        nhiphan1=nhiphan;
     
      while(nhiphan > 0)
        {
            a = nhiphan % 10;
            thapphan = thapphan + a*i;
            //System.out.println(rem);
            i = i*2;
            nhiphan = nhiphan/10;
        }   

		i=1;
        b =thapphan;
		
        while(b > 0)
        {
            mang[i++] = b % 8;
            b = b / 8;
        }
		
        System.out.println("so bat phan " +nhiphan1+ " la :");
        for(j=i-1; j>0; j--)
        {
            System.out.println(mang[j]);
        }
 System.out.println("\n");
 
    }

}
