//다형성(상속관계에서)
//다형성 : 여러가지 성질(형태)를 가질 수 있는 능력
//C# : 다형성안에  overloading , override  포함

//JAVA : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다
//단 하나의 참조변수는 [부모타입]이어야 한다
//부모클래스 타입의 참조변수로 여러개의 자식클래스 객체를 참조 가능 하다

//Java : 자식은 부모에게 조건없이 드린다 (현실세계와 반대)
class Tv2{ //부모 (일반화 , 추상화) 공통자원을 가지고 있다
	boolean power;
	int ch;
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2{ //CapTv  특수화 , 구체화 , 고유한 구현
	String text;
	String caption() {
		return this.text ="현재 자막 처리 중....";
	}
}
//class ComTv extends Tv2{}
public class Ex10_inherit_Poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("전원: " + tv.power);
		tv.chUp();
		System.out.println("채널정보 : " + tv.ch);
		System.out.println("자막처리 : " + tv.caption());
		//기존에 배운 내용
		
		Tv2 tv2 = tv; //tv2 변수에   CapTv 타입의 주소값을 할당 ...
		//Tv2 타입은  Captv 부모타입 
		//******부모타입은 자식타입의 주소를 가질 수있다 *********
		//Tv2 tv3 = new Tv2(); 방법이 아니고 있는 메모리 그대로 사용 ...
		//부모는 자신타입의 객체만 볼 수 있다
		
		//Tv2 tv2 = new .....
		System.out.println("주소값 : " + tv.toString());
		System.out.println("주소값 : " + tv2.toString());
	}

}
