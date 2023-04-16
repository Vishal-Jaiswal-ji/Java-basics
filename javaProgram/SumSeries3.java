package javaProgram;
import java.util.Scanner;

public class SumSeries3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Series3:1+2+4+7+11+.....
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the no. of terms: ");
		 int n=sc.nextInt();
		 int sum=0;
		 int term=1;
		 for(int i=1;i<=n;i++){
			 sum=sum+term;
			 term+=i;
		 }
		 System.out.println("Sum of Series3 is:"+sum);
	}
}
