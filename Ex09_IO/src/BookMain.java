import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

//ISBN을 키로 도서 검색(HashMap 클래스 이용)

public class BookMain {

	public static void main(String[] args) {

		// BookManager bm = new BookManager();

		// bm.Run();

		// 파일저장
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("src\\BookMain.java");
			fw = new FileWriter("copy_BookMain.txt"); // 파일 생성 기능

			int data = 0;
			while ((data = fr.read()) != -1) {
				// fw.write(data);
				if (data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
				}
			}

		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		//문자열을 파일에 저장
		File file = new File("C:\\test\\test.txt");
		FileWriter fw1 = null;
		try {
			fw1 = new FileWriter(file, true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fw1.write("FileWriter는 한글로된"+"\r\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				try {
					fw.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("파일에 저장되었습니다.");
		
// 파일 읽기

		try {
			FileInputStream fis = new FileInputStream("src\\BookMain.java");

			int data;

			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
