package Lista6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		int n = scanner.nextInt();
		String input = scanner.nextLine();
	
		for(int i = 0; i < n; i++) {
			lista.add(scanner.nextLine());			
		}
//		ordenando Lista
		//		Collections.sort(lista);

//		reversing Lista;
		Collections.reverse(lista);
		
		System.out.println(lista);
	}

}
