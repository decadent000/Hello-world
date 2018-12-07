package day02;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo1 {

	public static void main(String[] args) {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for(int i=0; i<200; i++){
			newCachedThreadPool.execute(new MyThread1());
		}
		newCachedThreadPool.shutdown();
		
		ExecutorService newCachedThreadPool2 = Executors.newCachedThreadPool();
		ArrayList<Future<Integer>> arrayList = new ArrayList<Future<Integer>>();
		
		for(int i=0; i<10; i++){ 
			arrayList.add(newCachedThreadPool2.submit(new MyThread2(i)));
		}
		
		try {
			for (Future<Integer> future : arrayList) {
				System.out.println(future.isDone());
				System.out.println(future.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			newCachedThreadPool2.shutdown();
		}
		
		
		
	}

}
