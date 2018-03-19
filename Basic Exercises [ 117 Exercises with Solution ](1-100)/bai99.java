package JavaBasic;

public class bai99 {
	public static void main(String[] args)
	 {
		int[] mang = {10, 20, 10, 20, 40, 20, 50};
		int ketqua = 0;	
		int x = 20;
		for(int i = 0; i < mang.length - 1; i++) {
	        if(mang[i] != x && mang[i + 1] != x)
			{
	        	ketqua = 1;	
			}        
	    }                                   
	    if (ketqua==0)
	 	  {
	     	 System.out.println( String.valueOf(true));	         
		  }
	 else
		   	  {
	     	 System.out.println( String.valueOf(false));	         
		  }		
	    }
}
