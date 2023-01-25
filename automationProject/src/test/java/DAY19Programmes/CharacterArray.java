package DAY19Programmes;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first way using length method
		String str="narendra";
		String rev="   ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("revered string is :"+rev);
	}
}



































	/*	//2nd way using Character array
		char a[]=str.toCharArray();
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reversed String is "+rev);

		//using String Buffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());*/
		
