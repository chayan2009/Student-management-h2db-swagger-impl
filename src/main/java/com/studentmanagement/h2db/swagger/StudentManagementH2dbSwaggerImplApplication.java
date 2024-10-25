package com.studentmanagement.h2db.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(title = "Student API", version = "1.0", description = "API for Student Management"),
    servers = {@Server(url = "http://localhost:8088", description = "Local Server")}
)
public class StudentManagementH2dbSwaggerImplApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementH2dbSwaggerImplApplication.class, args);
	}

}
