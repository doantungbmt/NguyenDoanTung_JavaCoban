package JavaBasic;

public class bai84 {
	 public static void main(String[] args)
	 {
	   String cau1 = "Python";
	    int sotu = 3;
	    if (sotu > cau1.length()) {
	    	sotu = cau1.length();
	    }

	    String phannho = cau1.substring(cau1.length()-3);
	    System.out.println(phannho + cau1 + phannho);
	  }
}
