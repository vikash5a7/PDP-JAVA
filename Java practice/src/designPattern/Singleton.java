package designPattern;

public class Singleton {

	private static Singleton singletone = new Singleton();

	private Singleton() {
	};

	public static Singleton getIntance() {
		return singletone;
	}

	public void showMsg() {
		System.out.println("Hello world");
	}

}
