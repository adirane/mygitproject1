package javaTest;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		System.out.println("Enter no of elements to be sorted");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
	    int []arr= new int[50];
		System.out.println("Enter numbers");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}

		int j=0;
		int key=0;

		for(i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while((j>=0) && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j=j-1;

			}
			arr[j+1]=key;	 
		}

		System.out.println("The sorted array is");
		for(i=0;i<n;i++)
		{
			System.out.println(+arr[i]);     
		}


	}

}
