package Lista3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inteiro = scanner.nextInt();
		
		for(int i = 1; i < inteiro+1; i++) {
			if(inteiro % i == 0) System.out.println(i);
		}
	}
}
