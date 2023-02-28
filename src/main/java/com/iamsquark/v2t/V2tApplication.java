package com.iamsquark.v2t;

import com.iamsquark.v2t.model.response.GetPingResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@SpringBootApplication
@RestController
public class V2tApplication {

	public static void main(String[] args) {
		SpringApplication.run(V2tApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetPingResponse> getPing() {
		GetPingResponse pingResponse = GetPingResponse.builder()
				.ping("pong")
				.timeStamp(Instant.now())
				.build();
		return new ResponseEntity<>(pingResponse, HttpStatus.OK);
	}

}
