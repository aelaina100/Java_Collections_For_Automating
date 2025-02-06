package JavaCollectionPkg.JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class C_HashSet_Iterator_JavaCollections {

	public static void main(String[] args) {
		
		 /*  1- Create a HashSet and populate it with elements.
		  *  2- Iterate through each and every single element, printing out each in every single iteration.
		 */
		HashSet<String> hashSet= new HashSet<String>();  

		hashSet.add("road");
		hashSet.add("mountain");
		hashSet.add("hybrid");
		hashSet.add("electrical");
		hashSet.add("electrical"); // Will NOT be added as HashSet does NOT accept duplicate values.
		/*
		 * Now, using 'for loops' is useless. As the .get(i) method or any equivalent one does NOT exist
		 * in the SET interface.
		 * 
		 * for(int i=0; i<hashSet.size(); i++)
		{
			System.out.println(hashSet.get(i));  //Error!! .get(i) is NOT in the list. or any other equivalency !
		}  */
		
		//To resolve this issue, the method of .iterator() comes in handy ! [return type:  Iterator<String>]
		
		// It is to iterate through each and every element present in the HashSet class.
		// So, the data structure "HashSet" is already created with elements stored inside it.
		// Now, create an iterating object "it" that sits on top of the HashSet datastructure
		// called 'hashSet'.
		Iterator<String> it= hashSet.iterator(); // The return type suggested is:  Iterator<String>
		 // Now, let this iterating object "it", iterate to the first element using (it.next())
		 // where it.next() automatically store the element inside it as a String (Suggested return type)
		
		while(it.hasNext()) //As long as there is an element to iterate to, then it returns 'true' executing
			            // the code inside the brackets. [At the very beginning it sits on top of data structure.
		{
			System.out.println(it.next()); 
		}                                  
		System.out.println("---------------------------------"); 
// Can you display the last element ? code NOT working (because the iterator object "it" is currently at the last element)
		/*
		int counter = 0;
		while(it.hasNext()) 
		{
			 String element= it.next();
			 counter++;
			System.out.println(element);
			System.out.println(counter);
			
			 if(counter==hashSet.size())
			 {
				 System.out.println("Last element in the HashSet class is: " + element); }
		
		} */
		
		//So to display the last element of the HashSet:
			//re-set the iterator that is currently on the last element, so that it sits on the top of the data structure:
		
		Iterator<String> itt= hashSet.iterator(); // is there a better way ??

		int counter = 0;     
		while(itt.hasNext()) 
		{
			 String element= itt.next();
			 counter++;
			
			 if(counter==hashSet.size())
			 {
				 System.out.println("Last element in the HashSet class is: " + element); }
		
		}
		
  }
}
