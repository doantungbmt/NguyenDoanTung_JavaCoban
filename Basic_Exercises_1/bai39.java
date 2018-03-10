package JavaBasic;

public class bai39 {
	public static void main(String[] args) {
		int soluong = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						soluong++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("tat ca cac so tu 3 so la: " + soluong);
	}
}
