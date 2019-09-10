import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Reader , Writer 작업시 buffer 성능 향상
//Buffer 장점: Line 단위  read , writer
public class Ex06_FileReader_FileWriter_Buffer {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("Lotto.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("로또");
		bw.newLine();
		bw.write("1,45,20,4,3,5");
		bw.newLine();
		bw.flush();
		/*
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			
			String line="";
			for(int i = 0 ; (line = br.readLine()) != null ; i++) {
				//System.out.println(line);
				
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
			}
			
		}catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		*/
	}

}
