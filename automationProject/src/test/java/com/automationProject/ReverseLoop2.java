package com.automationProject;

public class ReverseLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse=0;
		
		int number=123456;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			System.out.println("reverse of the given is"+reverse);
			
			
		}
				
			
			
		
	}

}
