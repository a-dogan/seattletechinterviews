package com.techinterviews.queues;

import java.util.NoSuchElementException;

public class CircularQueueUsingArrays {
	private int [] array;
	private int head=-1;
	private int tail=-1;
	private int currentSize=0;
	
	public CircularQueueUsingArrays(int size){
		
		if(size==0)
			throw new IllegalArgumentException("Queue size must be greater than 0");
		
		array = new int[size];
		
	}
	
	public boolean isEmpty(){
		
		if(currentSize>0)
			return false;
		
		return true;
	}
	
	public void enqueue(int v){	
		//if filled add to head
		if(currentSize==array.length)
			throw new IllegalStateException("Queue at max capacity");
			
		if(tail+1==array.length)
			tail=0;
		else
			tail++;
		
		//if first element added
		if(head==-1)
			head=0;
		
		array[tail]=v;	
		currentSize++;
	}
	
	public int dequeue(){
		int v = 0;
		
		if(currentSize==0)
			throw new NoSuchElementException();
		
		if(head+1==array.length)
			head=0;
		else
			head++;
		
		v = this.array[head];
		currentSize--;
		return v;
	}
}
