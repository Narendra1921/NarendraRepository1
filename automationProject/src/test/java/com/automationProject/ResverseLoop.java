
package com.automationProject;

public class ResverseLoop {

	private static int remainder;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=123564456, reverse=0;
		
		for(;number!=0;number=number/10)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			
		}
	System.out.println("The reverse of the given number is:"+reverse);
	}

}
