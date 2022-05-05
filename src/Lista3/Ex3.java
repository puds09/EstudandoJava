package Lista3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scan = new  Scanner(System.in);
		int times = scanner.nextInt();
		Float menorSoma = (float) 9999.0;
		Float maiorSoma = (float) -9999.0;
		int soma = 0;

		for (int i = 0; i < times; i++) {
			String entrada = scan.nextLine();
			String[] entradas = entrada.split(" ");
			int X = Integer.parseInt(entradas[0]);
			int Y = Integer.parseInt(entradas[1]);
			if(X%2==0) X++;
			for (int j = 0; j < Y; j++) {
				soma+=X;
				X+=2;
			}
			System.out.println(soma);
			if(menorSoma > soma) menorSoma = (float) soma;
			if(maiorSoma < soma) maiorSoma = (float) soma;
			soma = 0;
		}
		System.out.println((menorSoma + maiorSoma)/2);
		scanner.close();
		scan.close();
	}
}
