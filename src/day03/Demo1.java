package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.thread.bean.SimplePriorities;

public class Demo1 {
	public static void main(String[] args) {
		
		System.out.println(Math.PI + " " +Math.E);
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		
		for(int i=0; i<5; i++){
			newCachedThreadPool.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		}
		
		newCachedThreadPool.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		newCachedThreadPool.shutdown();
	}
}
