package com.vikash.thread.Eaxple;

public class ThreadRunnable {

	public static void main(String[] args) {

		Thread t = new Thread(

				() -> {
					int i = 0;
					while (i <= 10) {
						System.out.println("Hi" + i);
						System.out.println(Thread.currentThread().getName());

						i++;
					}

				});
	}
}
