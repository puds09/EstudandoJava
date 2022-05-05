package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale localeAmericano = new Locale("en", "US");
		
		String ponto1 = scanner.useLocale(localeAmericano).nextLine();
		String ponto2 = scanner.useLocale(localeAmericano).nextLine();

		
		String[] p1 = ponto1.split(" ");
		Float x1 = Float.parseFloat(p1[0]);
		Float y1 = Float.parseFloat(p1[1]);

		String[] p2 = ponto2.split(" ");
		Float x2 = Float.parseFloat(p2[0]);
		Float y2 = Float.parseFloat(p2[1]);
		
		Double distancia = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
		System.out.printf("%.4f", distancia);
		scanner.close();
	}

}
