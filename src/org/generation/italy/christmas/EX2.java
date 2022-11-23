package org.generation.italy.christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EX2 {
 public static void main(String[] args) {
	 	
	 Scanner sc = new Scanner(System.in);
		
	 System.out.println("Inserisci una parola");
		
	 String userWord= sc.next();
	 
	 sc.close();
	 
	 String [] word = userWord.split("");
	
	 Set<String> userStringLetters = new TreeSet<>();
	 
	 for (int i = 0; i < word.length; i++) {
		String singleLetter = word[i];
		userStringLetters.add(singleLetter);
		}
	 System.out.println(userStringLetters);
 	}
}
