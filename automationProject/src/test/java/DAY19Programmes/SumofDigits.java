package DAY19Programmes;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num=123456;

			int sum=0;

			while(num>=0)
			{
				sum=sum+num%10;  
				num=num/10; 	
			}

			System.out.println("Sum of digits in a number:"+sum);
		
		
	}

	}

