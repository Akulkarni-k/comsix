package com.code.Anuja;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@WebMvcTest(GreetingControllers.class)
public class Webmocktestgreet {
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private GreetingService service;
	public void greestingShouldretrunsmsfromservice() throws Exception
	{
		
		when(service.greet()).thenReturn("hi,mock");
		this.mvc.perform(get("/hianuja")).andDo(print()).andExpect(status().isOk()).
		andExpect((ResultMatcher) content().string(containsString("hi,mock")));
	}

}
