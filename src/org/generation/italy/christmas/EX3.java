package org.generation.italy.christmas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class EX3 {
		 public static void main(String[] args) {
			 	
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Inserisci una parola");
			 String userWord = sc.next();
			 sc.close();
			 
			 String [] wordLetters = userWord.split("");
			
			 Map<String, Integer> wordMap = new TreeMap<>();
			 
			 for(String singleLetter : wordLetters) {
				 
				 int counter = 0;
				 
				 if (!wordMap.containsKey(singleLetter)) {
						counter = 1;
						wordMap.put(singleLetter, counter);
				 } else {
						counter = wordMap.get(singleLetter) + 1;
						wordMap.put(singleLetter, counter);
					}
			 }
				
			 System.out.println(wordMap);
			
	}
}
