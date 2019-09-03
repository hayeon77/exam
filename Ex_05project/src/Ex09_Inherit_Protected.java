

import kr.or.bit.Bird;

//protected 접근자 상속관계 사용
//사용목적 : 상속관계에서 재정의 ....
//당신이 재정의를 해 주었으면 좋겠어(의도 숨어 있다)

//새  공통사항
class Ostrich extends Bird{
  //구체화 특수화 표현
	void run() {
		System.out.println("달린다^^");
	}

	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.moveFast();
		

	}

}
