package controller;

public class RunThreads extends Thread {
	
	private int idThread;
	
	public RunThreads(int idThread) {
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		System.out.println(idThread);
	}
}
