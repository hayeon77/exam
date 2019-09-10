import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set 인터페이스 구현 
//Set 순서(x) , 중복(x) 데이터 집합 ..
//HashSet , TreeSet
public class Ex09_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println("bo2 :" + bo2);
		System.out.println(hs.toString());
		boolean bo = hs.add(1);//데이터 추가 안되요 ...(같은) 보장 ..
		System.out.println(bo);//false (기존에 같은 데이터 있어)
		hs.add(2);
		System.out.println(hs.toString());
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2.toString());
		
		//1.중복데이터 (x)
		String[] obj = {"A","B","A","C","D","B","A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0 ; i < obj.length ; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		//Quiz
		//HashSet 사용해서 1~45까지 난수 6개를 넣으세요
		//단 중복값이 있으면 안되요
		//(int)(Math.random() * 45) + 1
		Set set = new HashSet();
		System.out.println(set.size());
		for(int i = 0 ; set.size() < 6 ; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set.toString());
		
		//while 전환
		Set set2 = new HashSet();
		int index=0;
		while(set2.size()< 6) {
			System.out.println("index :" + (++index));
			int num = (int)(Math.random() * 45) + 1;
			set2.add(num);
		}
		
		/*
		for(int i = 0 ; i < 6 ; i++) {
			numbers[i] = r.nextInt(45) +1; 
			 for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
				 if(numbers[i] == numbers[j]) {
					 i--; //point 같은 방의 값을 바꾸어여 한다
					 break;
				 }
			 }
		}
		*/
		HashSet<String> set3 = new HashSet<String>();
		
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3.toString()); //요런 데이터가 있구나 
		
		Iterator<String> s = set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		} //순서를 보장하지 않아요 ....
		
		//Collections.sort(List<T> list); //Parameter 로는 List 인터페이스 를 구현하는 객체의 주소
		//Vector , Stack , ArrayList  >> Array [][][][]
		//HashSet >> (x)
		//Collections.reverse(List<T> list);
		
		//Set 집합안에 있는 데이터 순서를 주고 싶어요 
		//1. 저장구조 >> Array
		List list = new ArrayList(set3);
		System.out.println("before  무작위 : " + list.toString());
		Collections.sort(list);
		System.out.println("after   정렬 : " + list.toString());
		Collections.reverse(list);
		System.out.println("reverse   정렬 : " + list.toString());
		
		
		
		
	}

}



