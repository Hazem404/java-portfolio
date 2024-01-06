package average;
import java.util.Scanner;

public class averge {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double y;
		double q =0 ;
		int a;
		double x;
		int d = 0;
		do {
			System.out.println("enter number");
			
			y = sc.nextDouble();
			d++;
			q= q+y;
			System.out.println("do you whant to continue (1 to continue) 5(2 to get the avarge)");
			a= sc.nextInt();
			
			} while(a==1);
		
		
		x = q/d;
		System.out.println("the averege = " + x);
	}

}
