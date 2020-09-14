package view;

import controller.RunThreads;

public class Principal {

	public static void main(String[] args) {
		for (int threadId = 0; threadId < 5; threadId++) {
			new RunThreads().start();
		}

	}

}
