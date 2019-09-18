import javax.swing.JOptionPane;

/*
문제
main 함수 제외한 Thread 2개 생성
1. 시간(time) 제어하는 Thread
2. 단어 입력을 처리하는 Thread

main 함수 2개 실행

단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
hint) 공유자원 (static)

Thread 상태정보

join() : 다른 스레드의 종료를 기다림

계산 작업을 하는 스레드가 모든 계산 작업을 마쳤을때 ... 그 결과값을 처리해야 하는 경우





*/
class WordInputProcess extends Thread{
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog("dan" + "단 값을 입력");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WordGame.inputcheck = true; //값을 변경
		}
		System.out.println("입력한 값은: " + inputdata);
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			
			if(Ex05_WordGame.inputcheck)return; //run함수 탈출
			
			System.out.println("남은 시간: " + i);
			try {
				 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	static boolean inputcheck= false;
	public static void main(String[] args) {
		
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
			
		word.start();
		time.start();
		
		try {
			
			word.join(); //main  Thread 에게 내가 끝날때까지 기다려 달라고 ....
			time.join(); //main  Thread 에게 내가 끝날때까지 기다려 달라고 ....
		    //join : 메소드는 하나의 스레드가 다른 스레드가 하는 일이 완료될때까지 기다리게 ...
			//word  , time  가 하는 일이 마칠때까지 멈추게 한다(pause)
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Main END .....");
	}

}
