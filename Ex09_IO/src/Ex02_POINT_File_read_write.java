import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//대상 : File (read , write) : 물리적인 파일
//FileInputStream , FileoutputStream

//txt 기반 작업 : C:\\IOTemp\\a.txt >> HELLO
public class Ex02_POINT_File_read_write {
	public static void main(String[] args) {
		// POINT : I/O 작업은 대부분 가비지 컬렉터 대상이 아니다
		// 명시적인 자원의 해제 작업을 해야 한다 ( close() >> 내부적으로 소멸자 호출)

		//문제점 : ..자원해제
		/*
		try {
				FileInputStream fs = new FileInputStream("C:\\IOTemp\\a.txt");
				int data = 0;
				while((data = fs.read()) != -1) {
					System.out.println("정수(숫자) : " + data);
					//정수값 아스키코드표에 있는 십진수 값
					char c = (char)data;
					System.out.println(c);
				}
				fs.close(); //나 파일 작업 다 했어  (자원해제)
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//fs 변수의 scope try 블럭 안에 있어요
		}
        */
		
		
		FileInputStream fs=null;
		FileOutputStream fos = null;
		String path = "C:\\IOTemp\\a.txt";
		try {
			fs = new FileInputStream(path); //read
			fos = new FileOutputStream("C:\\IOTemp\\new.txt",false);
			//write
			//FileOutputStream 파일 생성기능을 가지고 있을까 ?
			//파일을 write 할때 파일이 존재하지 [파일을 생성] 합니다 ..>> write
			
			//new FileOutputStream("C:\\IOTemp\\new.txt",true)
			//생성자 두번쨰 인자 : true
			//기존 데이터 : append
			
			
			//new FileOutputStream("C:\\IOTemp\\new.txt",false)
			//생성자 두번쨰 인자 : false (default)
			//기존 데이터 : overwrite
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data); //Write 하는 대상은 new.txt 무었을 data 값을 
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		//fs 변수의 scope try 블럭 안에 있어요
		try {
			fs.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
	}

}
