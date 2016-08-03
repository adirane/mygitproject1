package javaTest;

import java.util.Scanner;

public class armstrong16 {

	public static void main(String[] args) {
     System.out.println("Enter the number");
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     
     int result=0,temp,a;
     temp=n;
     while(n>0)
     {
    	 a=n%10;
    	 result=result+(a*a*a);
    	 n=n/10;		 
     }
     
     if(temp==result)
     {
    	 System.out.println("The number is armstrong");
     }
     else
     {
    	 System.out.println("The number is not armstrong");

     }
	}

}
