package com.techinterviews.lists;

import java.util.HashMap;


public class LinkedList {
	ListNode head;
	/**
	 * Please implement and execute the <code>AddLinkedListTest</code> 
	 * 
	 * @param k
	 */
	public void addToTail(int k) {
		ListNode n=new ListNode();
		n.value=k;
		
		if(head==null){
			System.out.println("Node val head " + n.value);
			head=n;
			return;
		}
		
		ListNode current=head;
		while(current.next!=null){
			current=current.next;
			System.out.println("Node val " + current.value);
			if(current.next==null)
				System.out.println("Found tail add val " + n.value);
		}
		
		current.next=n;	
		
	}

	/**
	 * Please implement and execute the <code>AddLinkedListTest</code> 
	 * 
	 * @param k
	 */
	public void add(int k) {
		ListNode n=new ListNode();
		n.value=k;
		
		if(head==null){
			head=n;
		}
		else{
			n.next=head;
			head=n;
		}	
	}

	/**
	 * Please implement and execute the <code>InsertAtLinkedListTest</code>
	 * @param k
	 * @param at
	 */
	public void insert(int k, int at) {
		
	}

	public void reverse() {
		ListNode prev=null;
		ListNode current=head;
		
		while(current!=null){
			ListNode next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}

	public ListNode get(int at) {
		ListNode current = head;
		while (current != null) {
			if (at == 0) {
				return current;
			} else {
				current = current.next;
				at--;
			}
		}
		return current;
	}
	
	public void RemoveDuplicates(){
		if(head==null)
			 throw new IllegalArgumentException("head is null");
		
		ListNode node = head;
		HashMap<Integer, Integer> fmap = new HashMap<Integer, Integer>();
		while(node!=null)
		{
			if(fmap.containsKey(node.value)){
				int ifreq = fmap.get(node.value)+1;
				fmap.put(node.value, ifreq);
				System.out.println("Node dup " + node.value + " freq " + ifreq);
			}
			else
			{
				fmap.put(node.value, 1);
			}
			node=node.next;
		}
		
		// the heads next;
		ListNode prev=head;
		ListNode current=prev.next;
		
		while(current!=null){
			int val=fmap.get(current.value);
			if(val>1)
			{
				val+=-1;
				fmap.put(current.value, val);
				if(current.next!=null)
				{	
					prev.next=current.next;
					current=current.next;
				}
				else
				{
					prev.next=null;
				}
				
			}
			else
			{
				current=current.next;
				prev=prev.next;
			}
			
		}
	}
}
