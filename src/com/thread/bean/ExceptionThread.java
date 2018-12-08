package com.thread.bean;

public class ExceptionThread implements Runnable{
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		throw new RuntimeException();
	}

}
