package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX3 {
		 public static void main(String[] args) {
			 	
			 Scanner sc = new Scanner(System.in);
				
			 Set <String> userStringLetters = new HashSet<>();
				
			 System.out.println("Inserisci una parola");
				
			 String userWord= sc.next();
			 
			 sc.close();
			 
			 String [] word = userWord.split("");
				
			 for (int i = 0; i < word.length; i++) {
				String singleLetter = word[i];
				userStringLetters.add(singleLetter);
				}
			 System.out.println(userStringLetters);
		 	}
	}
}
