import java.util.Properties;

/*
Map 인터페이스를 구현한 클래스
특수한 목적의 클래스<String, String> key Type, value Type
고정시킨 클래스: Properties
사용목적
APP 공통속성정의 (환경변수) : 프로그램의 버전, 파일경로, 공통변수
ex)
datasample.properties 만들어서
DB사용자 ID, PWD담아놓고 불러쓰기
다국어 처리



*/


public class Ex15_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "bit@bit.or.kr");
		prop.setProperty("version", "1.1.1.1");
		prop.setProperty("defaultpath", "C:\\Temp\\images");
		//각각의 개발 페이지에서
		System.out.println(prop.getProperty("master"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("defaultpath"));
		
}
}