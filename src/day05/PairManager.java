package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import bean.Pair;

public abstract class PairManager {
	public AtomicInteger checkCounter = new AtomicInteger();
	protected Pair pair = new Pair();
	List<Pair> storage = Collections.synchronizedList(new ArrayList<>());
	
	public synchronized Pair getPair(){
		return new Pair(pair.getX(),pair.getY());
	}
	
	protected void store(Pair pair){
		storage.add(pair);
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public abstract void increment();

}
