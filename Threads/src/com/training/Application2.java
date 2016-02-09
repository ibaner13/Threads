package com.training;

public class Application2 {

	public static void main(String[] args) {

		YourThread obj = new YourThread();
		Thread th1 = new Thread(obj, "Ishika");
		Thread th2 = new Thread(obj, "Dhawal");
		Thread th3 = new Thread(obj, "Gaurav");
		th1.start();
		th2.start();
		th3.start();
	}

}
