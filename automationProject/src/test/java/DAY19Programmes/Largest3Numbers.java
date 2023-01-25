package DAY19Programmes;

import java.util.Scanner;

public class Largest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("int");
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();

		System.out.println("Enter Second Number:");
		int b=sc.nextInt();

		System.out.println("Enter Third Number:");
		int c=sc.nextInt();

		//Approach 1
		if(a>b && a>c)
		{
			System.out.println(a+ "is Largest Number;");
		}

		else if(b>a && b>c)
		{
			System.out.println(b+ "is Largest Number");
		}

		else 
		{
			System.out.println(c+ "is Largest Number");
			}
		
		}
	}