package com.thread.bean;

public class MyThread1 implements Runnable{

	private Thread t = new Thread(this);
	
	public MyThread1() {
		t.start();
	}
	
	public String toString(){
		return "hello world";
	}
	
	@Override
	public void run() {
		System.out.println(this);
	}

}
