package Lista3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scan = new  Scanner(System.in);
		int times = scanner.nextInt();

		for (int i = 0; i < times; i++) {
			String entrada = scan.nextLine();
			String[] entradas = entrada.split(" ");
			int A = Integer.parseInt(entradas[0]);
			int N = Integer.parseInt(entradas[1]);
			int soma = 0;
			
			for (int j = 0; j < N; j++) {
				System.out.print(A + " ");
				soma += A;
				A++;
			}
			
			System.out.println("\n" + soma);
		}
		
		scanner.close();
	}

}
