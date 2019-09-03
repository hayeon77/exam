/*
this: 객체 자신을 가르키는  this (this.empno , this.age)
this: 생성자를 호출하는  this ( this(100,"홍길동"))

상속
부모  : 자식
super(자식입장에 보는 [부모의 주소]) : 상속관계에서 부모 자원 접근 
this 동일

super
1.상속관계에서 부모자원 접근
2.상속관계에서 부모자원의 생성자 명시적으로 호출

TIP) C# >> base()
*/

class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 호출");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void baseMethod() {
		System.out.println("baseMethod()");
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 호출");
	}
	Derived(String dname){
		//super
		super(dname);
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	void derivedMethod() {
		System.out.println("derivedMethod()");
		
	}
	//부모가 가지는  baseMethod() 재정의 (override)
	@Override
	void baseMethod() {
		//안쪽은 내마음대로
		System.out.println("부모 함수를 재정의 ......");
	}
	
	//어느날 부모님 자원이 그리워요 ....재정의 (x)
	//유일한 방법 : super 사용 (자식 클래스 내부)
	void p_method() {
		//super 부모 객체의 주소
		//부모가 가진 자원에 접근
		super.baseMethod(); //부모함수 호출
	}
}

public class Ex06_Inherit_super {
	public static void main(String[] args) {
		
		//Derived d = new Derived();
		//d.baseMethod();
		//d.derivedMethod();

		Derived d2 = new Derived("홍길동");
		//부모쪽에도  내가 처리하는 홍길동  넘겨서   overloading 된 생성자 호출..
		d2.baseMethod(); //재정의 한 함수만 호출
		
		//어느날 부모님 자원이 그리워요 ....재정의 (x)
		//유일한 방법 : super 사용 (자식 클래스 내부)
		d2.p_method();
	}

}
