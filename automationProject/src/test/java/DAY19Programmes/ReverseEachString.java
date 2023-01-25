package DAY19Programmes;

public class ReverseEachString {

	public static void main(String[]args)
	{String str = "Narendra is very good";
	StringBuffer word = new StringBuffer(str);
	word.reverse();
	System.out.println(word);
			
	
	/*String str="ABCDEF";
	String rev="";
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("reversed string is :" +rev);
	}

		/*String str="welcome to java";
		String[] words=str.split("\\s");
		String reverseword="";
			for(String w:words)
			{
				StringBuilder sb=new StringBuilder(w);
				sb.reverse();
				reverseword=reverseword+sb.toString() + " ";
			}

			System.out.println("Reversed String is:" +reverseword);*/
		
			}
}