package DAY19Programmes;

public class FindMinsndMaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={50,40,30,60,20,10};

		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}

			else if(a[i]<min)
			{
				min=a[i];
			}
		}

		System.out.println("Max element in array is :"+ max);

		System.out.println("Min element in array is :"+ min);
		}

	}

