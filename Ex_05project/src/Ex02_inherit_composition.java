/*
설계도 1개만 만드는 것은....
업무가 단순하지 않기 ....
>>한 개 이상의  설계도를 생산 ...
** 기준점 ** (여러개의 설계도를 [관계]를 맺어주는 것)
상속관계(is ~ a : 상속) 은 ~ 이다 (부모를 뒤에) 

포함관계(has ~ a :포함) 은 ~ 가지고 있다

원클래스 , 도형클래스 
>>원 extends 도형  (상속관계)

원클래스 , 점클래스 
>>원은 점이다 (x)
>>원은 점을 가지고 있다 (has ~ a)(포함관계)
>>class 원 { 점 변수명; } >>객체를 멤버필드 

경찰    총
경찰은 총이다 (x)
경찰은 권총을 가지고 있다(0) 포함관계
class 경찰 { 권총 변수; }
------------------------------------
 예를 들면
 원 , 삼각형 , 사각형을 만드는 설계도를 작성
 
 원은도형이다 
 삼각형은 도형이다
 사각형은 도형이다
 
 도형 : 추상화 , 일반화 (색상 , 그리다 ) >> 공통자원
 원 : 구체화 ,특수화 -> 반지름 , 점   >> 본인만이 가지고 있는 것 

점 : 좌표값 (x,y)
원은 점을 가지고 있다
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다

 일반화(공통 , 추상) : shape(그리다 , 색상) ,  point(점)
class Shape{} // 상속
class Point{} // 포함

구체화 특수화 : circle , triangle

*/
//추상화,일반화 (공통)
class Shape{
	 String color="gold"; //공통속성
	 void draw() { //공통기능
		  System.out.println("그리다");
	 }
}
//추상화,일반화 (공통)
class Point{
	int x;
	int y;
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1); //point
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}
//원을 만드세요 (정의 : 한점과 반지름을 가지고 있다)
//원은 도형이다(is ~ a) : 도형 (shape)
//원은 점을 가지고 있다(has ~ a) : 점(point)
//원의 특수성 반지름(r)

//원의 반지름은 default 값으로 10을 가진다,
//점의  x , y 좌표는 default 로 (10,15)
//기본값의 설정을 원하지 않으면 반지름과 점의 값을 입력할 수 있다(원이 만들어 질때)
class Circle extends Shape{ //상속관계
	int r; //반지름
	Point center; // 포함관계(member field)
	
	Circle() {
		//this.r = 10;
		//this.center = new Point(10, 15);
		this(10,new Point(10,15));
	}
	Circle(int r , Point center){ //Point 객체의 주소값을 받겠다
		this.r = r;
		this.center = center;
	}
	//Circle c = new Circle();
	//Circle c2 = new Circle(4,new Point(5,6));
}

//문제 1)
//삼각형 클래스를 만드세요
//정의) 삼각형은 3개의 점과 색과  그리고 그리다라는 기능을 가지고 있다
//Shape, point 제공 받아요
//hint) (x,y)  (x,y)  (x,y) 3개의 좌표값 
//default 로 그릴 수 있고 , 3개의 좌표값을 받아서 그릴 수 있다

class Triangle extends Shape {
	Point x;
	Point y;
	Point z;
	
	Triangle(){
		x = new Point(10,20); //주소값
		y = new Point(30,40);
		z = new Point(40,50);
		//this(new Point(10,20), new Point(30,40) , new Point(40, 50));
	}
	Triangle(Point x, Point y , Point z){
		this.x = x; //주소값
		this.y = y;
		this.z = z;
	}
	//추가적으로 기능
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x , x.y);
		System.out.printf("y : (%d,%d)\t",y.x , y.y);
		System.out.printf("z : (%d,%d)\t",z.x , z.y);
	}
	
}


public class Ex02_inherit_composition {

	public static void main(String[] args) {
		/*
		Circle circle = new Circle();
		circle.r = 5;
		circle.center = new Point();
		circle.draw();
		*/
		Circle c = new Circle(); //기본원
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x); //POINT 주소값.주소값.값
		System.out.println(c.center.y);
		
		Circle c2 = new Circle(3, new Point(12, 24));
		
		
		/////////////////
		Triangle tri = new Triangle();
		tri.trianglePoint();
		System.out.println();
		System.out.println("삼각형의 색상:"+tri.color);
		tri.draw();
	}

}




