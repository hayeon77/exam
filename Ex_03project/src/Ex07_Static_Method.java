//static함수는 많이 사용한다면 new하지 않고 편하게 쓰라고 쓰는 거임~!!!!!!!!!

class StaticClass{
int iv;

static int cv;

void m() { //일반함수
	 //1. iv 값을 처리할 수 있다. 
	iv=100;
	 //2. cv 값을 처리할 수 있다. 이건 생성시점
	//static 자원은 일반자원보다 먼저 memory에 올라간다.
	StaticClass.cv=1000;//cv=1000;
}

static void sm() { //static 함수
	//1. iv값을 처리할 수 없다.!!!!!!!! 왜냐하면, 생성시점에 대한 문제다. static자원은 일반자원보다 항상 메모리에 먼저 만들어지기 때문.
	//static은 static끼리 놀아라^^ 그러면 에러는 없을 거야~!
	//함수 입장에서 보면 iv는 메모리에 없어요
	
	//2. cv값을 처리할 수 있다.
	StaticClass.cv=2000;
}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		System.out.println(StaticClass.cv); //0
		
		StaticClass.sm();
		System.out.println(StaticClass.cv); //2000
		
		StaticClass sc = new StaticClass(); 
		sc.m();
		System.out.println(StaticClass.cv); //1000
	
		

	}

}
