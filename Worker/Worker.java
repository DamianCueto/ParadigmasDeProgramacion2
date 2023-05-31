package com.pp2;

public class Worker implements Runnable{
	
	private boolean isTerminated = false;
	
	public void run() {
		while(isTerminated) {
			System.out.println("Hello from worker class...");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isTerminated() {
		return isTerminated;
	}
	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
}
