import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {
		//Array
		//사원 1명을 만드세요
		 Emp emp = new Emp(100,"김유신","군인");
		 System.out.println(emp.toString());
		 
		//Array (정적배열)
		//사원 2명을 생성하세요
		 Emp[] emplist = {new Emp(10,"김씨","IT"), new Emp(20,"박씨","SALES")};
		 for(Emp e : emplist) {
			 System.out.println(e.toString());
		 }
		//위 코드 진행 안되시면 ... 주말 복습 ... 
		//Collection 처리
		//ArrayList 를 사용해서 사원2명을 만드세요 (회사에 사원 2명 입사)
		ArrayList ecompany = new ArrayList();
		ecompany.add(new Emp(1,"김","IT"));
		ecompany.add(new Emp(2,"박","SALES"));
		System.out.println(ecompany.toString());
		//[xx번지.toString() , yy번지.toString()]
		System.out.println(ecompany.get(0).toString());
		
		//for문을 사용해서 사원데이터 출력 (toString() 사용금지)
		//개선된 for문 말고 일반 for문 사용해서 출력
		for(int i = 0 ; i < ecompany.size() ; i++) {
			//System.out.println(ecompany.get(i));
			//Object obj = ecompany.get(i);
			//System.out.println(obj);
			
			//getter를 사용해서 출력
			Emp e = (Emp)ecompany.get(i);
			System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
		}
       //개선된 for문
		//왕짜증....캐스팅(다운).......타입...
		for(Object obj : ecompany) {
			Emp m = (Emp)obj;
			System.out.println(m.getEmpno()+"/"+m.getEname()+"/"+m.getJob());
		}
		
		//Object 불편해...generic
		ArrayList<Emp> elist2=new ArrayList<Emp>();
		elist2.add(new Emp(1,"A","IT"));
		elist2.add(new Emp(2,"B","SALES"));
		
		for(Emp em : elist2) {
			System.out.println(em.getEmpno()+"/"+em.getEname()+"/"+em.getJob());
		}
		 
	}

}







