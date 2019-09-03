
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		
		try {
				for(int i = 0 ; i < 10 ; i++) {
					result = num / (int)(Math.random()*10); //0
					System.out.println("result : " + result + " i:" + i);
				}
		}catch (ArithmeticException e) { //** 객체의 주소값 받는다 
			System.out.println("연산예외 발생  [관리자 메일보내기 ]");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e2) { //나머지 예외는 내가 처리 ...
			//Exception 문제없고 다 해결되요 ...
			//단 한가지 ... 가독성
		}
		System.out.println("Main 함수 종료 ...");
	}

	//연산관련 예외 객체 발생 : java.lang.ArithmeticException
	//예외가 발생하면 그 문제에 따른 객체를 생성한다 (new 하지 않아도 ....)
	//ArithmeticException aa = new ArithmeticException()
	//aa.setMessage("문제발생")
}
