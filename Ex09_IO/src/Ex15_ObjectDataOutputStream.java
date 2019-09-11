import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import kr.or.bit.UserInfo;

//객체를 파일에 write
public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filename, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// 객체 직렬화
			ObjectOutputStream out = new ObjectOutputStream(bos);

			UserInfo u1 = new UserInfo("superman", "super", 500);
			UserInfo u2 = new UserInfo("scott", "tiger", 50);

			// 직렬화
			out.writeObject(u1); // 분해해서 줄을 세워서 파일에 write
			out.writeObject(u2);

			out.close();
			bos.close();
			fos.close();
			System.out.println("파일 생성-> buffer-> 직렬화-> write");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
