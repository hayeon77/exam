package kr.or.bit;

//공통 : 새는 날수 있다 , 새는 빠르다
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("i am flying");
	}
	//재정의를 해 주었으면 좋겠어 ....바램
	protected void moveFast() {
		fly();
	}
	
}
