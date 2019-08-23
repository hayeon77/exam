
class IniTest {

	static int cv = 1;

	int iv = 1;

	static { // static초기자(함수) : static변수 초기화 실행사항
		cv = 2;
	}
	{
		iv = 3;
	}// instance초기자(함수) : instance 변수 초기화

}

public class ex05_ininTest {
	public static void main(String[] args) {
	}
}
