package Lista4;

import java.util.Scanner;

public class Ex1 {

	public static void compare(int x, int y) {
		if(x == y) {
			System.out.println("x é igual a y");
		} else if (x > y) {
			System.out.println("x é maior que y");
		} else {
			System.out.println("x é menor que y");
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		compare(x,y);
		scanner.close();
	}

}
