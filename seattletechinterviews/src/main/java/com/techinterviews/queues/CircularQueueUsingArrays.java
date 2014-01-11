package com.techinterviews.queues;

public class CircularQueueUsingArrays {
	int [] array;
	int head=0;
	int tail=0;
	
	public CircularQueueUsingArrays(int size){

		if(size>0)
			array = new int[size];
	}
	
	private boolean isFilled(){
		
		if(tail==(array.length-1))
				return true;
		
		return false;
	}
	
	public void enqueue(int v){
		
		//if filled add to head
		if(isFilled()){
			array[head]=v;
			head++;
		}
		else{
			array[tail]=v;
			tail++;
		}
	}
	
	public int dequeue(){
		int v = 0;
		if(head!=0 && tail!=0){
			v = this.array[head];
			tail--;
		}

		return v;
	}
}
