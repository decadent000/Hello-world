package day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.thread.bean.DaemonThreadFactory;
import com.thread.bean.SimpleDaemons;

public class SimpleDeamonDemo {

	public static void main(String[] args) throws InterruptedException {
		/*for(int i=0;i<10;i++){
			Thread simpleDaemon = new Thread(new SimpleDaemons());
			simpleDaemon.setDaemon(true);
			simpleDaemon.start();
		}*/
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i=0; i<5; i++){
			newCachedThreadPool.execute(new SimpleDaemons());
		}
		new Thread(new SimpleDaemons()).join();
		
		System.out.println("All daemons started");
		try {
			TimeUnit.MILLISECONDS.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
