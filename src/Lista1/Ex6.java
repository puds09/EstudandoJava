package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Locale localeAmericano = new Locale("en", "US");
		
		Float tempo = scanner.useLocale(localeAmericano).nextFloat();
		Float velocidade = scanner.useLocale(localeAmericano).nextFloat();

		Float distancia = tempo * velocidade;
		Float litros = (float) (distancia/14.2);
		
		System.out.printf("%.1f %.2f", distancia, litros);
		
		scanner.close();
	}
}
