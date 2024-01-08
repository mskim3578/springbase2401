package ch01_di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {
	/*
	 * 1. spring build path  : maven ---> pom.xml 
	 * 2. container 만들기 : xml
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ch01_di/Container0102.xml");
		//m : MessageKo 또는 MessageEn 임.,
				MessageBean m = ctx.getBean("message",MessageBean.class);
				m.sayHello2("hongkildong====");
	}
}
