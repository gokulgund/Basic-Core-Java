package com.bl.corejava;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("Enter the Alphabet And Check is it Vowels or Consonant = ");
		Scanner sc = new Scanner(System.in);
		char alfa = sc.next().charAt(0);
		
		if(alfa == 'a' || alfa == 'e' || alfa == 'i' || alfa == 'o' || alfa == 'u' ||
				alfa == 'A' || alfa == 'E' || alfa == 'I' || alfa == 'O' || alfa == 'U' ) {
			System.out.println(" Alphabet = "+alfa+" is Vowel");
		}else {
			System.out.println(" Alphabet  = "+alfa+" is Consonant");
		}
	}

}
