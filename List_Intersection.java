package Week4Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Intersection
{

	public static void main(String[] args) 
	{
		Integer[] a={3, 2, 11, 4, 6, 7} ;
		Integer[] b= {1, 2, 8, 4, 9, 7} ;
		
		List <Integer> list =new ArrayList<Integer>();
		List <Integer> dup =new ArrayList<Integer>();
		
		 Collections.addAll(list, a);
		 Collections.addAll(list, b);
		 list.sort(null);
		 System.out.println("Merged & Sorted List " +list);
		
		 	for (int i=1 ;i <list.size();i++)
		 	{
		 		if (list.get(i)==list.get(i-1))
		 		{
		 			dup.add(list.get(i));
		 		}
		 				
		 	}
		 	System.out.println("Duplicate values are " +dup);
		
		 }
	
	}

