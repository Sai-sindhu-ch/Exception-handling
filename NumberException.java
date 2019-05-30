package Exception;
import java.util.Scanner;
public class NumberException extends Exception{
	public static void main(String args[]) throws NumberException{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		age=sc.nextInt();
		try {
		if(age<18) {
			throw new NumberException();
		}
		else {
			System.out.println("your entry is valid");
		}
		}
		catch(NumberException e) {
			System.out.println("Access denied - You must be at least 18 years old.");
		}
				
	}
}
