package com.heshan.myThread;

public class Main {

	public static void main(String[] args){
//		MyThread myThread = new MyThread();
//		MyThread myThread2 = new MyThread();
//		myThread.start();
//		myThread2.start();
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<10; i++){
				System.out.println(i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
	}
}
