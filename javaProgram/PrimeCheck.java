package javaProgram;
import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(n<2) isPrime=false;
		System.out.println(n+ " is Prime Number =  "+ isPrime);

	}

}
