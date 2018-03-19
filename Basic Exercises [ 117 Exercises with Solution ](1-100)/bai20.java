package JavaBasic;

import java.util.Scanner;

public class bai20 {
	public static void main(String args[])
    {
        int sothapphan, a;
        String sonhiphan="";
        
        /* hexadecimal number digits */
        
        char mang[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so thap phan: ");
        sothapphan = key.nextInt();
		
        while(sothapphan>0)
        {
            a =sothapphan%16;
            sonhiphan = mang[a] + sonhiphan;
            sothapphan = sothapphan/16;
        }
        System.out.print("So nhi phan la : "+sonhiphan+"\n");         
    }

}
