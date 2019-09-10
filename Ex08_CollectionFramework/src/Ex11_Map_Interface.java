import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스
 Map > (키, 값) 쌍의 구조를 갖는 배열
 ex) 지역번호: (02, 서울)
 key : 중복(x)
 value : 중복(o)
 
 Generic 형식 지원
 
 HashTable(구)(동기화 보장)
 HashMap(신) : 동기화를 보장하지 않는다.(강제x) : 성능척 측면을 더 고려함
 현재는 동기화 고민x >>Thread쓰지 않으면>> 단일 >> 동기화가 의미없다
 
 */

public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1007");

		// Collection 데이터 가질 수 있다 >> 프로그램이 실행되는동안
		// 휘발성 메모리 >> 프로그램 종료>> 데이터 보존(파일 기반) >> 사원.txt, 회원.xtx
		// 파일 데이터 다루기 힘들다>>RDBMS(관계형 DB)

		System.out.println(map.containsKey("tiger")); // 대소문자 구분 false
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));

		// (key, value)
		// 결국 key값을 가지고 value값을 얻어낸다
		System.out.println(map.get("Tiger"));

		Object returnvalue = map.remove("superman");
		System.out.println(returnvalue);
		System.out.println("size:" + map.size());
		System.out.println(map.toString());

		//
		Set set = map.keySet(); // Set 구현한 HashSet...생성 데이터 넣고 그 주소를 리턴
		// 중복(x), 순서(x)
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//map value값들을 출력하세요
		//map.values() 함수 사용
		Collection vlist = map.values();
		System.out.println(vlist.toString());
		
	}

}
