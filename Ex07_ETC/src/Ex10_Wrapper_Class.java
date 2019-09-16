import java.util.ArrayList;

/*
 8가지 기본 타입 제공(값타입) : java API 제공
 
 8가지 기본 타입에 대해서 객체 형태로 사용가능하도록 만든 것 (wrapper class)
 
 기본타입 때로는 객체형태로 다루어져야 하는 경우
 1. 매개변수로 객체가 요구될 때
 2. 기본형 값이 아닌 객체로 저장되어야 할 때
 3. 객체간의 비교가 필요할 때
 이 때 wrapper class 사용
 */
public class Ex10_Wrapper_Class {

	public static void main(String[] args) {
		// Integer.parseInt(s)
		ArrayList<Integer> li = new ArrayList<Integer>();
		int i = 100;

		Integer n = new Integer(500);
		System.out.println("n:" + n.toString()); // n의 주소값이 나와야하지만 ...Integer 오버라이딩 되면서 재정의
//Integer 내부에서 toString 재정의(값이 출력되도록)

		// POINT(활용도)
		// 1. parameter로 값타입이 객체로 사용될 때
		// 2. generic 사용시

		ArrayList<Integer> li1 = new ArrayList<Integer>();
		li1.add(100);
		li1.add(200);
		for (int value : li1) {
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //연산자 주소값을 비교 (따라서 값은 같아도 false가 나옴)
		
		System.out.println(i2.equals(i3));
		//Object 가지는 equals   Integer클래스 재정의(실제값을)
		//100==100
		
		Integer t = new Integer(500);
		integerMethod(t); //t라는 참조변수의 주소값
		intMethod(t); //t라는 참조변수가 가지는 값 500
		
	}
	static void integerMethod(Integer i) {
		System.out.println("integer param:"+i);
		
	}
	static void intMethod(int i) {
		System.out.println("int param:"+i);
		i=1000;
		
	}

}
