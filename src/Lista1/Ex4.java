package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Locale localeAmericano = new Locale("en", "US");
		Float valor1 = scanner.useLocale(localeAmericano).nextFloat();
		Float valor2 = scanner.useLocale(localeAmericano).nextFloat();
		Float valor3 = scanner.useLocale(localeAmericano).nextFloat();
		Float valor4 = scanner.useLocale(localeAmericano).nextFloat();
		Float valor5 = scanner.useLocale(localeAmericano).nextFloat();

		Float mediaPonderada = (valor1 + 2*valor2 + 3*valor3 + 4*valor4 + 5*valor5)/15;
		System.out.printf("%.4f", mediaPonderada);
			
		scanner.close();
	}

}
