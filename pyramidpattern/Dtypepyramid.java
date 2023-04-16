package pyramidpattern;

import java.util.Scanner;

public class Dtypepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of rows to be print pattern; ");
		int n=sc.nextInt();
		//(a)
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n-i;j++) 
				System.out.print(" ");
			int p=i;
			for(int j=1;j<=i;j++) 
				System.out.print(p+++"");
			p=p-2;
			for(int j=1;j<=i-1;j++) 
				System.out.print(p-- +"");
			
			System.out.println();	
		}
		System.out.println();	
		//(b)
				for(int i=1; i<=n;i++) {
					for(int j=1;j<=n-i;j++) 
						System.out.print(" ");
					int p=n;
					for(int j=1;j<=i;j++) 
						System.out.print(p-- +"");
					p=p+2;
					for(int j=1;j<=i-1;j++) 
						System.out.print(p++ +"");
					
					System.out.println();	
				}
				System.out.println();	
		//(c)
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(" ");
			int p=n+1-i;
			for(int j=1;j<=n+1-i;j++) 
				System.out.print(p++ +"");
			p=p-2;
			for(int j=1;j<=n-i;j++) 
				System.out.print(p-- +"");
			
			System.out.println();	
		}
		System.out.println();	
		//(d)
				for(int i=1; i<=n;i++) {
					for(int j=1;j<=i;j++) 
						System.out.print(" ");
					int p=n;
					for(int j=1;j<=n+1-i;j++) 
						System.out.print(p-- +"");
					p=p+2;
					for(int j=1;j<=n-i;j++) 
						System.out.print(p++ +"");
					
					System.out.println();	
				}
				System.out.println();	

	}

}
