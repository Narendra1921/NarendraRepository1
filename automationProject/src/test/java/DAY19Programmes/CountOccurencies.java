package DAY19Programmes;

public class CountOccurencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="abcabcabcabcabc";
		
		int totalcount=s.length();
		
		int totalcount_afterRmv=s.replace("a","").length();
		
		System.out.println(totalcount_afterRmv);
		
		int count=totalcount-totalcount_afterRmv;
		
		System.out.println("Number occurances of a is :"+count);*/
		
		String s="babababababababa";
		
		String p=s.replace("b", "d");
		
		System.out.println(p);
	}

}
