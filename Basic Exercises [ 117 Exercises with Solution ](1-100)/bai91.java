package JavaBasic;

public class bai91 {
	 public static void main(String[] args)
	 {    
	    long startTime = System.nanoTime(); 
		int i;
		System.out.println ("10 so tu nhien dau tien la:\n");
		for (i=1;i<=10;i++)
		{      
			System.out.println (i);
		}
			long estimatedTime = System.nanoTime() - startTime;
		System.out.println("thoi gian co  duoc: "+estimatedTime);
	  }
}
