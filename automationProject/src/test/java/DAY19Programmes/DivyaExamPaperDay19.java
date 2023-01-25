package DAY19Programmes;

import java.util.Scanner;

public class DivyaExamPaperDay19 {

	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		System.out.println("Enter b number");
		int b=sc.nextInt();
		
		System.out.println("Enter c number");
		int c=sc.nextInt();
		
		if (a>b && a>c) {
			
			System.out.println("Enter a is largest number"  +a);
		}
		else if(b>a && b>c) {
			
				System.out.println("Enter b is largest number"  +b);}
		else {
			System.out.println("Enter c is largest number"  +b);
		}
	}
}
