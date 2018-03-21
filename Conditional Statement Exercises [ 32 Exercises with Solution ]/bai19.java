package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai19 {
	 public static void main(String[] args) {
	    System.out.print ("Nhap so dong: ");
	    Scanner key = new Scanner(System.in);
	    int n = key.nextInt();
	    int s=n+4-1;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int x=s;x!=0;x--)
	    	{
	    		System.out.print(" ");
	    		}
	    	for(int j=1;j<=i;j++) 
	    	{
	    		System.out.print(i+" ");
	    		}
	    	System.out.println();
	    	s--;
	    }
	 }
}
