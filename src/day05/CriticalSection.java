package day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.thread.bean.PairChecker;
import com.thread.bean.PairMainPulator;

public class CriticalSection {

	public static void main(String[] args) {
		testApproaches(new PairManager1(), new PairManager2());
	}
	
	static void testApproaches(PairManager pman1, PairManager pman2){
		ExecutorService exec = Executors.newCachedThreadPool();
		PairMainPulator 
			pm1 = new PairMainPulator(pman1),
			pm2 = new PairMainPulator(pman2);
		PairChecker
			pcheck1 = new PairChecker(pman1),
			pcheck2 = new PairChecker(pman2);
		
		exec.execute(pm1);
		exec.execute(pm2);
		exec.execute(pcheck1);
		exec.execute(pcheck2);
		try {
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("pm1: " + pm1.toString() + "\npm2: "+ pm2);
		System.exit(0);
	}

}
