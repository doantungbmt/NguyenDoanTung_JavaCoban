package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai25 {
	public static void main(String args[]) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap so:  ");
        int n = key.nextInt();
        int b = 1;
        int a = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) 
        {

            for (int spc = n - a; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;         
                a++;    
            } else 
            {
                start = n * 2 - i; 
                a--;
            }
            for (int j = 0; j < b; j++) 
            {
                System.out.print(start);
                if (j < b / 2) 
                {
                    start--;
                } else 
                {
                    start++;
                }
            }
            if (i < n)
            {
                b = b + 2;
            } else {
                b = b - 2;
            }

            System.out.println();
        }
    }
}
