/*
객체지향언어
1. 상속 (재사용성)
2. 캡슐화(private) -> 함수(read, write): 간접할당(자원보호) -> 캡슐화된 member field
   read(get) write(set) 전용함수--> setter, getter-> 약속 getEmpno, setEmpno
3. 다형성 
[다형성 하는 녀석 한 부분....]

[method overloading]
하나의 이름으로 여러가지 기능을 하는 함수
사용: System.out.println()
특징: 오버로딩은 성능 향상에 도움을 준다(x)
     why> 그냥 편리함을 위함. >>함수의 활용이 많은 경우(다양한 파라미터 사용)
     static함수>>
문법: 함수의 이름은 같고 parameter의 개수와 타일을 달리하는 방법
1. 함수의 이름은 같아야 한다.
2. [parameter]개수 또는 [Type]은 달라야 한다.
3. return type overloading 판단 기준(x)
4. parameter 순서가 다름을 인정한다
     
 

 */

class Human{ //설계도==타입 사용방법 > new 통한 객체 생성
	String name;
	int age;
	
}


class OverTest{
	void add(Human h) { //개수는 같지만 타입이 다르기 때문에 오버로딩
	h.name="홍길동";	                //Human 객체의 주소값을 받을 수 있다>>h
	h.age=100;
	System.out.println("h의 주소값:"+h);
	}

	int add1 (int i) {
		return 100+i;
	}
	String add(String s) {
		return "hello"+s;
	}
	
	int add(int i, int j) {
		return i+j;
	}
	
	void add(int i, String s) {
		System.out.println("오버로딩"+i+"/"+s);
	}
	void add(String s, int i) {//순서가 다름을 인정합니다
		System.out.println("parameter 순서가 다름은 인정");
	}
	/* 충돌
	  
	 */
    int add(int s) {
    	return 200+s;
    }
}
public class Ex11_Method_overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		ot.add1(100);
		String str= ot.add("홍길동");
		System.out.println(str);
	
		//1.
	   Human m =new Human(); //m은 human
	   System.out.println("m의 주소값:"+m);
	   ot.add(m);
	   //2.
	   ot.add(new Human());//heap에 생성된 주소 바로 전달
	   
	}
}

