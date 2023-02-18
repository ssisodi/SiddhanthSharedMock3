package pack123;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCollection {

	public static void main(String[] args) {
		       //key, value
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(23, "Velocity");
		map.put(73, "Class");
		map.put(58, "Pune");
		map.put(78, "Class");
		
		//Retrieval
		for(Map.Entry<Integer,String> e : map.entrySet())
		{
			System.out.println("Key = " + e.getKey() +"  "+ "Value = " + e.getValue());
		}
		
		map.remove(58);
		
		System.out.println("===============");
		
		for(Map.Entry<Integer, String> e : map.entrySet())
		{
			
		}
		
	}
}
 