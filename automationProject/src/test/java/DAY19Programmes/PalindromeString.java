package DAY19Programmes;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String x = "RACECAR";
	char y[] = x.toCharArray();
	int size = y.length;
	char a[] = new char [size];
	
	int i=0;
	while (i!=size)
	
	{
		a[size-1-i] = y[i];
		++i;
	}
	
	i=0;
	while (i!=size)
	{
		if (a[i]!=y[i])
		{
			System.out.println("Not a palindrome");
			System.exit(0);
		}
		else
		{ ++i;
		continue;
		}
	
	}
		 System.out.println("Palindrome");
	
			
		}
	}