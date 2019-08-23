package kr.or.bit;





/*
 함수(method): 기능, 행위의 최소 단위
 ex) 먹다, 걷는다, 잔다...
 
 클래스의 구성요소: 필드+생성자+함수
 
 ex)게임방 : 게임기(동전넣는) 1번
    인형뽑기(동전넣고...무조건 반환) 3번
 
  함수의종류(4가지)
  1. void, parameter(0) : void print(String str) {실행코드}
  2. void, parameter(x) : void print() {실행코드}
  3. return Type, parameter(0) : int print(int data) {return 100}
  4. return Type, parameter(x) : int print() {return 200}
  
  *void (돌려주는 것이 없다) : return value가 없다~
  *return Type : {[8가지 기본 타입] + String + 참조(객체의 주소)} + Array + Collection + Interface
  **return Type 있으면 반드시 {블럭안에는 return 키워드 존재해야 한다}
  *parameter(인자, 인수) : 동전구멍(100원짜리, 1000원짜리 지폐), 동전구멍 여러개
  
  함수는 반드시 호출(Call)되어야만 실행된다 : 누군가그의 이름을 불러주었을때......
  
 */
public class ex03_method {
    public int data;
    
    public void m() { //함수의 이름이나 변수의 이름은 의미있는 단어의 조합
	System.out.println("일반함수:void, parameter(x)");
		
	}
    
    
    public void m2(int i) {
    	System.out.println("parameter value (scope 함수내부:" +i);
    	System.out.println("일반함수:void, parameter(0)");
    }
    
    public int m3() {
    	return 100; 
    }
    
    public int m4(int data) {
    return data +1;    
    }
    
    //확장(parameter 개수의 변화)
    public int sum(int i, int j, int k) {
		return k;
    	
    }
}
