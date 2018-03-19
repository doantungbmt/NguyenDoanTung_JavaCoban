package JavaBasic;

public class bai50 {
	public static void main(String[]args) {
		System.out.println("chia het cho 3: ");
		for(int i=1; i<=100; i++) {
			if((i%3)==0) {
				System.out.println(i);
			}
		}
		System.out.println("chia het cho 5: ");
		for(int j=1; j<=100;j++) {
			if((j%5)==0) {
				System.out.println(j);
			}
		}
		System.out.println("chia het cho 5 va 3: ");
		for(int k=1; k<=100;k++) {
			if((k%5)==0 && (k%3)==0) {
				System.out.println(k);
			}
		
		}
	}
}
