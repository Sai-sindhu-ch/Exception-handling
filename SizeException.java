package Exception;
import java.util.*;
import java.io.*;
public class SizeException extends Exception{
	public static void main(String args[]) throws SizeException  {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		str=sc.next();
		int n=str.length();
		try {
			
		if(n>15) {
			throw new SizeException();
		}
		else {
			System.out.println("your name is shorter");
		}
		}
		catch(SizeException e) {
			System.out.println("please enter shorter name");
		}
	}
}