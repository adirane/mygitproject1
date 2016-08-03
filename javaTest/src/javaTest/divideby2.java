package javaTest;

import java.util.Scanner;

public class divideby2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		int count=0;
		while(n>=2)
		{
		n=n-2;
		count++;
		}
		System.out.println(count);

}
}
