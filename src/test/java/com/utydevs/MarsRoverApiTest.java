package com.utydevs;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.utydevs.response.MarsRoverApiResponse;

public class MarsRoverApiTest {

	@Test
	public void smallTest()
	{
		//System.out.println("Test running");
		RestTemplate rt = new RestTemplate();
		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", MarsRoverApiResponse.class);
		System.out.println(response.getBody());
	}
}
