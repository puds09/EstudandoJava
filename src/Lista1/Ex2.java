package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		
		Locale localeAmericano = new Locale("en", "US");
		Scanner scanner = new Scanner(System.in);
		
		Float entrada = scanner.useLocale(localeAmericano).nextFloat();

		System.out.printf("%.2f", (entrada * 0.3048));

		scanner.close();
	}
}
