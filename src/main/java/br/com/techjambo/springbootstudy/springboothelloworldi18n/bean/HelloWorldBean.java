package br.com.techjambo.springbootstudy.springboothelloworldi18n.bean;

public class HelloWorldBean {

	private String message;
	
	
	public HelloWorldBean(String message) {
		this.message = message;
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
