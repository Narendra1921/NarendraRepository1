import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer>data = new LinkedHashSet<Integer>();
		
		data.add(11);
		data.add(21);
		data.add(31);
		data.add(41);
		data.add(51);
		data.add(91);
		data.add(81);
		
		if(!data.contains(91))//Conditional Adding Element
		{
			data.add(91);
		}
		else
		{
			System.out.println("Element is exists in data");
		}
	
	System.out.print("set:   " + data);
	}
	

}
