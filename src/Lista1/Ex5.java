package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Locale localeAmericano = new Locale("en", "US");
		
		Float entrada = scanner.useLocale(localeAmericano).nextFloat();
		System.out.printf("%.2f", entrada*0.94);
		scanner.close();
	}
}
