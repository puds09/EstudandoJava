package Lista2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cargo = scanner.nextLine();
		int tempo = scanner.nextInt();
		int salario = scanner.nextInt();
		Float aumento = null;

		switch (cargo) {
		case "Gerente":
			if(tempo <= 3) {
				aumento = (float) (salario * 0.12);
			} else if (tempo > 3 && tempo <= 6) {
				aumento = (float) (salario * 0.13);
			} else if (tempo > 6) {
				aumento = (float) (salario * 0.15);
			}
			break;
		case "Engenheiro":
			if(tempo <= 3) {
				aumento = (float) (salario * 0.07);
			} else if (tempo > 3 && tempo <= 6) {
				aumento = (float) (salario * 0.11);
			} else if (tempo > 6) {
				aumento = (float) (salario * 0.14);
			}
			break;
			default:
			aumento = (float) (salario * 0.05);
			break;
		}
		System.out.println(aumento);
		System.out.println(aumento + salario);
		scanner.close();
	}

}
