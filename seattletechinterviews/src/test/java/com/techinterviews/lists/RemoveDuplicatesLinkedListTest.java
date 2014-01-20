package com.techinterviews.lists;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class RemoveDuplicatesLinkedListTest {

	@Test
	public void insertAllDuplicatesOneLeftTest(){
		LinkedList list = new LinkedList();
		for (int i=0;i<10;i++){
			list.add(1);
		}
		list.RemoveDuplicates();
		System.out.println(list.get(0).value);
		Assert.assertEquals(list.get(0).value, 1);
	}
	
	@Test
	public void insertNoDupes(){
		LinkedList list = new LinkedList();
		for (int i=0;i<10;i++){
			list.add(i);
		}
		list.RemoveDuplicates();
		Assert.assertEquals(list.get(0).value,9);
		Assert.assertEquals(list.get(9).value, 0);
	}
	
    @Test
	public void insertMixDuplicates(){
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(2);
		list.add(1);
		list.RemoveDuplicates();
		Assert.assertEquals(2, list.get(1).value);
		Assert.assertEquals(1, list.get(0).value);
	}
	
    @Test
 	public void insertMixHalfDuplicates(){
 		LinkedList list = new LinkedList();
 		list.add(2);
 		list.add(1);
 		list.add(2);
 		list.add(1);
 		list.RemoveDuplicates();
 		//System.out.println(list.get(1).value);
 		Assert.assertEquals(2, list.get(1).value);
 		Assert.assertEquals(1, list.get(0).value);
 	}
 	

}
