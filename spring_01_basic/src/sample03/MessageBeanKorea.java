package sample03;

public class MessageBeanKorea implements MessageBean {

	public MessageBeanKorea() {

	}

	@Override
	public void sayHello(String name) {
		System.out.printf("안녕, %s !!!", name);

	}
}
