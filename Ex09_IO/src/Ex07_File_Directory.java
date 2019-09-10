import java.io.File;

/*
I/O 클래스
파일 과 폴더 를 다루는 클래스

Java : File 클래스 (파일,폴더) 
>> a.txt 생성, 수정 , 삭제 , 정보 read
>> Temp  폴더  생성, 삭제 , 정보 read
C# : File , Directory

경로
절대경로 : C:\\  , D:\\   , C:\\Temp\\a.txt
상대경로 : 현재 파일을 중심으로 
*/
public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path="C:\\IOTemp\\file.txt";
		File f = new File(path);
		//f.createNewFile(); 파일 생성 기능
		String filename = f.getName();
		System.out.println("파일명:" + filename);
		
		System.out.println("전체경로:" + f.getPath());
		System.out.println("절대경로:" + f.getAbsolutePath());
		System.out.println("너 폴더니 :" + f.isDirectory());
		System.out.println("너 파일이니:" + f.isFile());
		System.out.println("파일크기:" + f.length() + "byte");
		System.out.println("부모경로:" + f.getParent());
		System.out.println("존재여부(파일,폴더):" + f.exists());
	}

}





