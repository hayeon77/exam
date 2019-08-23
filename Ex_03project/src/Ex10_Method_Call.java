class Data{ //클래스==타입(큰타입)
	int i;
}


public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data d = new Data();
		Data q = new Data();
		
		d.i = 100;
		System.out.println("d.i:"+d.i);

		scall(d); //포인트임! d라는 변수는 주소값이 들어있음(참조값) Data라는 타입.
		System.out.println("d.i:"+d.i);
		
	    vcall(d.i);//1111
	    System.out.println("d.i:"+d.i);
	    
	}
	
	static void scall(Data data) { //void m(int i)
//data라는 변수는 Data라는 클래스의 주소값을 받으면 돼요
		//Data가 의미하는 것은 주소값
		System.out.println("함수:"+data.i);
		data.i=1111;
		
}
	
	
	static void vcall(int x) { //값전달
		System.out.println("before:"+x);
		x=8888;
		System.out.println("after:"+x);
		
	}
}
