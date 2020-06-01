package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.hpsf.Array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String S1 ="PayPal India";
		char[] charArray = S1.toCharArray();
			
		Set<Character> charSet  = new LinkedHashSet<Character>();
		Set<Character> Dupchar  = new LinkedHashSet<Character>();
		
			
for (Character character : charArray) 
{
	if(!charSet.add(character))
	{
		Dupchar.add(character);	
	}	
}

charSet.removeAll(Dupchar);
for (Character ch : charSet) {
	if(ch != ' ')
	{
		System.out.print(ch);	
	}
}

		

		
			
		}		
		
		
}


