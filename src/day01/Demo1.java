package day01;

public class Demo1 {

	public static void main(String[] args) {
		/*Thread t1 = chreateThread();
		t1.start();
		
		Thread t2 = chreateThread();
		t2.start();
		
		Thread t3 = chreateThread();
		t3.start();*/
		
		Thread t4 = newMyThread2(6);
		t4.start();

	}
	
	public static Thread chreateThread(){
		return new Thread(new MyThread1("start","end"));
		
	}
	
	public static Thread newMyThread2(int num){
		return new Thread(new MyThread2(num));
	}

}
