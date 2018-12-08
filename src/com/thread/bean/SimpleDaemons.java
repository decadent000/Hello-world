package com.thread.bean;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
	
	@Override
	public void run() {

		try {
			while(true){
				System.out.println(Thread.currentThread() + " : " + this);
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("sleep() interrupted");
		}
		
		
	}

}
