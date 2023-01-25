package DAY19Programmes;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=2, n2=4, sum=0;
		System.out.println(n1+ " " +n2);
		
		for(int i=0;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(" " +sum);
			n1=n2;
			n2=sum;
			}
		}
	}

	