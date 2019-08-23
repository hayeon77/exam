/*
생성자 함수(constructor)
1. 함수(특수한 목적의 함수)
2. 특수한 목적(member field 초기화)

 Tip) static >> static{}, 일반변수 >> {}
 
3. 일반함수와 다른점
3.1 함수의 이름 고정 (class 이름 동일)
3.2 실행시점 때문에 : return Type(0), void(x) > default void 생략
3.3 실행시점 객체생성시 호출되는 함수 

4. 목적 : 생성되는 객체마다 다른 초기값 부여하기
class Car {int door=5;}

5. 생성자 함수는 오버로딩이 가능하다


*************개발자의 의도
*예외적으로 overloading된 생성자 함수가 하나라도 존재한다면 컴파일러는 자동으로 default생성자 함수를 만들지 않는다.
*만약, default생성자 함수를 사용하고 싶다면 강제 구현하세요
why? 개발자의 강제적 의도가 들어있는 것
일반함수보다 코드량의 감소.....
 */
class Car {
	String name;
//Car(){} 명시하지 않으면 Compile러가 Car(){}있다고 생각하고 실행합니다.
}

class Car2 {
	String carname;

	Car2() { // default constructor (생성자)
		System.out.println("나 생성자 함수야^^");
		carname = "pony"; // member field 초기화 목적
	}
}

class Car3 {
	int number;

	Car3() {
		System.out.println("member field의 초기화");
		//number=10;
	}
}

//////////////////////
class Car4{
	int door;
	int wheel;
	
	Car4(){//default
		System.out.println("default");
		
	}
	//오버로딩이 가능
	Car4(int num){ //overloading (가능)
		door=num;
		System.out.println("overloading door"+door);
	}
	
	//오버로딩 가능
	Car4(int num, int num2){
		door=num;
		wheel=num2;
		System.out.println("overloading wheel"+wheel);
	}
}



class House2{
	String doorcolor;
	
	House2(){ //구현해라
		doorcolor = "yellow";
	}
	House2(String color){
		doorcolor = color;
	}
	}



public class Ex13_Constructor_Funtion {
	public static void main(String[] args) {
		Car c = new Car(); // Car() 함수를 호출
		Car2 c2 = new Car2();
		Car2 c22 = new Car2();
		
		Car4 car4 = new Car4(10, 50);

		House h = new House();
		
		House h2 = new House();
		
		House2 h3 = new House2();
		System.out.println(h3.doorcolor);

		House2 h4 = new House2("red");
		System.out.println(h4.doorcolor);
	}

}
