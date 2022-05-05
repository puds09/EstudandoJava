package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		Locale localeAmericano = new Locale("en", "US");
		Float distancia = scanner.useLocale(localeAmericano).nextFloat();

		int minutos = (int) (distancia * 60/15);
		System.out.printf("%d minutos", minutos);

		scanner.close();
		
	}
}
