package sample03;

public class MessageBeanEnglish implements MessageBean {

	public MessageBeanEnglish() {

	}

	@Override
	public void sayHello(String name) {
		System.out.printf("Hello, %s !!!", name);

	}

}
