package Week4Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_SecondLargest 
{
	public static void main(String[] args)
	{
		Integer[] a= {3, 2, 11, 4, 6, 7};
		//Empty List
		List<Integer> list=new ArrayList<>();
		
		//Add to List
		Collections.addAll(list, a);
		System.out.println("Given input " + list);
		
		//Sort List
		Collections.sort(list);
		System.out.println("The sorted list is " + list );
		
		
		//Find second largest no
		 int secondLargest = list.get(list.size() - 2); 
	     System.out.println("The second largest number is: " + secondLargest);
		
				
			
	}

}
