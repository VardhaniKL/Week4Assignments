package Week4Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_MissingElement
{
	public static void main(String[] args) 
	{
	//Declare Integer
		Integer[] a= {1, 2, 3, 4, 10, 6, 8};
	//Create empty list and add values of a
		List<Integer> list=new ArrayList<Integer>();
		Collections.addAll(list, a);
	//Sort the list
		Collections.sort(list);
		System.out.println("Size of the list is " +list.size());
		System.out.println("The sorted nos are " + list);
	//Create another empty list
		List<Integer> missing=new ArrayList<Integer>();
		
		 // Loop from 1 to 10 (expected range)
        for (int i = 1; i <= 10; i++) {
            if (list.indexOf(i) == -1) { // If i is not in the list, add it to missing
                missing.add(i);
            }
        }

        // Print the missing numbers
        System.out.println("Missing numbers are: " + missing);
	}
}

