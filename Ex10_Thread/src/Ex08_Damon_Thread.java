//데몬 Thread(보조)
//Damon ...
//한글 작업시 3초 작업내용 저장..
//한글 작업 종료.. 3초 간격 저장 같이 END

public class Ex08_Damon_Thread implements Runnable{
	static boolean autosave = false;

	public static void main(String[] args) {
		Thread th = new Thread(new Ex08_Damon_Thread());
		th.setDaemon(true); //th라는 스레드는 main 스레드의 보조(Damon)
		                   //main 하나의 스레드 (non-damon)
		                   //** th 보조스레드는 main [운명을 같이 한다]
		
		for(int i=0; i<=30; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Main Thread 동작:"+i);
			if(i==5) { //i가 5가 되는 시점부터
				System.out.println("i:"+i);
				autosave=true;
				
				
			}
		}

	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); //3초 간견ㄱ
				
			}catch(Exception e) {
				
			}
			if(autosave) { //true이면
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("문서가 3초 간격으로 자동저장 되었습니다");
		
	}

}
