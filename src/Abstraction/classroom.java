package Abstraction;


abstract class animal{
	abstract void sound();
}

class dog extends animal{
	void sound() {
		System.out.println("woof");
	}
}


public class classroom {
	public static void main(String args[]) {
		animal a = new dog();
		a.sound();
	}
}
