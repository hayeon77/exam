//게임 : 스타크래프트
//유닛(unit)

//unit 공통기능 (이동좌표 , 이동 , 멈춘다)
//unit 이동 방법은 다르다 (이동방법은 unit 마다 별도의 구현) ... 강제 ....
//abstact class 이름 {  abstract method 강제구현 }
abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	abstract void move(int x, int y); //추상자원
}

//Tank
class Tank extends Unit{
	@Override
	void move(int x ,int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동 : " + this.x + "," + this.y);

	}
	//Tank 특수한 기능(구체화)
	void changeMode() {
		System.out.println("탱크 변환 모드");
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 이동 : " + this.x + "," + this.y);
	}
	void stimpack() {
		System.out.println("스팀팩기능");
	}
	
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 이동 : " + this.x + "," + this.y);
	}
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
	
}


public class Ex02_abstract_class {

	public static void main(String[] args) {
	  Tank t = new Tank();
	  t.move(500, 200);
	  t.stop();
	  t.changeMode();
	  
	  Marine m = new Marine();
	  m.move(500, 300);
	  m.stop();
	  m.stimpack();
	  
	  //1.Quiz 탱크 3대를 만들고 [같은 좌표]로 이동 시키세요
	  //hint) 같은 타입 여러개(객체배열)
	  //Tank[] tanklist = new Tank[3];//{new Tank(), new Tank(), new Tank()};
	  //for(int i = 0 ; i < tanklist.length ; i++) {
	  //	  tanklist[i] = new Tank();
	  //}
	  Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
	  //for(Tank ta : tanklist) {
	  //  ta.move(100, 500);
	  //}
	  for(int i = 0 ; i < tanklist.length ; i++) {
		  tanklist[i].move(111, 222);
	  }
	  //2.여러개의 Unit(Tank , Marine , DropShip) [같은좌표]로 이동 시키세요
	  //hint) 전자제품 매장 구매하기 buy(Product n) >> Cart 구현  Product[] cart ...
	  //2개 푸시면 복습 .....
	  Unit[]  unitlist = {new Tank() , new Marine(), new DropShip()};
	  for(Unit unit2 : unitlist) {
		  unit2.move(1212, 3434);
	  }
	  
	}

}


