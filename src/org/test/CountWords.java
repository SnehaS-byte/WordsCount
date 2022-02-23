package org.test;

import java.util.ArrayList;
import java.util.List;

public class CountWords {


	static int countWords(List<String> lst)
	{
		
		int wc = 0; 
		int i = 0;
		List<String> maxlenWords = new ArrayList<String>();
		if(lst.size()!=0) {
		for(String str : lst)
		{
				if (str.length() > 5)
				{ maxlenWords.add(str); }
				 
		}
		for(String str : lst)
			{
				if (str.charAt(i) == 'm' || str.charAt(i) == 'M')
				{
					wc++;
				}
			}
		}
		
		System.out.println(maxlenWords);
		return wc;
	} 
	
	public static void main(String args[])
	{
    	List<String> lst = new ArrayList<String>();
    	lst.add("mother");
    	lst.add("momo");
    	lst.add("pradeep");
    	lst.add("santhosh");
    	lst.add("*m)00");
    	lst.add("8989");
 		System.out.println("No of words : " + countWords(lst));
	}
}
