package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale localeAmericano = new Locale("en", "US");
		Float valor = scanner.useLocale(localeAmericano).nextFloat();
		int parcelas = scanner.useLocale(localeAmericano).nextInt();

		Float total;
		switch(parcelas) {
		case 1:
			total = (float) (valor*0.95);
			System.out.printf("%.2f %.2f", total, total);
			break;
		case 2:
			total = (float)  valor;
			System.out.printf("%.2f %.2f", total, total/2);
			break;
		case 3:
			total = (float) (valor*1.05);
			System.out.printf("%.2f %.2f", total, total/3);
			break;
		case 4:
			total = (float) (valor*1.1);
			System.out.printf("%.2f %.2f", total, total/4);
			break;
		}
		
		scanner.close();
	}

}
