package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Narendra");
		list.add("Ammulu");  
		list.add("Lakshmi");  
		list.add("Pottodu");  
		Iterator<String> itr=list.iterator();  

		while(itr.hasNext())
		   {  
		System.out.println(itr.next());  
		  }  
		 }  
	}