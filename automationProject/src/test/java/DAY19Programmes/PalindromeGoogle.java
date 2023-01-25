package DAY19Programmes;

public class PalindromeGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					    
			    
				int num = 123454321, RN = 0, remainder;
			    
			    int a = num;
			    
			      while ( num != 0) {
			      remainder = num % 10;
			      RN = RN * 10 + remainder;
			      num /= 10;
			    }
			    
			     if (a == RN) {
			      System.out.println(a + " is a Palindrome.");
			      			    }
			    else {
			      System.out.println(a + " is not a Palindrome.");
			    }
			  }
			
	}

