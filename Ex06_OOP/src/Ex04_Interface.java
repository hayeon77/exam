/*
인터페이스
범용적 의미
1. 표준, 규칙 ,규격 , 규약 만드는 행위
ex) 신발사이즈 , 나사 
ex) ISO 표준을 지키는 회사라면 ...

2. 소프트웨어 개발 
개발단계의 최상위 >> 요구사항 >> 설계(고려 인터페이스)
설계표준 -> 사용하는 이행 (수행) 강제 ...

Interface 
1. 실제 구현부가 없다 : 실행블럭이 없다 : 이동약속 : void move(int x, int y); >> 추상 메서드
2. 표준화된 설계를 보장 (완벽한 강제성)
3. 공통설계서 

JAVA API (개발자 필요한  인터페이스를 가지고 있다 : 인터페이스 기반으로 클래스 생성)
>> Collection (동적배열) > Vector , ArrayList , HashSet , HashMap
>> 작은 인터페이스를 여러개 모아서 사용 (재사용성)

1. 생성방법
상수(final) : public static final int VERSION=1 >> [public static final] 생략
함수(method) : public abstract void run(); >> void run(); >> [public abstract] 생략
함수(method) : String move(int x , int y); 
interface {
 int VERSION=1; //public static final int VERSION=1 
 void run(); //public abstract void run(); 
 String move(int x , int y);
}

인터페이스는 객체 생성 불가 (상수 제외한 나머지 자원 추상자원) >> JDK8 default static 제외하면
-구현을 통해서만 사용가능 class Test implements Ia
-인터페이스 끼리는 다중 상속 (interface Iable extends Ia , Ib , Ic
-**인터페이스도 타입이다 (다형성) >> 부모타입 (Today Point)**
*/

interface Ia1{
	//상수
	//public static final int AGE=100;
	int AGE=100;
	String GENDER="남";
	
	//public abstract String print();
	String print();
	void message(String str);
}

interface Ib1{
	int AGE=10;
	void info();
	String val(String s);
}

class Test21 extends Object implements Ia1, Ib1{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Test21 t = new Test21();
		Ia1 ia = t;
		System.out.println(ia.AGE);
		Ib1 ib = t;
		System.out.println(ib.AGE);

	}

}
