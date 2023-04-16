package javaProgram;
import java.util.Scanner;

public class SumofDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=num;num>0;num/=10) {
			int reminder=num%10;
			sum+=reminder;
			System.out.println("Reverse Number is: "+ reminder);
		}
 System.out.println("sum Of digit is: "+sum);
	}

}
