package JavaBasic;

import java.util.Scanner;

//thap luc sang nhi phan
public class bai29 {
	public static int thaplucsangnhiphan(String s)
    {
             String so = "0123456789ABCDEF";
             s = s.toUpperCase();
             int gtri = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = so.indexOf(c);
                 gtri = 16*gtri + d;
             }
             return gtri;
    }
    public static void main(String args[])
    {
        String sothapluc;
        int sothapphan, i=1, j;
        int sonhiphan[] = new int[100];
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so thap luc phan : ");
        sothapluc = key.nextLine();              
        sothapphan = thaplucsangnhiphan(sothapluc);
               
        while(sothapphan != 0)
        {
        	sonhiphan[i++] = sothapphan%2;
            sothapphan = sothapphan/2;
        }
		
        System.out.print("So nhi phan la: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(sonhiphan[j]);
        }
        System.out.print("\n");
    }


}
