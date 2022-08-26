package com.vikash.thread.Eaxple;

public class Main {
	public static void main(String[] args) {
		ThreadEx threadEx = new ThreadEx();
		threadEx.setName("My First name");
		threadEx.start();
		
		ThreadEx threadEx2 = new ThreadEx();
		threadEx2.setName("My second");
		threadEx2.start();
		
	}

}
