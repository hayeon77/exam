package kr.or.bit;

import java.io.IOException;

public class ExceptionClass {
	public ExceptionClass(String path) throws IOException {
		
	}
	public void call() throws ArithmeticException , IndexOutOfBoundsException {
		System.out.println("call 함수  start");
		int i = 0/0;
		System.out.println("call 함수 end");
	}
}
