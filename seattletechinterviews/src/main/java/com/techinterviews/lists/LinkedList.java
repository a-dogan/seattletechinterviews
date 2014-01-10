package com.techinterviews.lists;


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
}
