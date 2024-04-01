package com.code.Anuja;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.ModuleLayer.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Smoketset {
	@Autowired
	private Homecontroll homecontroll;
	@Test
	void contextLoad()
	{
		assertThat(homecontroll).isNotNull();
	}

}
