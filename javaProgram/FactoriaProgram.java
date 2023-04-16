package javaProgram;
import java.util.Scanner;

public class FactoriaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:\n");
		int n= sc.nextInt();
		int factorial=1;
		for(int i=n; i>=1;i--) {
			factorial=factorial *i;
		}
       System.out.println("factorial of Number  "+n+"  is   "+factorial);
	}

}
