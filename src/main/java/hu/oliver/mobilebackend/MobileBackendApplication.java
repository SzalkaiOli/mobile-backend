package hu.oliver.mobilebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hu.oliver.mobilebackend")
public class MobileBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileBackendApplication.class, args);
	}

}
