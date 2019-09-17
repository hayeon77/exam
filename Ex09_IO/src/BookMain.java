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

		 BookManager bm = new BookManager();

		 bm.Run();
/*
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
*/
	}
}
