package ch01_di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main5 {
	/*
	 * 1. spring build path  : maven ---> pom.xml 
	 * 2. container 만들기 : xml
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ch01_di/Container05.xml");
	
	}
}
