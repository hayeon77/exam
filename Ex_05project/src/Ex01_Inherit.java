

/*상속관계에서 메모리 순서는
할아버지>>아버지>>자식 순으로 힙메모리

사용자가 만드는 모든 클래스는 default Object를 상속
class Child extends Object, Father(x)

*/
class GrandFather{
	public GrandFather() {
		System.out.println("할아버지 생성자");
	}
	public int gmoney=5000;
	private int pmoney=10000;   //private상속 접근 불가
}

class Father extends GrandFather{
	public Father() {
		System.out.println("아버지 생성자");
	}
	public int fmoney=1000;
}
class Child extends Father{
	public Child() {
		System.out.println("자식 생성자");
	}
	public int cmoney=100;
}
public class Ex01_Inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); //할아버지 돈 내돈
		System.out.println(child.fmoney); //아버지돈 내돈
		System.out.println(child.cmoney); //내돈도 내돈
		//System.out.println(child.pmoney);

	}

}
