package javaProgram2;
import java.util.Scanner;

public class ArmstrongNumber {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers: ");
		int num=sc.nextInt();
		int sum =0;
		int n=num;
		while(n>0) {
			   int d=n%10;
			   n/=10;
			   int cube=d*d*d;
			   sum+=cube;
		   }
		   if(num!=sum) {
			   System.out.println(sum+"No");
		   }
		   else {
			   System.out.println(num+"is ArmStrong Number: ");
			
		   }
		}
         
	}


