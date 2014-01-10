package com.techinterviews.arrays;

import java.util.HashSet;
import java.util.ListIterator;

/**
 * Find 2 numbers in an array that add up to a given number.
 * 
 * @author rsalota
 *
 */
public class Find2NumbersThatAddToN {
	
	public int[] algorithm(int array[],int n){
		int result[]={};
		HashSet<Integer> intSet = new HashSet<Integer>();
		
		if(array==null || 0==array.length)
			return result;
		
		int valToCheck;
		//add and check the difference in the hashset before adding
		for(int i=0;i<array.length;i++){
			if(array[i]<Integer.MAX_VALUE){
				valToCheck=array[i];
				int diff=n-valToCheck;
				if(intSet.contains(diff)){
					result=new int[2];
					result[0]=diff;
					result[1]=valToCheck;
					return result;
				}
				else	
					intSet.add(valToCheck);	
			}	
		}
		return result;
	}
}
