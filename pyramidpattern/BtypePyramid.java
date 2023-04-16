package pyramidpattern;
import java.util.Scanner;

public class BtypePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter thr no of rows to be print pattern; ");
		int n=sc.nextInt();
		//(a)
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//(b)
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println();
		//(c)
				for(int i=1; i<=n;i++) {
					for(int j=1;j<=n+1-i;j++) {
						System.out.print(j+ " ");
					}
					System.out.println();
				}
				System.out.println();
		//(d)
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print((n+1-i)+ " ");
			}
			System.out.println();
		}
		System.out.println();
		//(e)
				for(int i=1; i<=n;i++) {
					for(int j=1;j<=n+1-i;j++) {
						System.out.print((n+1-j)+ " ");
					}
					System.out.println();
				}
				System.out.println();

	}

}
