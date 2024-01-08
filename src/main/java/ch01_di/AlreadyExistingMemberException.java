package ch01_di;

public class AlreadyExistingMemberException extends RuntimeException  {
	AlreadyExistingMemberException(String msg) {
		super(msg);
	}
}
