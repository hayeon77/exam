//static�Լ��� ���� ����Ѵٸ� new���� �ʰ� ���ϰ� ����� ���� ����~!!!!!!!!!

class StaticClass{
int iv;

static int cv;

void m() { //�Ϲ��Լ�
	 //1. iv ���� ó���� �� �ִ�. 
	iv=100;
	 //2. cv ���� ó���� �� �ִ�. �̰� ��������
	//static �ڿ��� �Ϲ��ڿ����� ���� memory�� �ö󰣴�.
	StaticClass.cv=1000;//cv=1000;
}

static void sm() { //static �Լ�
	//1. iv���� ó���� �� ����.!!!!!!!! �ֳ��ϸ�, ���������� ���� ������. static�ڿ��� �Ϲ��ڿ����� �׻� �޸𸮿� ���� ��������� ����.
	//static�� static���� ��ƶ�^^ �׷��� ������ ���� �ž�~!
	//�Լ� ���忡�� ���� iv�� �޸𸮿� �����
	
	//2. cv���� ó���� �� �ִ�.
	StaticClass.cv=2000;
}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		System.out.println(StaticClass.cv); //0
		
		StaticClass.sm();
		System.out.println(StaticClass.cv); //2000
		
		StaticClass sc = new StaticClass(); 
		sc.m();
		System.out.println(StaticClass.cv); //1000
	
		

	}

}
