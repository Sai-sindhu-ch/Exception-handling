package Exception;
import java.util.*;
import java.io.*;
public class SmallNumberException extends Exception {
	public static void main(String args[]) throws SmallNumberException {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		a=sc.nextInt();
		System.out.println("enter second number:");
		b=sc.nextInt();
		System.out.println("enter third number:");
		c=sc.nextInt();
		try {
		int count=a+b+c;
		if(count>100) {
			
			throw new SmallNumberException();
		}
		else {
			System.out.println("perfect numbers");
		}
		}
		catch(SmallNumberException e) {
			System.out.println("Please enter the numbers, which total is below 100");
		}
	}

}

