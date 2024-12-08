package JavaCollectionPkg.JavaCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class D_HashMap_JavaCollections {

	public static void main(String[] args) {
		
	//Java Collections contain the 3 interfaces of: List, Set, & Map.
		
	 /* Map Interface. [Contains methods For mapping keys to values. can NOT contain duplicate KEYS (The class that implements it)]
				
			Implemented by the following classes:
				   -HashMap
				   -TreeMap
				   -LinkedHashMap                       
				    
		// Once one is familiar with the 'HashMap' class, then the rest of the 2 classes (TreeMap & LinkedHashMap) become very 
		// easy to figure out.
				
		// So let's create an object of the HashMap class (which automatically implements the 'Map' interface) in order to access all the 
		//methods, in the 'Map' interface, to apply on the elements stored in the HashMap class (in order to organize these elements)  */
		HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		hashMap.put(1, "January");  //.put(Integer key, String Value): String
		hashMap.put(2, "February");
		hashMap.put(3, "March");
		hashMap.put(3, "March"); // will NOT be added as duplicate KEYS are not allowed in HashMap
		hashMap.put(4, "March"); // unique value.. off course !
		
		System.out.println(hashMap);  // output with brackets  {1=January, 2=February, 3=March, 4=March}
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// Crucial:
		// In ArrayList ===> .get(int index): String
		// In HashSet   ===> No such method/something equivalent to it. Also  .iterator() is the alternative to iterating using for-loop.
		// In HashMap   ===> .get(Object key): String                   Also  .iterator() is the alternative to iterating using for-loop.
		

		// For key of integer value of "1", display its stored value
		System.out.println(hashMap.get(1));
		
		// For key of integer value of "0", display its stored value
		System.out.println(hashMap.get(0));   // output: null (No key of such integer value)
		
		//For the first key, display its stored value
		 // to do
	 System.out.println("---------------------------------------------------------------------------------------------");	
	 System.out.println(" Without iteration Display the assigned keys only (NOT their values)");
	 System.out.println(hashMap.keySet());  // [1, 2, 3, 4]     there exists:==>  .keySet.iterator();
	 
	 System.out.println("---------------------------------------------------------------------------------------------");
	 System.out.println("Withou iteration Display the  values of the keys only (NOT the keys themselves");
	 System.out.println(hashMap.values());  //[January, February, March, March]  there exists:==>  .values.iterator();
		 
		 
	 System.out.println("---------------------------------------------------------------------------------------------");
		hashMap.remove(1);  // removes    '1= January'
		System.out.println(hashMap);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		hashMap.remove(0);    // There is no key with value of 0. Hence, this line is executed but does no change.
		System.out.println(hashMap);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		//hashMap.remove(4, "March");
		hashMap.remove(4);  // same as above 
		System.out.println(hashMap);
		
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Iterate through the HashMap, displaying only the keys (Not their stored values)");
		Iterator<Integer> it= hashMap.keySet().iterator(); //I created an iterating object(it) that now sits on top of hashMap data structure
		while (it.hasNext())
		{
			System.out.println(it.next()); //it.next() does the actual iteration, storing the key and its value inside it with each iteration
		}
        
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Iterate through the HashMap, displaying only the values of the keys (Not the keys themselves)");
		Iterator<String> itt= hashMap.values().iterator(); //I created an iterating object(itt) that now sits on top of hashMap data structure
		while (itt.hasNext())
		{
		System.out.println(itt.next()); //it.next() does the actual iteration, storing the key and its value inside it with each iteration
		}

		System.out.println("-------------------$$$$$$$$$$$$$$$$$$---------------------------------------");
		// Now, using entrySet() to display the keys and their values seperately (Instead of the above 2 iterations above)
		
		//Use Chat GPT
		System.out.println(hashMap.entrySet());
		
	}
}
