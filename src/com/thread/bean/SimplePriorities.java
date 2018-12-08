package com.thread.bean;

public class SimplePriorities implements Runnable{

	private int countDown = 10;
	private int priority;
	private volatile double d;
	
	public SimplePriorities(int priotity) {
		this.priority = priotity;
	}
	
	public String toString(){
		return Thread.currentThread() + " : " + countDown;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i=0; i<100000; i++){
				d += (Math.PI + Math.E) / (double)i; 
				if(i % 1000 == 0){
					Thread.yield();
				}
			}
			System.out.println(this);
			if(--countDown == 0) return;
		}
	}

}
