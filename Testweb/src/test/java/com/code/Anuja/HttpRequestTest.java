package com.code.Anuja;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment =  WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
	@LocalServerPort
	private int port;
	@Autowired TestRestTemplate restTemplate;
	@Test
	public void greetingfallsms()
	{
	assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/", String.class)).contains("Hi");	
	}
	
	

}
