//package com.nandadulal.demo;

package com.nandadulal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer13AugApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer13AugApplication.class, args);
	}

}
