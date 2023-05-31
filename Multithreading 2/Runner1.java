package com.pp2;

public class Runner1 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Runner 1: " + i);
		}
	}
}
