package part03_exam;

public class ServiceImp implements Service {
	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prn() {
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}
}
