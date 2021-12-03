package com.bl.corejava;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the Year An Check its Leap Year or Not : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (year>=1000 && year<=9999) {
			//System.out.println("valid year");
			
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println("Year : "+year+" is the Leap Year");
			}
			else {
				System.out.println("Year : "+year+" is not Leap Year");
			}
			
		}else {
			System.out.println("Invalid Year");
		}		
		sc.close();	
	}

}
