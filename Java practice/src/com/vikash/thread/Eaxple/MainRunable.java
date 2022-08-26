package com.vikash.thread.Eaxple;

public class MainRunable {
	public static void main(String[] args) {
		Thread t = new Thread(new RunableExample());
		t.start();
		
		Thread t2 = new Thread(new RunableExample());
		t2.start();
	}

}
