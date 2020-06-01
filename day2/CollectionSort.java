package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CollectionSort {

	 
	
	public static void main(String[] args) {


		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("HCL");
		name.add("Wipro");
		name.add("Aspire Systems");
		name.add("CTS");

		Collections.sort(name);
		System.out.println(name);
		System.out.println(name.size());
		
		/*for (String string : name) 
		{
			System.out.println(string);
		}*/
		
		System.out.println(name.get(name.size()-1));
		for(int i=name.size()-1;i>=0;i--)
		{
			
			System.out.print(name.get(i)+" ");
		}
	}

}
