package javaTest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class datediff {

	public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner s=new Scanner(System.in);
		System.out.println("Enter first date in format dd/mm/yyyy");
		String first=s.next();
		
		System.out.println("Enter second date in format dd/mm/yyyy");
		String second=s.next();
		
		java.util.Date one=sdf.parse(first);
		java.util.Date two=sdf.parse(second);
		
		long difference =  (one.getTime()-two.getTime())/86400000;
        int result=(int) Math.abs(difference);
		
		System.out.println("The number of days are " +result);
	}

}
