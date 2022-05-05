package Lista5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = 0, u = 0;
		for (int i = 0; i < n+1; i++) {
			String[] frase = scanner.nextLine().split("");
			for(String letra:frase) {
				if(letra.equals("p") || letra.equals("P")) {
					p++;
				}
				if(letra.equals("u") || letra.equals("U")) {
					u++;
				}
			}
			
		}

		System.out.println(p + " " + u);
		scanner.close();
	}
}
