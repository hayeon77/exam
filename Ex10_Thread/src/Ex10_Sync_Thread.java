//동기화
//한강 고수부지 화장실(공유자원) : 여러명의 사용자(10명) : Thread 10개
//잠금장치(lock)
//함수단위 lock 

//반대
//한강 비빕밥 축제(공유자원) 동시접근 가능

class Wroom{
	synchronized void openDoor(String name) {
		System.out.println(name+ "님 화장실 입장 ^^");
		for(int i= 0 ; i < 100 ; i++) {
			System.out.println(name + "사용: " + i);
			if(i == 10) {
				System.out.println(name + "님 끙 !!");
			}
		}
		System.out.println("시원하다 ^^!");
	}
}

class User extends Thread{
	Wroom wr;
	String who;
	
	User(String name, Wroom w){
		this.who = name;
		this.wr = w;
	}
	
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}


public class Ex10_Sync_Thread {

	public static void main(String[] args) {
		//한강둔치
		Wroom w = new Wroom();
		
		//사람들
		User kim = new User("김씨", w);
		User Lee = new User("이씨", w);
		User Park = new User("박씨", w);
		//배가아파요
		kim.start();
		Lee.start();
		Park.start();
		
	}

}
