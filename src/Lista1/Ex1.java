package Lista1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		Float n1 = scanner.nextFloat();
		Float n2 = scanner.nextFloat();

		Float media = (n1 + n2)/2;
		System.out.println(media);
		
		scanner.close();
		
	}
}
