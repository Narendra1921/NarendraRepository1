package DAY19Programmes;

public class EvenandOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Number=1456897
			//Even Digits=3 Odd Digits=4
			int num=123798764;
			int even_count=0;
			int odd_count=0;
			while(num>0)  //1234  123 12 1
			{
				int rem=num%10;  //4  3  2
				if(rem%2==0)
				{
					even_count++; //1 2
				}
				else
				{
					odd_count++;
				}

				num=num/10;  //123  12  1
			}
	System.out.println("Number of Even Numbers are :" +even_count);
	System.out.println("Number of Even Numbers are :" +odd_count);
	}
	
}
