package Week4Day2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Set_Google 
{

	public static void main(String[] args) 
	{
		String companyName="google";
		char[] charArray=companyName.toCharArray();
		Arrays.sort(charArray);
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) 
		{
			
			if (!unique.add(charArray[i])) 
			{
                duplicate.add(charArray[i]);  // Add to duplicate set
            }
			
		}
		unique.removeAll(duplicate);
		System.out.println("Name is " + companyName);
		System.out.println("Unique characters are " + unique);
		System.out.println("Duplicate characters are " + duplicate);
	}

}
