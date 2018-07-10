package hello.config;

import hello.bean.TestBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig
{
	@ConfigurationProperties("user.properties")
	@Bean
	public TestBean getBean()
	{
		return new TestBean();
	}

}
