package ch01_di;

public class MessageBeanEn implements  MessageBean{
	public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

	public void sayHello2(String name) {
		 System.out.println("Hello, " + name + "!");
		
	}
}
