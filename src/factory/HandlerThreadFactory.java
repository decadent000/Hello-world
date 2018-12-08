package factory;

import java.util.concurrent.ThreadFactory;

import exception.MyUncaughtExceptionHandler;

public class HandlerThreadFactory implements ThreadFactory{
	private String name;
	
	public HandlerThreadFactory(String name){
		this.name = name;
	}
	
	@Override
	public Thread newThread(Runnable r) {
		
		Thread t = new Thread(r);
		t.setName(name);
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println("eh:" + t.getUncaughtExceptionHandler());
		
		return t;
	}

}
