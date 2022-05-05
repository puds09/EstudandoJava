package Lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inteiro = scanner.nextInt();

		if(inteiro % 2 == 0) {
			System.out.printf("%d é um par %n", inteiro);
			
		} else {
			System.out.printf("%d é um ímpar %n", inteiro);
		}
		System.out.println(inteiro+2);
		scanner.close();
	}

}
