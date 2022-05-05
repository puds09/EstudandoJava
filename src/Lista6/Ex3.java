package Lista6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		int n = scanner.nextInt();
		int premiada = scanner.nextInt();
		String pulaLinha = scanner.nextLine();

		for(int i = 0 ; i< n; i++) {
			if(i == premiada) lista.add("premiada");
			else {
				lista.add(null);
			}
		}
		
		for(int i = 0 ; i< n; i++) {
			Object[] entrada = scanner.nextLine().split(" ");
			String nome = (String) entrada[0];
			String temp = (String) entrada[1];			
			int fatia = Integer.parseInt(temp);
			
			if(lista.get(fatia) == "premiada") {
				System.out.println(nome);
				lista.set(premiada, null);
				break;
			} else if(fatia < premiada){
				lista.set(premiada-1, "premiada");
				lista.set(premiada, null);
				
			}
//			System.out.println(nome + " " + lista);
		}
	}
}
