package DAY19Programmes;

public class ElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={10,20,30,40,50};
		int search_ele=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
			System.out.println("Element found at:"+a[i]);
			flag=true;
			break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not found");
		}
	}

}