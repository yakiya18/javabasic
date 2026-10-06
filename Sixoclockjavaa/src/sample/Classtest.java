package sample;

public class Classtest {
	public static void main(String[]args) {
		
		for (int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
		int num = 153;
		int temp = num;
		int sum = 0;

		while(num > 0 ) {
			int d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}
		if(sum == temp) {
			System.out.println("its a armstrong number");
		}else {
			System.out.println("not a amstrong num");

		
		}

}
}
