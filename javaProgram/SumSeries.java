package javaProgram;
import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		//Series: 1+1/2+1/3+1/4+......
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		float result=0;
		for(float i=1;i<=num;i++) {
			result+=1/i;
		}
		System.out.println("Sum of Series is: "+result);
        
	}

}
