//VsCode Command Palette = Ctrl + Shift + p
//1. get initial boot up and running to map to "Whitelabel error page" --> due to lack of request mappings for root context.
//change #2

package com.anthonybeddia.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
