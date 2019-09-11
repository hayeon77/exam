import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.bit.UserInfo;

//UserData.txt  
//객체가  write ...분해되어서 ....

//UserData.txt 객체를 read ....UserInfo 객체 생성

public class Ex16_ObjectDataInputStream {
	public static void main(String[] args) {
		 String filename="UserData.txt";
		 
		 FileInputStream fis = null;
		 BufferedInputStream bis = null;
		 ObjectInputStream in = null;
		 
		 try {
			 fis = new FileInputStream(filename);
			 bis = new BufferedInputStream(fis);
			 in = new ObjectInputStream(bis);
			 
			 //UserInfo r1 =  (UserInfo)in.readObject(); //역직렬화 (복원)
			// UserInfo r2 = (UserInfo)in.readObject(); //역직렬화 (복원)
			 
			// System.out.println(r1.toString());
			// System.out.println(r2.toString());
			 Object users = null;
			 while((users = in.readObject()) != null) { //역직렬화
				 System.out.println(users.toString());
			 }
		 }catch(Exception e) {
			 
		 }finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
                      