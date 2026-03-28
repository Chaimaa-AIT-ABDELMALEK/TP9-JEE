package ma.fstg.security.spring_security_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ma.fstg"})
public class SpringSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringSecurityDemoApplication.class);
		application.run(args);
	}
}