package com.techinterviews.arrays;

public class MergeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,4,5,6,7};
		int[] a2 = {3,8,9,10,11,11,11,15,16,16};
		int[] aNew = new int[a1.length+a2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a1.length && j<a2.length){
			if(a1[i]<a2[j]){
				aNew[k]=a1[i];
				i++;
			}
			else{
				aNew[k]=a2[j];
				j++;
			}
			k++;
		}
		
		while(i<a1.length){
			aNew[k]=a1[i];
			i++;
			k++;
		}
		
		while(j<a2.length){
			aNew[k]=a2[j];
			j++;
			k++;
		}
		
		k=0;
		
		while(k<aNew.length){
			if(k>0)
				System.out.print(",");
			
			System.out.print(aNew[k]);
			k++;	
		}	
	}

}
