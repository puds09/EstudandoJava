package Lista4;

import java.util.Scanner;

public class Ex2 {

	public static void quadrados(int n) {
		if(n%2 != 0) n--;
		
		for (int i = 0; i < n; i++) {	
			System.out.printf("%d^2 = %.2f %n", n, Math.pow(n, 2));
			n-=2;
		}

	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if(n == 0) break;
			quadrados(n);
		}
		
		scanner.close();
	}

}
