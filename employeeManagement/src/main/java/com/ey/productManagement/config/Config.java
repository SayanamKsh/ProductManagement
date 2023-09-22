package com.ey.productManagement.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
							name="Kshirabdhi",
							email = "kshirabdhi.das@in.ey.com"
						),
				description = "Documentation for Product Management service ",
				title = "Product Management",
				version = "1.0"
				)
		)
public class Config {
}
