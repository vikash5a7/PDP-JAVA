package com.vikash.thread.deadlock;

public class DeadLock {

	public static Object spoon = new Object();
	public static Object bowl = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (spoon) {
				System.out.println("cook1: holding the spoon...");
				System.out.println("cook1: wating for the bowl...");
			}
			synchronized (bowl) {
				System.out.println("cook1: holding the spoon and Bowl...");
			}

		});

		Thread t2 = new Thread(() -> {
			synchronized (spoon) {
				System.out.println("cook2: holding the ...bow");
				System.out.println("cook2: wating for the spoon...");
			}
			synchronized (bowl) {
				System.out.println("cook2: holding the spoon and Bowl...");
			}
		});

		t1.start();
		t2.start();

	}

}
