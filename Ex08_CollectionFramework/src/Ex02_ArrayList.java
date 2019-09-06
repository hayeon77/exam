import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//Today Point
public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		System.out.println(arraylist.toString());
		for(int i = 0; i < arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		
		//정적
		//int[] intarr = {10,20,30}
		//int[0] = 111;
		//{111,20,30}
		
		System.out.println("특정 방에 있는 값:" + arraylist.get(0));
		//add 순차적으로 데이터 넣기 
		//add overloading : 특정 위치에  데이터 넣기
		arraylist.add(0,111);
		System.out.println("특정 방에 있는 값:" + arraylist.get(0));
		System.out.println(arraylist.toString());
		//[111, 100, 200, 300]
		//비순차적인 데이터 추가 , 삭제  ArrayList 성능상 좋지 않아요 ....
		//순차적인 데이터 추가 삭제 (^^)
		
		//데이터 삽입 (add) : 중간간(위치) >> 모든 데이터 이동
		
		
		//add(index,element) , remove()
		
		//ArrayList 가지는 함수 공부 
		System.out.println(arraylist.contains(200));
		System.out.println(arraylist.contains(333));
		
		System.out.println(arraylist.isEmpty()); // 너 비어 있니 (true >> size == 0)
		arraylist.clear(); //size = 0
		System.out.println(arraylist.isEmpty()); // size == 0 
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		//삭제 (remove)
		System.out.println("삭제전 : " + arraylist.size());
		Object value = arraylist.remove(0); //0번째 방의 값을 삭제
		System.out.println("삭제된 데이터 : " + value);
		System.out.println(arraylist.toString());
		System.out.println("삭제후 : " + arraylist.size());
		
		//Today Point
		//일상다반사 ... 
		List li = new ArrayList();
		//li = new Vector();
		//ArrayList al = new ArrayList();
		
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li4 = li.subList(0,2); // new ArrayList() >> add("가") , add("나")
		//subList return 하는 것은 ArrayList 객체의 주소
		System.out.println(li4.toString());
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(45);
		alist.add(3);
		alist.add(15);
		
		//Arrays.sort(a); 정적배열을 도와 주는 보조클래스
		
		System.out.println("before : " + alist.toString());
		
		Collections.sort(alist);
		
		System.out.println("after : " + alist.toString());
	}

}
