package com.bl.corejava;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		 int a,b,c;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the First value");
		a=sc.nextInt();
		 System.out.println("Enter the Second value");
		 b=sc.nextInt();
		 System.out.println("Enter the Third value");
		 c=sc.nextInt();
		 sc.close();
		 if (a>b && a>c) {
			System.out.println(a+" is largest number");
		 }
		 else if (b>c) {
			 System.out.println(b+" is largest number");
	
		 }else {
			 System.out.println(c+" is largest number");
		 }
	}
}
