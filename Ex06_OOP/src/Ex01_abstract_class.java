/*
추상클래스 
미완성 클래스 (설계도)
1. 완성된 코드+ 미완성 코드
2. 완성(함수) 실행블럭 있는 것 + 미완성(함수) 실행블럭이 없는 것 public void print(); (x){}
3. 완성과 미완성의 차이(new 객체 (완성), new 객체를 만들지 못하는 건(미완성)

정리)
1. 추상(미완성)클래스는 스스로 객체 생성 불가능(new 사용 불가)
2. 추상클래스는 결국 완성된 클래스로 만들어서 사용하는게 목적 -> 상속을 목적으로
3. 상속관계에서 미완성된 자원(추상자원) 완성해라 (구현) -> 재정의(override)

why) 추상클래스 >> 설계자가 바라보는 진정한 의미 >> 강제적 구현을 목적으로...(재정의 강제)
 */

abstract class Abclass {
	int pos;

	void run() {
		pos++;
	}

	// 완성된 코드
	abstract void stop(); // 추상자원 { 실행블럭이 없다}
}

//추상클래스는 반드시 상속을 통해서만 완성자원이 될 수 있다
class Child extends Abclass {

	@Override
	void stop() {
		this.pos=0;
		System.out.println("stop:" + this.pos);

	}

}

public class Ex01_abstract_class {
	public static void main(String[] args) {
//Abclass ab = new Abclass();
		Child ch = new Child();
		ch.run();
		ch.run();
		System.out.println("현재 pos:"+ch.pos);
		ch.stop();
		
		//다형성 개념
		Abclass ab = ch; //Abclass 부모타입
		ab.run();
		ab.stop(); //접근은 부모의 stop으로 가지만, 재정의 되어 있다면 자식의 stop 호출
		
	}

}
