package DAY19Programmes;

import java.util.Scanner;

public class Swapping1 {
	
	public static void main(String[]args) {
		
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int Number1 = sc.nextInt();
	System.out.println("Enter Second Number");
	int Number2 = sc.nextInt();
	
	System.out.println("Initial values of Number1:"+Number1+" and Number2: "+Number2);
	
	Number1=Number1+Number2;
	Number2=Number1-Number2;
	Number1=Number1-Number2;
	
	System.out.println("After Swapping Values of Number1:" +Number1+" and Number2:  "+Number2);*/
	
	
		
		int a=31546434,b=489841657,c=14416426;
		System.out.println("Before swapping values are = "+a+"   "+b+"   "+c);
		
		//logic 1 - Third Variable
		int t=a;
		    a=b;
		    b=c;
		    c=t;

		System.out.println("After swapping values are = "+a+" "+b+"    "+c);
		}}
		
		/*Logic 2 - using + & - with out using third variable
		a=a+b;
		b=a-b;
		a=a-b;*/

		/*Logic 3- with out third variable
		here a & b values should not be zero
		a=a*b;
		b=a/b;
		a=a/b;*/
	

