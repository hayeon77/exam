import java.util.Vector;

/*
CollectionFramework
[다수의 데이터를] 다루는 표준화된 인터페이스를 구현하고 있는 클래스집합

Collection 인터페이스 <- List(상속) <---- 구현 ArrayList(*) ...
                   <- Set(상속) <----  구현 HashSet , TreeSet ...
Map 인터페이스 (key ,value) <---- HashMap(*)
--------------------------------------------------------------
List interface (줄을 서시오)
:순서(번호표) , 중복(0) >> 내부적으로 데이터(자료,객체) 배열관리 -> Array [0][1][2]

1. Vector (구버전) -> 동기화(멀티쓰레드)-> lock (보호) : 한강 화장실
2. ArrayList (신버전) -> 동기화(멀티쓰레드) -> lock(x) -> 필요에 따라(lock) -> 성능  : 한강 비빕밥 

Array (배열)
방의 개수가 고정(한번 방의 크기를 정하면 변경 불가)
int[] arr = new int[10]
int[] arr = {10,20,30}                  

Array (고정)
1. 배열의 크기가 고정 : Car[] cars = {new Car() , new Car()} : 방2개
2. 접근 방법: index(첨자) 접근 >> cars[0] .... cars[0].color = "red"
3. 초기 설정한 크기 변경 불가 

List 인터페이스를 구현한 클래스  >> Vector , ArrayList
1. 배열의 크기를 동적으로 확장, 축소가 가능 >> 배열의 재할당(^^)
2. 순서를 유지(Array) , 순서(index) , 중복값 허용
3. 데이터 저장 공간 (Array)
4. List 인터페이스 구현하는 클래스는  (new 통해서 객체 생성 사용)
5. 구현한 클래스의 데이터 저장 공간의 타입 : int[] list = new int[10] , Emp[] elist ={}
   default Type : Object 타입 >> 최상위 타입 >> 장점 >> [모든 타입]을 데이터로 사용가능
   >>Object[] obj = new Object[10];>> obj[0]=10 , obj[1]= new Car() ,
   >>단점 (타입 체크 ... casting) >> 해결 (Object 타입 단점 극복) >> 제너릭(generic) 타입 
   >>제너릭(generic) : 타입을 강제해서 하나의 타입 처리 .....
*/
class Car {
}

public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량:" + v.capacity());// 10개의 방
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);
		System.out.println(v);
		System.out.println(v.toString());

		// Array >> 개수 >>length
		// for intarr[i]

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		// 개선된 for문
		for (Object obj : v) {
			System.out.println(obj);

			// 제너릭>>타입을 강제
			Vector<String> v2 = new Vector<String>();
			v2.add("Hello");
			v2.add("World");
			v2.add("king");
			for (String str : v2) {
				System.out.println(str);
			}
			System.out.println(v2.toString());
			System.out.println(v2.get(2));
			System.out.println("size(데이터 개수) :" + v.size());
			System.out.println("Capacity: " + v2.capacity());

			Vector v3 = new Vector();
			System.out.println(v3.capacity());
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			v3.add("A");
			System.out.println("capacity" + v3.capacity());
			v3.add("A");
			System.out.println("size" + v3.size());
			System.out.println("capacity" + v3.capacity());

		}
	}
}
