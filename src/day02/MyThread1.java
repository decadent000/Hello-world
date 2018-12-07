package day02;

public class MyThread1 implements Runnable{

	private String startMsg = "start";
	private String endMsg = "end";
	
	public MyThread1(){
		
	}
	
	public MyThread1(String startMsg, String endMsg){
		super();
		this.startMsg = startMsg;
		this.endMsg = endMsg;
	}
	
	@Override
	public void run() {
		System.out.println(startMsg);
		doA();
		System.out.println(endMsg);
	}
	
	public void doA(){
		for(int i=0;i<10;i++){
			System.out.print(" "+i+" ");
			Thread.yield();
		}
		System.out.println();
	}

}
