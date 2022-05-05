package Lista5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String frase = scanner.nextLine();
		String[] i = frase.split(" ");
		for(String palavra:i) {
			String[] letras = palavra.split("");
			System.out.print(letras[2]);
			
		}
		scanner.close();
	}
}
