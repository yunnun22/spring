package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
	public Config() {

	}

	@Bean
	public ServiceImp svc() {
		return new ServiceImp();

	}

	@Bean
	public AdviceCommon common() {
		return new AdviceCommon();
	}

}
