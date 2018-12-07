package day02;

import java.util.concurrent.Callable;

public class MyThread2 implements Callable<Integer>{

	private int num;
	
	public MyThread2(int num){
		this.num = num;
	}
	
	@Override
	public Integer call() throws Exception {
		
		return sum_f(num);
	}
	
	private int sum_f(int num){
		return num>0? f(num)+sum_f(num-1) : 0;
	}
	
	private int f(int num){
		return num>2? f(num-1) + f(num-2) : 1;
	}

}
