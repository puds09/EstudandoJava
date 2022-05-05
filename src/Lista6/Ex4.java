package Lista6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {   
    public static void main(String[] args){

    	Scanner scanner = new Scanner(System.in);

    	/* Lista Final */
        ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>() {{

            /* Cria uma List de frutas */
            add( new ArrayList<String>() {{
                add(scanner.next());
                add(scanner.next());
                add(scanner.next());
            }} );

            /* Cria uma List de armas */
            add( new ArrayList<String>() {{
                add(scanner.next());
                add(scanner.next());
                add(scanner.next());
            }} );

            /* Cria uma List de bandas */
            add( new ArrayList<String>() {{
                add(scanner.next());
                add(scanner.next());
                add(scanner.next());
            }} );
        }};

        /* Percorre a primeira lista */
        for (int z = 0; z < 3; z++) {
        	for (int i = 0; i < lista.size(); i++) {
        		
        		/**
        		 * Percorre as sublistas utilizando expressão Lambda (Java 8)
        		 * Caso não utilize Java 8, substitua por um `for`
        		 */
        		if(i != lista.size()-1) {
        			for (int j = 0; j < lista.get(i).size(); j++) {
        				if(lista.get(i).get(j).equals("o") && lista.get(i+1).get(j).equals(".")) {
        					lista.get(i).set(j, ".");
        					lista.get(i+1).set(j, "o");
        					
        				}
        			}
        			
        		}
        	}
        	
        }
        lista.forEach( x -> {
        	System.out.println(x);
        });     
        
        
        
    }
}