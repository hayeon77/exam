//자바에서 다형성 상속관계 ....

class Pbase{
   int p = 100;	
}
class Cbase extends Pbase{
   int c = 200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//다형성 : 부모타입의 참조변수가 자식타입의 주소값을 가질 수 있다(상속관계)
		//단, 

	}

}
