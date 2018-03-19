package JavaBasic;

import java.util.Arrays;

public class bai114 {
	public static void main(String[] arg) 
	   {
		 String str = "abcdef"; 
	     char[] A = str.toCharArray();
		 int a=3;
	     int len = A.length;
	     a %= len;
	     daonguoc(A, 0, len - a - 1);
	     daonguoc(A, len - a, len - 1);
	     daonguoc(A, 0, len - 1);
	     System.out.println("\n"+Arrays.toString(A));
	    }

	    private static void daonguoc(char[] str, int start, int end) {
	        while (start < end) {
	            char temp = str[start];
	            str[start] = str[end];
	            str[end] = temp;
	            start++;
	            end--;
	        }
	    }
}
