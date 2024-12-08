package arrayListSpecific;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Test;
//*******************************************************************************************************************************************************
//So far: .contains() apply to strings and arrayLists (meaning of any type) where:
	 //[for strings:  .contains(String.valueOf('s'))     &  For arrayLists: .contains(variable: String or int or boolean or anything except a collection)  
		
		//  .containsAll() applies to arrayLists (meaning of any type)
		
		// As for arrays (fixed-length data  structure, one has to loop through the array)
//******************************************************************************************************************************************************

/* All collection classes that implement the interfaces of List & Set [Excluding Map]:====>
   contain the very 2 important methods of .contains() & .containsAll()  that are used in TestNg assertions for test automation. 
   In these notes, let's limit our scope to the arrayList class.
   
   Key points:
   
  1. contains(Object o):
   		Checks whether the arrayList contains a specified element.
  		Returns true if the collection contains at least one element equal to the specified object.

 
  2. containsAll(Collection<?> c):
        Checks whether the arrayList contains all the elements in the specified collection.
        Returns true if ALL elements in the specified collection are found in the current collection.
        
        NOTE: The .contains() method applies to both: String class & the arrayList one.
        
        	  For String class:
        	  String name= "Ahmad"; 
        	  name.contains(String.valueOf('d')); //returns true
 */
  
public class arrayList_contains_method {
	
	@Test(enabled= false)
	public void arrayListContainsMethod()
	{
		String country= "Japan";
		List<String> countries_arrayList1= Arrays.asList("China", "Korea", "Japan");
		List<String> countries_arrayList2= Arrays.asList("China", "Korea","Japan");
		List<String> countries_arrayList3= Arrays.asList("China", "Korea");
		
		Boolean bool= countries_arrayList1.contains(country); // Can only pass a single element that is NOT a collection as doing so will throw FALSE ALWAYS
		System.out.println(bool);
		System.out.println("*********************************************************************");
		Boolean bool2= countries_arrayList1.contains(countries_arrayList3); // will ALWAYS THROW FALSE [as argument should be a single element NOT of collection type]
		System.out.println(bool2);
		System.out.println("*********************************************************************");
		Boolean bool3= countries_arrayList1.contains(countries_arrayList2); // will ALWAYS THROW FALSE [as argument should be a single element NOT of collection type]
		System.out.println(bool3);
		
		String countries[]= {"Japan" };
		List<String> countries_arrayListy= Arrays.asList(countries);
		Boolean bool4= countries_arrayList1.contains(countries_arrayListy); // A dumb thing to do !
		//Boolean bool4= countries_arrayList1.contains(countries);   // A much dumber thing to do !
		System.out.println(bool4);
	}
	
	@Test
	public void arrayListContainsAllMethod()
	{
		String country= "Japan";
		List<String> countries_arrayList1= Arrays.asList("China", "Korea", "Japan");
		List<String> countries_arrayList2= Arrays.asList("China", "Korea","Japan");
		List<String> countries_arrayList3= Arrays.asList("China", "Korea");
		
		Boolean bool= countries_arrayList1.containsAll(countries_arrayList3); // Can ONLY pass a collection class.
		System.out.println(bool);
		System.out.println("*********************************************************************");
		Boolean bool2= countries_arrayList1.containsAll(countries_arrayList2);
		System.out.println(bool2);
		System.out.println("*********************************************************************");
		//Boolean bool3= countries_arrayList1.containsAll(country); // Syntax error [as argument should be a collection class ONLY]
		
		String countries[]= {"Japan" };
		List<String> countries_arrayListy= Arrays.asList(countries);
		Boolean bool4= countries_arrayList1.containsAll(countries_arrayListy); // Can ONLY pass a collection class.
		//Boolean bool4= countries_arrayList1.contains(countries);   // A dumb thing to do.    
		
		//To do: What if, 'countries' is of a different collection class than arrayList ? (If it is LinkedList/vector OR HashSet/LinkedHashSet)
		System.out.println(bool4);  
	}

}
