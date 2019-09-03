/*
추상 클래스 와  인터페이스(표준 ,약속 만정의 구현이 없다) 공통점
1.스스로 객체 생성이 불가능  (new 연산자 사용 불가)
2.상속 , 구현을 통해서만 사용가능 (메모리 적재 가능)
3.재정의 통한 강제적 구현 목적

추상클래스와 인터페이스의 다른점
1.인터페이스는 다중 구현이 가능  (하나의 클래스가 여러개의  인터페이스 사용가능)
2.추상클래스는 단일 상속이 완성 (계층적 상속)
3.추상클래스(완성된 코드 + 미완성(추상) 코드)
4.인터페이스 상수를 제외한 나머지는 미완성(추상) .. JDK 8 (Default , Static 구현)

*여러개의 약속을 합쳐서 큰 약속은 만들수 있다 (확장)
*인터페이스간에는 상속가능 (다중)
interface Ib{}
interface Ic{}
interface Id{}

interface If extends Ib, Ic, Id

*하나의 클래스가 여러개의 인터페이스 구현 가능
class Test extends Object implements Ia , Ib , Ic {
}

class Test implements Ia , Ib , IC {
}

**개발자 입장 **
*1. 인터페이스를 [다형성] 입장에서 접근 (인터페이스 부모타입)
*2. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능을 제공 (부모가 동일)

3. 인터페이스는 (~able ): 날수 있는 , 수리할 수 있는 (설계)
4. 객체간의 연결 고리 (객체의 소통 역활)
*/

interface Irepairable {} //수리할 수 있는 ...

class Unit2{
	int hitpoint; //에너지
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//지상유닛
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
	
}

//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp) {
		super(hp);
	}
	
}

class Tank2 extends GroundUnit implements Irepairable {
	Tank2(){
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}	
}


class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
	
}

class CommandCenter implements Irepairable {
	//다른 방식의 충전 ...
}

class Scv extends GroundUnit  implements Irepairable{
	
	Scv(){
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv 구체화 , 특수화 고유한기능
	//수리하다 (repair)
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint +=5;
		}
	}
	
	void repair(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint+=5;
		}
	}
	*/
	//Scv 가 repair Unit 증가되면 그 개수만큼  repair 함수 추가
	//고민은 : 하나의 함수(repair)가 다른 모든  Unit 을 수리할 수 없을까
	//다형성 : ..부모 자식  ... 부모타입 ....  상속관계
	//Unit2  <- GroundUnit <- Tank2 , Marine2(repair 대상(x))  , Scv 
	//void repair(Unit2 unit){} >> Marine2(repair 대상(x))
	//상속관계 부모타입 ... 해결 불가능 ...
	
	//Interface : interface Irepairable {}
	//*2. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능을 제공 (부모가 동일)
	//인터페이스도 하나의 데이터 타입이다 ^^
	//Tank2 extends GroundUnit implements Irepairable
	//CommandCenter implements Irepairable
	//Scv extends GroundUnit  implements Irepairable
	void repair(Irepairable repairunit) {
		//repairunit 변수는 객체의 주소 (Tnak2, CommandCenter , Scv 주소)
		//repairunit 부모타입 .... 자신의 것만 .... 자신의 것이 없어요 
		
		//repairunit >> Tank2 주소
		//downcasting -> Tank2 tank = (Tank2)repairunit  (상위 타입을 하위타입)
		
		
		//repairunit >> Scv 주소
		//downcasting -> Scv scv = (Scv)repairunit  (상위 타입을 하위타입)
		
		
		//repair 하는 대상이 CommandCenter 올수 있는데 (Unit 아닌다)
		//충전의 방식이 다르다
		
		
		//요약
		//Tank2 > GroundUnit > Unit2
		//Scv   > GroundUnit > Unit2
		//공통점 : Unit2
		
		//CommandCenter : Unit2 아니다
		//downcastring 불가
		
		//parameter 들어온 객체가 Unit2타입이냐  아니냐 
		//객체의 타입을 비교 (instanceof) >> true , false
		if(repairunit instanceof Unit2) {
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
		}else {
			//Unit2 부모가 아님
			//CommendCenter
			System.out.println("Unit2이 아니예요 다른 repair 입니다");
		}
	}
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전투
		tank.hitpoint -=20;
		System.out.println("탱크 :" + tank.hitpoint);
		System.out.println("scv 수리 요청");
		scv.repair(tank);
		System.out.println("수리완료 :" + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
		//scv.repair(marine); 컴파일도 안되요 

	}

}
