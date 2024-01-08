package ch01_di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main3 {
	/*
	 * 1. spring build path  : maven ---> pom.xml 
	 * 2. container 만들기 : xml
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:ch01_di/Container0102.xml");
		
		//g : chap02.Greeter(format 변수:%s,안녕하세요! 저장) 객체 참조
				Greeter g1 = ctx.getBean("greeter",Greeter.class);
				System.out.println(g1.greet("spring"));
				Greeter g2 = ctx.getBean("greeter",Greeter.class);
				if(g1 == g2) {
					System.out.println("g1 와 g2 객체는 같다");
				} else {
					System.out.println("g2 와 g2 객체는 다르다");
				}
	}

}
