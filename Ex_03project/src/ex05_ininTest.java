
class IniTest {

	static int cv = 1;

	int iv = 1;

	static { // static�ʱ���(�Լ�) : static���� �ʱ�ȭ �������
		cv = 2;
	}
	{
		iv = 3;
	}// instance�ʱ���(�Լ�) : instance ���� �ʱ�ȭ

}

public class ex05_ininTest {
	public static void main(String[] args) {
	}
}
