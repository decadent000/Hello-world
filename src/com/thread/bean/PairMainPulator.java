package com.thread.bean;

import day05.PairManager;

public class PairMainPulator implements Runnable{
	private PairManager pm;
	
	public PairMainPulator(PairManager pm){
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true){
			pm.increment();
		}
	}
	
	public String toString(){
		return "Pair: " + pm.getPair() + ", checkCounter: " + pm.checkCounter.get();
	}

}
