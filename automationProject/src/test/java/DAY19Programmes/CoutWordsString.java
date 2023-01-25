package DAY19Programmes;

import java.util.Scanner;

public class CoutWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your String");
						
			String s=sc.nextLine();
			
			int count=1;

			for(int i=0;i<s.length()-1;i++)
			{
				if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				{
					count++;
				}
			}
			System.out.println(count);
			
		}
	}


