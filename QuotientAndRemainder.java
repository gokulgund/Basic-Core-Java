package com.bl.corejava;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Divident : ");
		int divident = sc.nextInt();
		System.out.println("Enter The Divisor : ");
		int divisor = sc.nextInt();
		sc.close();
		
		int quotient = divident / divisor ;
		int reminder = divident % divisor;
		
		System.out.println("The Quotient is : " +quotient);
		System.out.println("The Reminder is : "+reminder);		
	}
}
