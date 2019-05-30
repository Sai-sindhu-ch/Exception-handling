package Exception;
import java.util.*;
import java.io.*;
import java.lang.*;
public class StringNotFound extends Exception{
	public static void main(String args[]) throws StringNotFound  {
		String[] str=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names in string:");
		for(int i=0;i<4;i++)
		str[i]=sc.next();
		String str1;
		System.out.println("enter a name:");
		str1=sc.next();
		for(int i=0;i<4;i++)
		if(str1.equals(str[i])) {
			System.out.println("you have enrolled to the class");
			break;
		}
		else {
			System.out.println("you have not enrolled to the class");
			throw new StringNotFound();
			
		}
		
	}
}

