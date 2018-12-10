package day04;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest implements Runnable{

	public AtomicInteger i = new AtomicInteger(0);
	
	public int getValue(){
		return i.get();
	}
	
	private void elenIncreatement(){
		i.addAndGet(2);
	}
	
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {
			public void run() {
				System.out.println("Aborting");
				System.exit(0);
				
				
			}
		}, 5000);
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		AtomicIntegerTest atomicIntegerTest = new AtomicIntegerTest();
 		newCachedThreadPool.execute(atomicIntegerTest);
		while(true){
			int val = atomicIntegerTest.getValue();
			if(val%2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}

	@Override
	public void run() {
		while(true){
			elenIncreatement();
		}
	}
	
}
