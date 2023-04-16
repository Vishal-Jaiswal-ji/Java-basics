package javaProgram2;
import java.util.Scanner;

public class SumReduceTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		do {
			int sum=0;
			while(num!=0) {
				int digit=num%10;
				sum+=digit;
				num/=10;
			}
			System.out.print(sum+" "); 
			num=sum;
		}while(num/10!=0);

	}

}
