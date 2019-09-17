import javax.swing.JOptionPane;

class WordTime extends Thread{
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("남은 시간:" +i);
			try {
				Thread.sleep(1000); //대기실에서 1초...
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}


public class Ex04_Multi_Thread_Word_Game {

	public static void main(String[] args) {
		WordTime timer = new WordTime();
		timer.start();
		
		String inputdata = JOptionPane.showInputDialog("값을 입력해주세요");
		System.out.println("입력값:"+inputdata);

	}

}
