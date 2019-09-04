//String 클래스
//String str = new String("홍길동");
//8가지 값타입과 동일하게 사용해도 문제없이 설계...
//String str ="홍길동";  변함없이 쓰시면 됩니다.

//1. String 클래스 : 데이터 저장 구조 >> char[] 배열 저장               [0][1][2]
//ex) String ename = "abc"; >> 저장구조 >> char[] 생성 >> [a][b][c]
//2. String str = new String("ABC");
//3. String str2 = "ABC" 차이점 ....
//class String extends Object{
//   클래스 중에서 제일 많은 함수 보유 ... **함수공부(POINT) 암기 **
//   void length(){
//   }
//   @Override
//   String toString() {  재정의 }
//}
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str.length());
		System.out.println(str.toString());
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1);
		System.out.println(str1.toString());
		//String 비교 (equals 비교)
		System.out.println(str1 == str2);
		//== 주소비교 (값이 같은 것이 아니고 주소가 같다)
		System.out.println(str1.equals(str2)); //실제 heap 값을 비교
		//AAA == AAA 비교동일
		
		String str3 = new String("BBB"); //new str3 (xx번지)
		String str4 = new String("BBB"); //new str4 (yy번지)
		System.out.println(str3);
		System.out.println(str4.toString());
		System.out.println(str3 == str4); //false 
		System.out.println(str3.equals(str4));
		
	}

}
