/*
Today Point : [상속관계]에서 override : 상속관계에서 메서드 [재정의]
-[상속관계]에서 [자식]클래스가 [부모]클래스의[메서드]를 재정의(내용바꿈)
재정의 의미: 틀의 변환(함수의 이름 , 리턴 타입)의 변화가 아니라 { 내용의  변화 }
문법)
1. 부모함수 이름 동일
2. 부모함수 parameter 동일
3. 부모함수 return type 동일
4. 결국에는 { 괄호안에 있는 내용만 수정해라 }
*/
class Point2{
	int x = 4;
	int y = 5;
	String getPosition() {
		return "x:" + this.x  + " y:" + this.y;
	}
}
class Point3D extends Point2{
	//int x;
	//int y; //상속관계 부모가지는 x , y
	int z =6;
	//String xyzPosition() { } 부모가 출력하는 함수 가지고 ... 이름 마음에 들어요

	//Annotation은 Java code만으로 전달할 수 없는 [부가적인 정보]를 [컴파일러]나 [개발툴]로 전달할 수 있다.
	//@Override >> Annotation >> 재정의 검사하는 기능
	@Override
	String getPosition() {
		return "x:" + this.x  + " y:" + this.y + " z:" + this.z;
	}
	
	//부모의 함수와 틀이 똑같아요 >> 내용만 틀려요 
	//재정의 
	//String getPosition() {
	//	return "x:" + this.x  + " y:" + this.y + " z:" + this.z;
	//}

}

public class Ex04_Inherit_override {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println(p3.getPosition());

	}

}
