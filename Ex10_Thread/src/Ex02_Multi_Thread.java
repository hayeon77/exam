//Thread : 프로세스에서 하나의 최소 실행단위(method)

//Thread 생성방법
//1. Thread 클래스를 상속 -> class Test extends Thread {}
//[반드시] run() 함수 재정의 .....
//Thread 일반 클래스 : Thread 스스로 객체 생성 가능

//2. implements Runnable 구현 -> class Test implements Runnable{}
//반드시 run() 구현 (추상자원)
//Test 클래스는 Thread 일까요 ???  >> Thread th = new Thread(new Test());

//why 2가지 제공
//
//class Test extends Car implements Runnable

//Thread 추상클래스로 설계(x) >> Thread 일반 클래스로 ...Runnable 구현하는 Test Thread 로 만들기

class Thread_1 extends Thread{
	@Override
	public void run() { //run 함수가 (main 과 같은 역할)  //새로운  stack 처음 올라가는 함수
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("Thread_1 : " + i + this.getName());
		}
		System.out.println("Thread_1 run() END");
	}
}

class Thread_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("Thread_2 : " + i);
		}
		System.out.println("Thread_2 run() END");	
	}
	
}


public class Ex02_Multi_Thread {
	public static void main(String[] args) { //Thread
		
		//1번
		 Thread_1 th = new Thread_1();
		 th.start(); //POINT >> stack 생성하고 stack run() 올려놓기
		
		 //2번
		 Thread_2 th2 = new Thread_2(); //Thread(x) Runnable 구현
		 Thread thread = new Thread(th2);
		 thread.start();
		 
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("main : " + i);
		}
		 
		System.out.println("Main END");
	}

}
