import java.io.File;
import java.util.ArrayList;

public class Ex10_File_SubList {
	static int totalfiles=0;
	static int totaldirs=0;
	
	
	public static void main(String[] args) {
		//Ex10_File_SubList.totaldirs
		//totaldirs
		if(args.length != 1) {
			System.out.println("사용법: java [실행파일명] [경로명]");
			System.out.println("예시: java Ex10_File_SubList C:\\Temp");
			System.exit(0); //프로세스 종료
		}
		
		File f = new File(args[0]); //new File("C:\\Temp")
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리");
			System.exit(0);
		}
		//정상적인 경로 ...
		printFileList(f);
		System.out.println("누적 총 파일수 :" + totalfiles);
		System.out.println("누적 총 폴더수 :" + totaldirs);
	}
	 static void printFileList(File dir) {
		 System.out.println("[Full Path :"+ dir.getAbsolutePath()+"]");
		 
		 ArrayList<Integer> subdir = new ArrayList<Integer>();
		 File[] files = dir.listFiles();
		 //C:\IOTemp
		 //[0] a.txt
		 //[1] Data ...
		 for(int i = 0 ; i < files.length ; i++) {
			 String filename = files[i].getName(); //파일명 또는 폴더명
			 if(files[i].isDirectory()) {
				 filename = "<DIR> [" + filename + "]";
				 subdir.add(i); //??
			 }else {
				 filename = filename + " / " + files[i].length() + "Byte";
			 }
			 System.out.println("  " + filename);
		 }
		 //
		 int dirnum = subdir.size(); //폴더개수
		 int filenum =  files.length - dirnum;//파일개수
		 
		 //누적값 :
		 totaldirs += dirnum; //총 누적 폴더 개수
		 totalfiles += filenum; //총 파일 누적 개수
		 
		 System.out.println("[Current dirNum] :" + dirnum);
		 System.out.println("[Currnet fileNum] : " + filenum);
		 System.out.println("********************************");
		 
		 //POINT : Why ....
		 for(int j = 0 ; j < subdir.size() ; j++) {//3
			 int index = subdir.get(j);  //[0]0 , [1]1 , [2]3
			 printFileList(files[index]);
		 }
		 
		 //C:\\IOTemp
		 //A        [0]   //C:\\IOTemp\\A  하위 탐색
		 //B        [1]  
		 //1.txt    [2]  
		 //C        [3] 
		 
	 }

}


