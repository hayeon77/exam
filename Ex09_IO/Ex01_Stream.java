import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//char[]
//한글 1자 : 2byte >> Stream 빨대 (x) 
//좀 더 큰 빨대 ... (2byte)
//Reader , Writer 추상 클래스
//
public class Ex05_Reader_Writer_kor {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex01.txt"); //파일 생성 기능
			
			int data=0;
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

