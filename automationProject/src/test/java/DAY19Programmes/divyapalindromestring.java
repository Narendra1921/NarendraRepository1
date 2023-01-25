package DAY19Programmes;

public class divyapalindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		String org_str=str;
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome string"+org_str);
		}
		else
		{
            System.out.println("It is not a palindrome"+org_str);
	}

}
}
