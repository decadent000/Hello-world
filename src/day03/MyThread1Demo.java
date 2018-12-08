package day03;

import java.io.IOException;

import com.thread.bean.MyThread1;

public class MyThread1Demo {

	public static void main(String[] args) throws IOException {
		int read = System.in.read();
		System.out.println(read);
		new MyThread1();
		
		Thread thread = new Thread(new Runnable() {
			private Thread t = new Thread(this);
			
			public String toString(){
				return "hello world!!";
			}
			
			@Override
			public void run() {
				System.out.println(this);
			}
		});
		
		thread.start();
	}

}
