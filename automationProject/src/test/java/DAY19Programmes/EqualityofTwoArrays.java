package DAY19Programmes;

import java.util.Arrays;

public class EqualityofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			
			int a1[] = { 1, 2, 3, 9, 5};
			int a2[] = { 1, 2, 3, 4, 5 };
			//content comparision like Index way
		
			boolean status = Arrays.equals(a1,a2);

			if (status == true) 
			{
				System.out.println("Arrays are equal");
			}

			else {
				System.out.println("Arrays are not equal");
			}
		}
	}

}
