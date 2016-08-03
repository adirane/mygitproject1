package javaTest;

import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt(); 

		int []input=new int[10];
		int k;
		System.out.println("Enter numbers");
		for(k=0;k<n;k++)
		{
			input[k]=sc.nextInt();
		}
		int j = 0;
		int i = 1;

		while(i < input.length){
			if(input[i] == input[j]){
				i++;
			}else{
				input[++j] = input[i++];
			}   
		}
		int[] output = new int[j+1];
		for(k=0; k<output.length; k++){
			output[k] = input[k];
		}
		
		for(k=0;k<output.length;k++)
		{
			System.out.println(output[k]);
		}
	}

}
