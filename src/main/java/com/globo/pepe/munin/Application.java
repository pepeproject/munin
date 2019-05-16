package com.globo.pepe.munin;

import com.globo.pepe.common.controller.HealthcheckController;
import com.globo.pepe.common.controller.InfoController;
import com.globo.pepe.common.services.JsonLoggerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@Import({JsonLoggerService.class, HealthcheckController.class, InfoController.class})
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
