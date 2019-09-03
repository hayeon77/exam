package kr.or.bit;
//디자인 패턴 (생성패턴) >> 객체를 만드는 것 
//singleton >> 객체 하나를 만들어서 공유 ....

//공유 : static 

//main
// Singleton single = new Singleton();

public class Singleton {
	private static Singleton p;
	private Singleton() { //객체 생성을 못하게 new 못하게...
		
	}
	public static Singleton getInstance() {
		if(p==null) {
			p=new Singleton(); //생성자 호출 객체...(public, private)
		}
		return p;
	}
}
