package com.iamsquark.v2t;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class V2tApplication {

	public static void main(String[] args) {
		SpringApplication.run(V2tApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> apiRoot() {
		return new ResponseEntity<String>("pong", HttpStatus.OK);
	}

}
