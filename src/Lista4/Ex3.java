package Lista4;

import java.util.Scanner;

public class Ex3 {

	public static int funcao(int n) {
		if(n%2 != 0) n -= 1;
		if(n<0) {
			return -1;
		} else if (n == 0){
			return 0;
		} else {
			return n-2 + funcao(n-2);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(funcao(n));
		
	}
}
