package designPattern;

public class SingleTonDemo {

	public static void main(String[] args) {

		Singleton ob = Singleton.getIntance();
		Singleton ob1 = Singleton.getIntance();

		System.out.println(ob + " " + ob1);
		ob.showMsg();

	}
}
