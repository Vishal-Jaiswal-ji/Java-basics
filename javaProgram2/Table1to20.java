package javaProgram2;
import java.util.Scanner;

public class Table1to20 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no. of Rows: ");
	int rows=sc.nextInt();
	System.out.println("Enter the no. of Coloumns: ");
	int cols=sc.nextInt();
	for(int i=1; i<=cols;i++) {
		  int tableOf=i;
		for(int j=1;j<=rows;j++) {
			System.out.print(tableOf*j+" ");
				
		}
		System.out.println();
	}
}
}
