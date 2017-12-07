package com.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = "com.example.myproject")
@RestController
public class DemoApplication {

	@Autowired
	ApplicationRepository applicationRepository;

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> home() {
		Application app = applicationRepository.findOne("PartyImpl#610");
		return new ResponseEntity<Application>(app, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
