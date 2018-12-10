package day05;

import bean.Pair;

public class PairManager2 extends PairManager{

	@Override
	public void increment() {
		Pair p;
		synchronized(this){
			pair.incrementX();
			pair.incrementY();
			p = getPair();
		}
		store(p);
	}

}
