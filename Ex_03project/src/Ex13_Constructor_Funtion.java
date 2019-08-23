/*
������ �Լ�(constructor)
1. �Լ�(Ư���� ������ �Լ�)
2. Ư���� ����(member field �ʱ�ȭ)

 Tip) static >> static{}, �Ϲݺ��� >> {}
 
3. �Ϲ��Լ��� �ٸ���
3.1 �Լ��� �̸� ���� (class �̸� ����)
3.2 ������� ������ : return Type(0), void(x) > default void ����
3.3 ������� ��ü������ ȣ��Ǵ� �Լ� 

4. ���� : �����Ǵ� ��ü���� �ٸ� �ʱⰪ �ο��ϱ�
class Car {int door=5;}

5. ������ �Լ��� �����ε��� �����ϴ�


*************�������� �ǵ�
*���������� overloading�� ������ �Լ��� �ϳ��� �����Ѵٸ� �����Ϸ��� �ڵ����� default������ �Լ��� ������ �ʴ´�.
*����, default������ �Լ��� ����ϰ� �ʹٸ� ���� �����ϼ���
why? �������� ������ �ǵ��� ����ִ� ��
�Ϲ��Լ����� �ڵ差�� ����.....
 */
class Car {
	String name;
//Car(){} ������� ������ Compile���� Car(){}�ִٰ� �����ϰ� �����մϴ�.
}

class Car2 {
	String carname;

	Car2() { // default constructor (������)
		System.out.println("�� ������ �Լ���^^");
		carname = "pony"; // member field �ʱ�ȭ ����
	}
}

class Car3 {
	int number;

	Car3() {
		System.out.println("member field�� �ʱ�ȭ");
		//number=10;
	}
}

//////////////////////
class Car4{
	int door;
	int wheel;
	
	Car4(){//default
		System.out.println("default");
		
	}
	//�����ε��� ����
	Car4(int num){ //overloading (����)
		door=num;
		System.out.println("overloading door"+door);
	}
	
	//�����ε� ����
	Car4(int num, int num2){
		door=num;
		wheel=num2;
		System.out.println("overloading wheel"+wheel);
	}
}



class House2{
	String doorcolor;
	
	House2(){ //�����ض�
		doorcolor = "yellow";
	}
	House2(String color){
		doorcolor = color;
	}
	}



public class Ex13_Constructor_Funtion {
	public static void main(String[] args) {
		Car c = new Car(); // Car() �Լ��� ȣ��
		Car2 c2 = new Car2();
		Car2 c22 = new Car2();
		
		Car4 car4 = new Car4(10, 50);

		House h = new House();
		
		House h2 = new House();
		
		House2 h3 = new House2();
		System.out.println(h3.doorcolor);

		House2 h4 = new House2("red");
		System.out.println(h4.doorcolor);
	}

}
