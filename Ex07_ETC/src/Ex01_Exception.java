//오류
//1. 에러(error) : 네트워크장애, 메모리, 하드웨어(개발자 코드적으로 해결 불능)
//2. 예외(Exception) : 개발자의 코드 처리 문제(로직 문제...> 예측 가능)
//예외가 발생하면 프로그램 강제적 종료...
//예외처리 가능 : 프로그램을 정상적으로 수정하는 것이 아니고 문제 발생시 비정상적인 종료 못하게 하는 것
//정말로 예외 발생 : 코드 수정 해야 합니다...
/*
  try{
  문제가 될 수 있는 코드(불안한 코드)
  }catch(Exception){ //e parameter가 문제 원인의 객체를 참조...
    처리(문제가 발생했구나... 이런 문제구나 인지)
    ..관리자에게 메일.... 처리 코드 열어서 그 별도의 수정해야 한다..
    ..log 파일....
  }finally{
  문제가 발생하든, 하지 않든 강제적으로 수행해야하는 구문
  DB연결 닫기
  **강제적인 함수 종료:ㅣ return 사용해도... finally실행
 */
public class Ex01_Exception {
      public static void main(String[] args) {
    	  System.out.println("Main Start");
    	  System.out.println("Main Logic 처리");
    	  try { 
    		  System.out.println(0/0); //이 코드는 개발자 최종적으로 수정해야 한다...
    	  }catch(Exception e) {
    		  System.out.println(e.getMessage());
    	  }
    	
    	  //Exception in thread "main" java.lang.ArithmeticException: / by zero
    	  //자바는 (runtime) 실행시 예외가 발생 >> 문제에 해당하는 예외 클래스를 자동 생성 >> 
    	  // java.lang.ArithmeticException
    	  
    	  System.out.println("Main End");
		

	}

}
