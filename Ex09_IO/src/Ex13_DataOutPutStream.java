import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex13_DataOutPutStream {
	public static void main(String[] args) {
		int[] score = { 100, 60, 55, 94, 23 };
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]); // 정수값 write >> read DataInputStream
				// dos.writeUTF(str);
			}
			dos.close();
			fos.close();
		} catch (Exception e) {

		}

	}

}
