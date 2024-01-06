package piramid;
import java.util.Scanner;

public class piramid {
     public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        for(int i=1 ; i <=10 ; i++) {
   
        	for(int x=0 ; x<= rows ; x+=3) {
        		System.out.println(i +" "+ x);
        	}
        }
    	 
     }
}
