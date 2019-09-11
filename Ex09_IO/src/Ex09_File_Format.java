import java.io.File;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {
	public static void main(String[] args) {
		// Foramt 클래스 (https://cafe.naver.com/bitsmartweb/352)

		// 화폐단위처리

		/*
		 * DecimalFormat df = new DecimalFormat("#,###.0"); String result =
		 * df.format(1234567.89); String result2 = df.format(1000000000);
		 * System.out.println(result); System.out.println(result2); //결과는 문자열 데이터
		 * 
		 * //날짜형식처리 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); String
		 * strDate = sdf.format(new Date()); System.out.println(strDate);
		 * 
		 * //문자형식처리 //Web 에서 ..... String userid="kglim"; String message =
		 * "회원 Id :{0} \n회원 이름 : {1} \n회원 전화번호 : {2}"; String result3 =
		 * MessageFormat.format(message,userid, "홍길동", "010-1111");
		 * System.out.println(result3);
		 */
		File dir = new File("C:\\IOTemp");
		File[] files = dir.listFiles(); // IOTemp 폴더 아래 있는 파일과 폴더 목록을 관리하겠다

		// for(File files : files){}
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName();
			// System.out.println(name);
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute = "";
			String size = "";
			if (files[i].isDirectory()) {
				attribute = "<DIR>";
			} else { // a.txt, b.txt, 1.jpg, h.hwp...
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";

			}
			System.out.printf("%s %3s        %10s      %s      \n",
					dt.format(new Date(file.lastModified())),
					attribute,
					size,
					name);
			

		}
	}

}
