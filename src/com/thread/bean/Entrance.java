package com.thread.bean;

public class Entrance implements Runnable{

	private static int nember;
	
	@Override
	public void run() {
		synchronized (this) {
			nember++;
		}
	}
	
	public static int getTotalCount(){
		return 0;
	}
	
	public static int getSummary(){
		return nember;
	}

}
