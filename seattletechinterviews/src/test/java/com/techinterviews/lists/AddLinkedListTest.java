package com.techinterviews.lists;

import org.junit.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class AddLinkedListTest {
	
	@Ignore @Test
	public void testAddNum(){
		LinkedList list = new LinkedList();
		list.add(1);
		ListNode node = list.get(0);
		Assert.assertEquals(1,node.value);
	}
	
	/**
	 * Makes sure that you are adding to the beginning of the list 
	 * rather than at the end of the list making the operation O(n) 
	 * complex when it should be O(1). 
	 */
	@Ignore @Test
	public void testAddComplexity(){
		LinkedList list = new LinkedList();
		long start = System.currentTimeMillis();
		for (int i = 0;i<10;i++){
			list.add(1);
		}
		long end = System.currentTimeMillis();
		long tenElementAddTime = end - start;
		
		start = System.currentTimeMillis();
		for (int i = 0;i<10000;i++){
			list.add(1);
		}
		 end = System.currentTimeMillis();
		long thousandElementAddTime = end - start;
		System.out.println("Ten time " + tenElementAddTime);
		System.out.println("Thousand time " + thousandElementAddTime);
		Assert.assertTrue(thousandElementAddTime - tenElementAddTime < 5 );
	}
	
	/**
	 * Mak
	 */
	@Test
	public void test10Num(){
		LinkedList list = new LinkedList();
		for (int i=0;i<10;i++){
			list.add(i);
		}
		ListNode node = list.get(0);
		System.out.println("val at 0 " + node.value);
		Assert.assertEquals(9,node.value);
	}
	
	@Ignore @Test
	public void test3Num(){
		LinkedList list = new LinkedList();
		for (int i=0;i<3;i++){
			list.add(i);
		}
		ListNode node0 = list.get(0);
		ListNode node1 = list.get(1);
		ListNode node2 = list.get(2);
		Assert.assertEquals(0,node0.value);
		Assert.assertEquals(1,node1.value);
		Assert.assertEquals(2,node2.value);
	}
}
