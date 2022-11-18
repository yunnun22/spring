package part03_exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
	@Bean
	public ServiceImp svc() {
		return new ServiceImp();
	}
	
	@Bean
	public StopWatchAdvice stopWatch() {
		return new StopWatchAdvice();
	}
}
