package com.heshan.myThread;

public class Main {

	public static void main(String[] args){
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();
		myThread.start();
		myThread2.start();
	}
}
