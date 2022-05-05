package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Locale localeAmericano = new Locale("en", "US");
		
		Float deposito = scanner.useLocale(localeAmericano).nextFloat();
		Float juros = scanner.useLocale(localeAmericano).nextFloat();

		Float rendimento = (Float) deposito * juros/100;
		Float total = rendimento + deposito;

		System.out.printf("%.2f %n", rendimento);
		System.out.printf("%.2f", total);

		scanner.close();
		
	}

}
