import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Today Point
//HashMap generic 사용
//HashMap<k,v>
//HashMap<String , String>
//HashMap<String , Integer>
//HashMap<String , Emp>  //value 같으로 Emp 타입의 주소값 ...
//map.put("hong", new Emp()); **************

class Student{
	int kor=100;
	int math=80;
	int eng=20;
	String name;
	Student(String name) {
		this.name = name;
	}
			
}
public class Ex13_HashMap_Generic {
	public static void main(String[] args) {
		HashMap<String, Student> sts = new HashMap<String, Student>();
		sts.put("hong", new Student("홍길동"));
		sts.put("kim", new Student("김유신"));
		
		Student std = sts.get("hong");
		System.out.println(std.eng);
		System.out.println(std.math);
		
		//TIP 예외적으로
		//Map 안에 있는 key , value  모두 출력하고 싶어요
		Set set =  sts.entrySet();  //key+"="+value
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//value 가  Object 일때 (참고)
		//Map.Entry 으로 사용 : getKey(), getvalue() ...
		for(Map.Entry m : sts.entrySet()) {
			System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
		}
		
	}

}



