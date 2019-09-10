import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {
	public static void main(String[] args) {
		// Set (순서유지 (x) , 중복(x))
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs.toString());

		// HashSet 확장 > LinkedHashSet(순서유지) >> Linked(주소) >> node
		// 넣은 순서를 보장(Array(x))
		Set<String> hs2 = new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println(hs2.toString());

		// TreeSet
		// 자료구조(순서x), 중복데이터x, 정렬o
		// 검색하거나 정렬을 필요로 하는 자료구조...
		// 1. 저장된 데이터의 값에 따라서 정렬되어있음
		// 2. 원리 : 이진트리 원리(데이터 검색 용이)

		// TreeSet를 사용해서 로또를 구현
		// 1~45난수>6개>중복(x)>정렬(0)
		Set<Integer> lotto = new TreeSet<Integer>();
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add((int) (Math.random() * 45) + 1);
		}

		Iterator<Integer> lo = lotto.iterator();
		while (lo.hasNext()) {
			System.out.println(lo.next());
		}
	}

}
