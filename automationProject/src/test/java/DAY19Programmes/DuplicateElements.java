package DAY19Programmes;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"Narendra","Chowdary","Rockstar","King of the Kings","Narendra"};
		
		boolean flag=false;
		
		for(int N=0;N<arr.length;N++)
		{
			for(int K=N+1;K<arr.length;K++)
			{
				if(arr[N]==arr[K]) {
					
					System.out.println("Duplicate Value \n"+arr[N]);
			flag=true;
				}
			
	}

		
	}
		if (flag==false) {
			System.out.println("Duplicate not found");
		}
}}