package br.com.techjambo.springbootstudy.springboothelloworldi18n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.techjambo.springbootstudy.springboothelloworldi18n.bean.HelloWorldBean;

@RestController
public class HelloWorldController {
 	
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
	@GetMapping(path="/hello-world-i18n")
	public String HelloWorldI18N() {
		return messageSource.getMessage("hello.world",null, LocaleContextHolder.getLocale());
		
	}
	
}
