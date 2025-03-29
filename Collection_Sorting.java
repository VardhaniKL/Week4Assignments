package Week4Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection_Sorting 
{
	public static void main(String[] args) 
	{
		List<String> companies=new ArrayList<String>();
		List<String> reverse=new ArrayList<String>();
		
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire Systems");
		companies.add("CTS");
		Collections.sort(companies);
		System.out.println("Sorted list is " + "\n"+ companies);
		for (int i=companies.size()-1; i>=0;i--)
		{
			reverse.add(companies.get(i));
		}
		System.out.println(reverse);
		}
}
		
		
	


