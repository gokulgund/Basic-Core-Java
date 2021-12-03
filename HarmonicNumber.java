package com.bl.corejava;
import java.util.Scanner;
public class HarmonicNumber {
	public static void main(String[] args) {	
	System.out.println("Enter The Number To Find Harmonic Value : ");
	Scanner sc = new Scanner(System.in);
	double n = sc.nextDouble();
	double sum = 0;
	
	if (n != 0) {		
		for (double i=1; i <= n; i++) {
			sum = sum + (1/i);
				}
		System.out.println("Harmonic Value Is : " +sum);
			}
		else {
		System.out.println("Invalid Number");
		}
		sc.close();
	}
}
