package controller;

public class RunThreads extends Thread {
	
	@Override
	public void run() {
		System.out.println(getId());
	}
}
