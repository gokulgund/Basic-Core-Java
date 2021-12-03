package com.bl.corejava;
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
       sc.close(); 
	}
}
