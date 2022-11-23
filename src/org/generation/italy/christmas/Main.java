package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Creare una classe Main con metodo main, in cui implementare il seguente programma: creare una nuova ArrayList dove 
//salvare la lista dei desideri continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi 
//Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare. Ad ogni iterazione aggiungere il desiderio alla lista. 
//Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.

public class Main {
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
			
			if (userChoice.equals("s")) {
				compile =true;
				wishList.sort(null);
			}
		}
		
		System.out.println("La tua lista contiene: ");
		
		int counter = 0;
	
		for(String wish : wishList ) {
			System.out.println((counter += 1) + "." + " " + wish.substring(0,1).toUpperCase() + wish.substring(1).toLowerCase());
		}
		
	}
}
