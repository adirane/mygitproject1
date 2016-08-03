package javaTest;

import java.util.Scanner;

public class multiply2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		int count=0;
        for(int i=0;i<2;i++){
                count=count+n;
        }
        System.out.println("The Product is "+count);
	}

}
