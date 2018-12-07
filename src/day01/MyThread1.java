package day01;

public class MyThread1 implements Runnable{
	
	private static String startMsg;
	private static String endMsg;
	
	public MyThread1(String startMsg, String endMsg){
		
		this.startMsg = startMsg;
		this.endMsg = endMsg;
	}
	
	@Override
	public void run() {
		System.out.println(startMsg);
		for(int i=0; i<3; i++){
			System.out.println("This is : " + i);
		}
		System.out.println(endMsg);
		Thread.yield();
	}

}
