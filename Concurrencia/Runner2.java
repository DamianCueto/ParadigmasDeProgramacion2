package com.pp2;

public class Runner2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Runner2: " + i);
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
