package com.bl.corejava;
import java.util.Scanner;
public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping A is = "+a+" and B is = "+b);
		int c = 0;
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping A is = "+a+" and B is = "+b);	
	}
}
