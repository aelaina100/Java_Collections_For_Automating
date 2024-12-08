package JavaCollectionPkg.JavaCollections;

import java.util.HashSet;

public class B_HashSet_JavaCollections {

	public static void main(String[] args) {
		
		 //Java Collections contain the 3 interfaces of: List, Set, & Map.
		 
		/*Set Interface. [The order, in which elements are added, isn't guarenteed. Can NOT contain duplicate elements]
		            	
		        		Implemented by the following classes:
		        		    -HashSet
		        			-LinkedHashSet
		        			-TreeSet     */
		
		// This example illustrates the HashSet class.
				// Once one is familiar with the 'HashSet' class, then the rest of the 2 classes (LinkedHashSet & TreeSet) become very 
				// easy to figure out.
				
				// So let's create an HashSet class (which automatically implements the 'Set' interface) in order to apply the 
				//methods in the 'Set' interface on the elements stored in the HashSet class (in order to organize these elements)
		
// Now, simply study/ predict the output:
		HashSet<String> hashSet= new HashSet<String>();  

		hashSet.add("road");
		hashSet.add("mountain");
		hashSet.add("hybrid");
		hashSet.add("hybrid");   // will NOT be added as HashSet does NOT except duplicate values.
		System.out.println(hashSet);   // displaying elements of the collection class with brackets.
		// Now, One can't add an element TO A SPECIFIC INDEX (Since, again, order of elements is not guaranteed in HashSet class).
			// So   .add(0,"pre-name");  only applies to an ArrayList class.
		
		//In HashSet class, there are no methods equivalent to .get(i) or .indexOf() since order of elements is NOT guaranteed when 
		// populating with data
		
		//Removing an element can ONLY be done via specifying the string directly [Never by index as order of elements is NOT guarenteed
		hashSet.remove("road");
		System.out.println(hashSet);

		// .isEmpty()  .size()  could be applied to HashSet & ArrayList classes.
		
		
	

	}

}
