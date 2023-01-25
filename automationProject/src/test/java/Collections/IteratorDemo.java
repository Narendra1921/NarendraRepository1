package Collections;

import java.util.ArrayList;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		//Traversing list through for-each loop  
		for(String obj:al) 
{	System.out.println(obj);  
			}  

	}

}
