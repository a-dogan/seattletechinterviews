package com.techinterviews.various;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberProblems {

	//find kth prime of 3,5 and 7
	public static int FindKthPrimeFactor(int x){
		
		List<Integer> nums = Arrays.asList(3,5,7);
		List<Integer> kNumbers = Arrays.asList(1,3,5,7);

		int currentK = kNumbers.lastIndexOf(7);
		int numK=1;
		boolean found = false;
		int count=kNumbers.size();
		
		for(Integer i:nums){
			numK*=i;
			for(Integer k:kNumbers){
				if(k*i>currentK){
					currentK=k*i;
					count++;
				}
				if(count==x){
					found=true;
					break;
				}
			}
			if(found)
				break;
		}
		
		return currentK;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kth factor is " + FindKthPrimeFactor(5));
		System.out.println("Kth factor is " + FindKthPrimeFactor(6));
		System.out.println("Kth factor is " + FindKthPrimeFactor(7));
		System.out.println("Kth factor is " + FindKthPrimeFactor(8));
		System.out.println("Kth factor is " + FindKthPrimeFactor(9));
		System.out.println("Kth factor is " + FindKthPrimeFactor(10));
	}

}
