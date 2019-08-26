package kr.or.bit;


//설계도 >> new 한다면 >> 데이터를 담는 것이 목적 (dto , vo , domain)
public class emp {
	private int empno;
	private String ename;
	
	public emp() { //생성자(default constructor) //member field 초기화
		
	}
	public emp(int empno , String ename) { //overloading  constructor //편리성
		this.empno = empno;
		this.ename = ename;
	}
	
	//필요하다면   setter , getter 자동 생성
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//기능 (정보출력)
	public void empInfoPrint() {
		System.out.println(this.empno + " / " + this.ename);
	}
	
}