/*
��ü������
1. ��� (���뼺)
2. ĸ��ȭ(private) -> �Լ�(read, write): �����Ҵ�(�ڿ���ȣ) -> ĸ��ȭ�� member field
   read(get) write(set) �����Լ�--> setter, getter-> ��� getEmpno, setEmpno
3. ������ 
[������ �ϴ� �༮ �� �κ�....]

[method overloading]
�ϳ��� �̸����� �������� ����� �ϴ� �Լ�
���: System.out.println()
Ư¡: �����ε��� ���� ��� ������ �ش�(x)
     why> �׳� ������ ����. >>�Լ��� Ȱ���� ���� ���(�پ��� �Ķ���� ���)
     static�Լ�>>
����: �Լ��� �̸��� ���� parameter�� ������ Ÿ���� �޸��ϴ� ���
1. �Լ��� �̸��� ���ƾ� �Ѵ�.
2. [parameter]���� �Ǵ� [Type]�� �޶�� �Ѵ�.
3. return type overloading �Ǵ� ����(x)
4. parameter ������ �ٸ��� �����Ѵ�
     
 

 */

class Human{ //���赵==Ÿ�� ����� > new ���� ��ü ����
	String name;
	int age;
	
}


class OverTest{
	void add(Human h) { //������ ������ Ÿ���� �ٸ��� ������ �����ε�
	h.name="ȫ�浿";	                //Human ��ü�� �ּҰ��� ���� �� �ִ�>>h
	h.age=100;
	System.out.println("h�� �ּҰ�:"+h);
	}

	int add1 (int i) {
		return 100+i;
	}
	String add(String s) {
		return "hello"+s;
	}
	
	int add(int i, int j) {
		return i+j;
	}
	
	void add(int i, String s) {
		System.out.println("�����ε�"+i+"/"+s);
	}
	void add(String s, int i) {//������ �ٸ��� �����մϴ�
		System.out.println("parameter ������ �ٸ��� ����");
	}
	/* �浹
	  
	 */
    int add(int s) {
    	return 200+s;
    }
}
public class Ex11_Method_overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		ot.add1(100);
		String str= ot.add("ȫ�浿");
		System.out.println(str);
	
		//1.
	   Human m =new Human(); //m�� human
	   System.out.println("m�� �ּҰ�:"+m);
	   ot.add(m);
	   //2.
	   ot.add(new Human());//heap�� ������ �ּ� �ٷ� ����
	   
	}
}

