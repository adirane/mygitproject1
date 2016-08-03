package javaTest;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter till how many numbers to find fibonacci series");
		int n=s.nextInt();
		
		int []arr=new int[n];
		
		int i;
		arr[0]=0;
		arr[1]=1;
		
		for(i=2;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		System.out.println("The fibonacci series is ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
