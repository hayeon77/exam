import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kr.or.bit.ExceptionClass;

//클래스 설계시 내가 가지고 있는 자원을 사용하는 개발자에게 [강제]로 [예외처리]를 하도록 하는 방법
//생성자 뒤에  Test() throws 예외클래명1, 예외클래스2 , 예외클래스3
//함수 뒤에  void print() throws 예외클래명1, 예외클래스2 , 예외클래스3

public class Ex04_Exception {
	public static void main(String[] args) {
		ExceptionClass ec;
		try {
			ec = new ExceptionClass("hello");
			ec.call();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//JAVA API 에서 제공하는 자원 ...
		try {
			FileInputStream fi = new FileInputStream("C:\\temp\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
