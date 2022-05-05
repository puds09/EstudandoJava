package Lista5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		String[] paulo = scanner.next().split("");
//		String[] pedro = scanner.next().split("");
		String[] palavras = scanner.nextLine().split(" ");
		String[] paulo = palavras[0].split("");
		String[] pedro = palavras[1].split("");
		
		

		byte pa;
		byte pe;
		while(true) {
			if(paulo.length >= pedro.length) {
				for (int i = 0; i < paulo.length; i++) {
					
					pa = paulo[i].toLowerCase().getBytes(StandardCharsets.US_ASCII)[0];
					pe = pedro[i].toLowerCase().getBytes(StandardCharsets.US_ASCII)[0];
					
					if(pa > pe) {
						System.out.println("A");
						break;
					} else if (pa == pe) {
						continue;
					} else {
						System.out.println("B");
						break;
					}
				}
			} else {
				for(int i = 0; i < pedro.length; i++) {
					
					pa = paulo[i].getBytes(StandardCharsets.US_ASCII)[0];
					pe = pedro[i].getBytes(StandardCharsets.US_ASCII)[0];
					if(pa > pe) {
						System.out.println("A");
						break;
					} else if (pa == pe) {
						continue;
					} else {
						System.out.println("B");
						break;
					}
				}
			}
			break;
		}
	}
}
	
