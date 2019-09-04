import java.util.StringTokenizer;

//String 클래스(문자열 )
//개발단에 문자열 다루는 코드 .....(String  함수)
//String static 함수  + 일반함수 (public)

//중요(암기)...10개 ...
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str = ""; // 문자열의 초기화

		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr) {
			System.out.println(s);
		}
		// 함수
		String ss = "hello";
		String concatstr = ss.concat(" world");
		System.out.println(concatstr);

		boolean bo = ss.contains("el");
		System.out.println(bo);
		bo = ss.contentEquals("heo");
		System.out.println(bo);

		String ss2 = "a b c d";// heap [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length());

		String filename = "hello java, world";
		System.out.println(filename.indexOf("e"));// index 배열방의 첨자
		System.out.println(filename.indexOf("jeva"));// index 배열방의 첨자
		// -1 return (원하는 값이 없다 배열안에 ...) ...
		// indexOf 함수의 활용은 내가원하는 단어가 문장에 포함 되어 있는지 여부 확인
		// 0보다 큰 값을 리턴하면 문자에 원하는 단어가 있음
		if (filename.indexOf("world") != -1) {
			System.out.println("world 라는 문자가 포함 되어 있습니다");
		}
		System.out.println(filename.lastIndexOf("a"));

		// length() , indexOf() , substring() , replace() , Split() ,,
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(2));
		System.out.println(result.substring(0, 0)); // return endIndex - 1
		System.out.println(result.substring(0, 1)); // (0,0) 자기자신
		System.out.println(result.substring(1, 1));
		System.out.println(result.substring(2, 3));
		/*
		 * Returns a string that is a substring of this string. The substring begins at
		 * the specified beginIndex and extends to the character at index endIndex - 1.
		 * Thus the length of the substring is endIndex-beginIndex.
		 */

		// Quiz
		String filename2 = "1.txt"; // hong.png , 1.txt
		// 여기서 파일명과 확장명을 분리해서 출력하세요
		// 파일명 : bread ,1
		// 확장명 : jpg ,txt
		// 단 위에서 배운 함수만 사용하세요
		// indexOf , length , substring
		// .을 기준으로
		int position = filename2.indexOf(".");
		String file = filename2.substring(0, position); // position - 1
		String extention = filename2.substring(position + 1, filename2.length());
		String extention2 = filename2.substring(++position);

		System.out.println("파일명 : " + file);
		System.out.println("확장자 : " + extention);
		System.out.println("확장자 : " + extention2);

		// replace (치환함수)
		String s4 = "ABCDADDDA";
		String result4 = s4.replace("A", "안녕");
		System.out.println(result4);

		// ETC ...charAt()
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(3));
		System.out.println(s4.endsWith("DDA")); // true
		System.out.println(s4.endsWith("DDD")); // false
		System.out.println(s4.equalsIgnoreCase("abCDADDDa"));// 대소문자 구별없이 비교

		// POINT : split
		String s6 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearray = s6.split(",");
		for (String s : namearray) {
			System.out.println(s);
		}

		String filename3 = "bit.hwp";
		// \t \n
		String[] filearray = filename3.split("\\."); // \. 정규표현 \\. 자바에서 정규 인식
		System.out.println(filearray.length);
		for (String s : filearray) {
			System.out.println(s);
		}
		// 정규표현식 ... (JAVA , JavaScript , DB 다 사용)
		// 특수한 문자로 패턴 설계 >> 설계한 형식으로 >> 유효성 검증
		// 주민번호 , 전화번호 , 핸드폰 , 차량번호 , 우편번호

		// 010-{\d4}-0000 정규표현
		// 010-456-0000 >> false
		// 010-4567-0000

		// 추후 카페 (정규표현식 5개 만들어 오세요)
		// 다음주 ....

		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7, "/,.-");
		while (sto.hasMoreTokens()) {                                                                                                            
			System.out.println(sto.nextToken());
		}

		// 넌센스 quiz
		String s8 = "홍           길        동";
		// 저장 > "홍길동" 공백제거
		System.out.println(s8.replace(" ", ""));

		String s9 = "      홍길동           ";
		System.out.println(">" + s9 + "<");
		System.out.println(">" + s9.trim() + "<");

		String s10 = "    홍      길      동       ";
		// "홍길동" 출력

		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2); // 무식해요 ....

		// 여러개의 함수를 연결해서 (chain)
		// method chain 기법 **************************
		System.out.println(s10.trim().replace(" ", ""));

		// Quiz-1
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// 문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
		for (String s : numarr) {
			sum += Integer.parseInt(s);
		}
		System.out.println("sum : " + sum);

		// Quiz-2
		String jumin = "123456-1234567";
		// 위 주민번호의 합을 구하세요
		int sum2 = 0;
		for (int i = 0; i < jumin.length(); i++) {
			String numstr = jumin.substring(i, i + 1);
			if (numstr.equals("-"))
				continue;
			sum2 += Integer.parseInt(numstr);
		}
		System.out.println("주민번호 합:" + sum2);

		// 위 주민번호의 합을 구하세요
		String[] numarr2 = jumin.replace("-", "").split("");
		int sum3 = 0;
		for (String i : numarr2) {
			sum3 += Integer.parseInt(i);
		}
		System.out.println("주민번호 합2:" + sum3);

		// 위 주민번호의 합을 구하세요
		String jumin4 = jumin.replace("-", "");
		int sum4 = 0;
		for (int i = 0; i < jumin4.length(); i++) {
			sum4 += Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		}
		System.out.println("주민번호 합4:" + sum4);

		// String 클래스 (static)
		// printf (cmd모드)
		// String >> format함수
		String str5 = String.format("%d-%s", 100, "문자열");
		System.out.println(str5);
		
		
	}

}
