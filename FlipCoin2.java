package com.bl.corejava;
import java.util.Scanner;
public class FlipCoin2 {
	public static void main(String[] args) {
		System.out.print("Enter how many times you flip coin=");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int head=0,tail=0;
		if(n>0)
		{
			double[] result=new double[n];
			
			for(int i=0;i<n;i++)
			{
				result[i]=Math.random();
				
				if(result[i]<0.5)
				{					
					tail++;					
				}
				else
				{
					head++;					
				}				
			}
			float percentageOfTail=(tail*100)/n;
			System.out.println(percentageOfTail);
			float percentageOfHead=(head*100)/n;
			System.out.println(percentageOfHead);

	   }
	}
}