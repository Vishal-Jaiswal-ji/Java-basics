package javaProgram;
import java.util.Scanner;

public class RaisedToPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		int result1=1;
		int result2=0;
		for(int i=1;i<=b;i++) {
			result1*=a;
			result2+=a;
		}
		System.out.println("Answer is:"+a+" raised to power "+b+"is:" +result1);
		System.out.println("\nAnswer is:"+a+"*"+b+"=" +result2);
	}
	
	
}
