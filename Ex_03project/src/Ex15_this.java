//this
//1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정하고 사용)
//2. this 객체 자신(생성자를 호출) : 원칙 (생성자는 객체 생성시 1개만 호출)
//예외적으로 this 사용: 여러개의 생성자를 호출 가능
class Test6{
	int i;
	int j;
	//default 생성자 만들기
	Test6(){
		
	}
	//parameter변수명하고 instance 변수명을 다르게 사용
	//개발을 하다보니 (의미있는 변수명) >> 가독성 >> 유지보수...편하더라
	//변수를 명을 같이 쓰다보니...
	//int i; 앞으로 생성될 객체의 memberfield가 아니냐.. 미리 가져다 쓰자..
	//this 키워드>> Test6 t = new Test6();

	Test6(int i, int j){
		this.i=i;
		this.j=j;
		i=i; //
		j=j;
		
	}
}


/////////////////////////////
class soCar{
	String color;
	String gearType;
	int door;
	
	soCar(){
		this.color="red";
		this.gearType="auto";
        this.door=2;     
	}
	soCar(String color, String gearType, int door){
		this.color = color;
		this.gearType=gearType;
		this.door=door;
	}
	void print() {
		System.out.println(this.color+"/"+this.gearType+"/"+this.door);
	}
}

public class Ex15_this {

	public static void main(String[] args) {
	Test6 t6 = new Test6();
	Test6 t7 = new Test6(100, 200);
	System.out.println(t7.i+"/"+t7.j);
	
    soCar socar = new soCar();
    socar.print();
    
    soCar socar2 = new soCar("blue", "auto", 4);
	socar2.print();
	
	}

}
