package com.automationProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("narendra");
		list.add("chowdary");
		list.add("ammulu");
		list.add("143 pottidhi");
		list.add("Budamkaya");
		list.add("kill bill pandey");
		/*Example 1
		System.out.println(list.get(1));*/
	
		//Example 2
		Iterator<String> itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
			}

}
