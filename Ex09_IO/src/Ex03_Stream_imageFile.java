import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03_Stream_imageFile {

	public static void main(String[] args) throws Exception {
		String orifile = "C:\\IOTemp\\1.jpg";
		String tagetfile = "copy.jpg"; // App 사용하는 기본 경로(저장)
		//C:\SmartWeb\JAVA\

		FileInputStream fis = new FileInputStream(orifile);
		FileOutputStream fos = new FileOutputStream(tagetfile);

		int data = 0;
		while ((data = fis.read()) != -1) {
			// read데이터 FileOutputStream 사용 write
			fos.write(data);
		}
		fis.close();
		fos.close();
		System.out.println("작업완료");
	}

}
