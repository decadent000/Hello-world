package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.thread.bean.ExceptionThread;

import exception.MyUncaughtExceptionHandler;
import factory.HandlerThreadFactory;

public class ExceptionThreadTest {

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new HandlerThreadFactory("exceptionThread"));
		newCachedThreadPool.execute(new ExceptionThread());
		newCachedThreadPool.shutdown();
		
		
	}

}
