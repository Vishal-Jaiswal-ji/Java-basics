package javaProgram;
import java.util.Scanner;

public class SumSeries2 {

	public static void main(String[] args) {
		//Series: 1-1/2+1/3-1/4+......1/n
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		float result=0;
		for(float i=1;i<=num;i++) {
			if(i%2==0) {
			result+=1/i;
			}
			else{
				result-=1/i;
			}
		}
		System.out.println("Sum of Series2 is: "+result);
        
	}

}
