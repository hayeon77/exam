import java.io.File;

public class Ex08_File_Directory {
	public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		
		if(args.length != 1) {
			System.out.println("사용법: java 파일명 [디렉토리명]");
			System.exit(0); //프로세스 강제 종료
		}
		
		File f = new File(args[0]);
		//java Ex08...  C:\\Temp
		//존재하지 않거나 or 디렉토리가 아니라면
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 경로");
			System.exit(0); //프로세스 강제 종료
		}
		
		//실제 존재하는 경우
	   File[] files =f.listFiles();
	   //C:\\Temp\\a.txt
	   //C:\\Temp\\b.txt
	   //C:\\Temp\\참새
	   //File[] arryfiles = {new File("C:\\Temp\\a.txt"), new File("C:\\Temp\\b.txt")}
	   for(int i = 0 ; i <files.length ; i++) {
		   String name = files[i].getName(); //파일명 , 폴더명
		   System.out.println(files[i].isDirectory() ? "[DIR]"+name:name);
	   }
	}

}
