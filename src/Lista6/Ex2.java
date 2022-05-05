package Lista6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		int n = scanner.nextInt();
		String input = scanner.nextLine();
	
		for(int i = 0; i < n; i++) {
			lista.add(scanner.nextLine());
		}
		System.out.println(lista);
		System.out.println(lista.contains("André")? "Cuidado!" : "Seguro");
	}

	
	
}
