package ch01_di;

public class Greeter {
	private String format;
	
	//format : %s, 안녕하세요!
		public void setFormat(String format) {
			this.format = format;
		}
		
		
		public String greet(String guest) {
			//String.format("%s,안녕하세요!","스프링")
			return String.format(format,guest); //스프링,안녕하세요!
		}
		
}
