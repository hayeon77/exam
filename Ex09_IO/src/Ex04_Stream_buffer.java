import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//File 에 (DISK) (read , write) ...
//한 Byte 씩 read , write .....
//한 번에 모아서 read , write .....
//모으는 작업을 buffer
//File 을 read ,write 중간에 buffer (I/O)

//1. I/O성능개선
//2. Line 단위

//I/O 보조 스트림
//BufferedInputStream
//BufferedOutputStream
//보조일까 의존 .... InputStream 상속해서 구현하는 객체에 ...
public class Ex04_Stream_buffer {
	public static void main(String[] args) {
	  FileOutputStream fos = null;
	  BufferedOutputStream bos = null;
	  try {
		  fos = new FileOutputStream("data.txt"); //파일생성 기능
		  bos = new BufferedOutputStream(fos);
		  
		  for(int i = 0 ; i < 10 ; i++) {
			  bos.write('A');
		  }
		  /*
		   Java buffer 크기 : 8kbyte => 8192byte >> WEB..수업
		   1. buffer 안에 내용이 8K 채우면 자동으로 비운다
		   2. buffer 강제로 비우기 : flush() 함수 강제 호출
		   3. bos.close() 
		   
		   */
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }finally {
		try {
		//	bos.close();
		//	fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	  }

	}

}
