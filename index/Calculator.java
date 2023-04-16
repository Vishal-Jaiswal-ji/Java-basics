package index;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the First Number\n");
         int x=sc.nextInt();
         System.out.println("Enter the Second Number\n");
         int y=sc.nextInt();
         System.out.println("Enter the operator\n");
         sc.nextLine();
         char op=sc.nextLine().charAt(0);
         int result=0;
         switch(op) {
         case '+':
        	 result=x+y;
        	 break;
         case '-':
        	 result=x-y;
        	 break;
         case '*':
        	 result=x*y;
        	 break;
         case '/':
        	 result=x/y;
        	 break;
         default:
        	 System.out.println("Wrong Operator");
         }
         System.out.println("The result is :"+result);
	}

}
