import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection Framework
//나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준 정의
//Iterator 인터페이스
//1. hasNext() , Next() ...구현해
//2. Iterator : 순방향 데이터 read 보장 
//3. ListIterator : 양방향 데이터 read 보장 표준화
//쓰지 않아도 데이터 조회 가능 .... [표준화] 고민 ?

public class Ex08_Collection_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("[" + list.get(i)   +"]");
		}
		//표준화 된 형식의  나열된 데이터 출력하기
		//Iterator 인터페이스
		//Collection { Iterator iterator(); //추상함수 }
		//List extends Collection
		//ArrayList implements List
		//ArrayList iterator()를 구현(강제) ....   {실행블럭 코드 구현}
		//부모타입인 Iterator 통해서 ArrayList가 구현한 메모리에 접근
	    Iterator it =list.iterator();
	    while(it.hasNext()) { //hasNext  (ArrayList 구현_
	    	System.out.println(it.next()); //next  (ArrayList 구현 _
	    }
	    //int data = 100;
	    //int 의 참조형식 >> Integer 클래스 
	    ArrayList<Integer> intlist =  new ArrayList<Integer>();
	    intlist.add(44);
	    intlist.add(55);
	    intlist.add(66);
	    
	    Iterator<Integer> list2 = intlist.iterator();
	    while(list2.hasNext()) {
	    	System.out.println(list2.next());
	    }
	    
	    //for(int i = 0 ; i < list.size() ; i++) {
		//System.out.println("[" + list.get(i)   +"]");
	    //}
	    
	    //역방향 (for)
	    for(int i = intlist.size()-1 ; i >= 0 ; i--) {
	    	System.out.println(intlist.get(i));
	    }
	    
	    //Iterator 순반향 조회만 가능 (역방향 (x))
	    
	    
	    //순방향 조회 >> 그 다음 역방향 조회
	    //바로 역방향 조회는 불가능
	    ListIterator<Integer> li2 = intlist.listIterator();
	    
	    //순방향 
	    while(li2.hasNext()) {
	    	System.out.println(li2.next());
	    }
	    
	    //역방향
	    while(li2.hasPrevious()) {
	    	System.out.println("[" +  li2.previous() + "]");
	    }
	    
	}

}
