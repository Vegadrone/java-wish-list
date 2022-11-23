package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Creare una classe Main con metodo main, in cui implementare il seguente programma: creare una nuova ArrayList dove 
//salvare la lista dei desideri continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi 
//Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare. Ad ogni iterazione aggiungere il desiderio alla lista. 
//Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.

public class Main {
	
	public static class StringComparator implements Comparator<String>{
		
		@Override
		public int compare(String o1, String o2) {
			int vowelCountO1 = 0;
			int vowelCountO2 = 0;
			
			for (int i = 0; i < o1.length(); i++) {
				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' ||
                        o1.charAt(i) == 'o' || o1.charAt(i) == 'u') {
					vowelCountO1 ++;
				}
			}
			
			for (int i = 0; i < o2.length(); i++) {
				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' ||
                        o2.charAt(i) == 'o' || o2.charAt(i) == 'u') {
					vowelCountO2 ++;
				}
			}
			return vowelCountO2 - vowelCountO1;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		List <String> wishList = new ArrayList<>();
		
		Scanner sc = new Scanner (System.in);		
		
		Boolean compile = false;
		
		while (!compile) {
			System.out.println("Inserisci un nuovo desiderio nella lista: ");
			String newWish = sc.next();
			wishList.add(newWish);
			int wishLen = wishList.size();
			System.out.println("Ora hai: " + wishLen + " desideri!" );
			
			System.out.println("Vuoi fermarti qui? Digita: 's' o 'n' ");
			String userChoice = sc.next();
			
			if (userChoice.toLowerCase().equals("s")) {
				compile =true;
				//wishList.sort(null);
				wishList.sort(new StringComparator());
			}
		}
		
		System.out.println("La tua lista contiene: ");
		
		int counter = 0;
	
		for(String wish : wishList ) {
			System.out.println((counter += 1) + "." + " " + wish.substring(0,1).toUpperCase() + wish.substring(1).toLowerCase());
		}
		
	}
}
