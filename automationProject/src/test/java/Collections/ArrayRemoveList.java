package Collections;

import java.util.ArrayList;

public class ArrayRemoveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Ravi");   
		al.add("Vijay");   
		al.add("Ajay");  
		al.add("Anuj");  
		al.add("Gaurav");      
			
		System.out.println("An initial list of elements: "+al);   
		al.remove("Vijay");
		System.out.println("After invoking remove(object) method: "+al);   
		al.remove(4);
		System.out.println("After invoking remove(index) method: "+al);
		  ArrayList<String> al2=new ArrayList<String>();    
		  al2.add("Ravi");    
		  al2.add("Hanumat");   
		 al.addAll(al2);
		System.out.println("Updated list : "+al);   
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: "+al);  
		al.removeIf(str->str.contains("Ravi"));   
		System.out.println("After invoking removeIf() method: "+al);  
		System.out.println("After invoking clear() method: "+al);
		}

}
