package kr.or.bit;

		public class Emp { //extends Object
			private int empno;
			private String ename;
			
			public Emp(int empno, String ename) {
				
				this.empno = empno;
				this.ename = ename;
			}


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

			
			//개발자 toString()...재정의
			//Object 가지고 있는 toString() 주소값을 출력
			//주소값 출력보다는 재정의 통해서  member field의 데이터 값 출력하는 것이^^
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
			
			
		


	}


