package com.pp2;
class Runner1 implements Runnable{
	
	@Override
	public void run () {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println("Runner 1: " + i);
	}
}

class Runner2 implements Runnable{
	
	@Override
	public void run () {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println("Runner 2: " + i);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		t1.start();
		t2.start();
	}

}
