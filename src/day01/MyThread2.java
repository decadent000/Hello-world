package day01;

public class MyThread2 implements Runnable{
	private int num;
	
	public MyThread2(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		
		System.out.println(f(num));
		
	}
	
	public static int f(int n){
		return n>2? f(n-1) + f(n-2) : 1;
	}

}
