package com.techinterviews.arrays;

import java.util.HashMap;;

public class StringProblems {

	public static boolean isStringPermuation(String a, String b){
		//quickcheck
		boolean isPerm=true;
		
		if(a.length()!=b.length())
			return false;
		
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		
		for(char c:a.toCharArray()){
			if(freq.containsKey(String.valueOf(c))){
				int val=freq.get(String.valueOf(c));
				freq.put(String.valueOf(c), val++);
			}
			else
			{
				freq.put(String.valueOf(c), 1);
			}
		}
		
		for(char c:b.toCharArray()){
			if(freq.containsKey(String.valueOf(c))){
				int val=freq.get(String.valueOf(c))-1;
				freq.put(String.valueOf(c), val);
			}
		}
		
		//check the values
		for(Integer i:freq.values()){
			System.out.println("Val is " + i);
			if(i!=0){
				isPerm=false;
				//break;
			}
		}
		
		return isPerm;
	}

}
