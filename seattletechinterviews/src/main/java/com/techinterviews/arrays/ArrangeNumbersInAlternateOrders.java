package com.techinterviews.arrays;

public class ArrangeNumbersInAlternateOrders {

	/**
	 * Arrange the numbers in an array in alternating order. For example if the
	 * array is [a1, a2, a3, a4.. ]arrange the array such that b1<=b2>=b3<=b4
	 * and so on.
	 * 
	 * Sample Input: 3 5 7 8 4 9 Sample Output: 3 < 5 > 4 < 8 >7 < 9
	 *  0 1 2 3 4 5 
	 *  3 4 5 7 8 9 
	 *  3 5 4 8 7 9
	 * @param array
	 * @return
	 */
	public int[] algorithm(int[] array) {
		sort(array);
		for(int i=2;i<array.length;i+=2){
			int temp=array[i-1];
			array[i-1]=array[i];
			array[i]=temp;
		}
		
		return array;
	}
	
	/**
	 * Bubble sort.
	 * 
	 * @param array
	 */
	public static void sort(int array[]){
		boolean bsort = false;
		int i = 1; 
		while(i<array.length){	
			if(array[i-1] > array[i]){
				int temp=array[i];
				array[i]=array[i-1];
				array[i-1]=temp;
				bsort=true;
			}
			i++;
			if(i==array.length){
				if(!bsort) break;
				bsort=false;
				i=1;
			}
		}
	}
}
