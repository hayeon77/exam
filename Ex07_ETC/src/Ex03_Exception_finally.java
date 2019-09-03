import java.io.IOException;

public class Ex03_Exception_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}

	public static void main(String[] args) {
		
		//Ex03_Exception_finally.copyFiles();
		try {
			copyFiles();
			startInstall();
			//throw : 개발자 임의로 문제발생시켜서 예외처리를 하도록 하는 방법
			throw new IOException("Install 중 문제 발생");
		}catch (Exception e) {
			//예외발생
			System.out.println("예외 메시지 출력 :" + e.getMessage());
			
		}finally { //강제적 실행 블럭 ( 예외 발생(0), 예외 발생(x))
			fileDelete();
		}
		
		 System.out.println("Main END");
		
		
		
		/*
		try {
		}
		catch(Exception e){
		   예외가 발생되면 실행 (발생안되면 catch 실행 안되요)
		}finally {
			예외가 발생하던 .... 발생하지 않던  [강제적]으로 [실행되는 구문]
		}
		*/
	}

}
