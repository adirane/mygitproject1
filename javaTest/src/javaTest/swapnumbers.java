package javaTest;

import java.util.Scanner;
class Test

{

	int a, b;

	Test(int i, int j)

	{

		a=i;

		b=j;

	}

	void swap(Test ob)

	{

		int c;

		c=ob.a;

		ob.a=ob.b;

		ob.b=c;

	}

}
public class swapnumbers {

	public static void main(String[] args) {


		Test ob = new Test(2,3);

		System.out.println("Before Swapping");

		System.out.println("a = "+ob.a+" b = "+ob.b);

		ob.swap(ob);

		System.out.println("After Swapping");

		System.out.println("a = "+ob.a+" b = "+ob.b);

	}
}
