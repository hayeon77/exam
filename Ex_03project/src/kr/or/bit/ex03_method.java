package kr.or.bit;





/*
 �Լ�(method): ���, ������ �ּ� ����
 ex) �Դ�, �ȴ´�, �ܴ�...
 
 Ŭ������ �������: �ʵ�+������+�Լ�
 
 ex)���ӹ� : ���ӱ�(�����ִ�) 1��
    �����̱�(�����ְ�...������ ��ȯ) 3��
 
  �Լ�������(4����)
  1. void, parameter(0) : void print(String str) {�����ڵ�}
  2. void, parameter(x) : void print() {�����ڵ�}
  3. return Type, parameter(0) : int print(int data) {return 100}
  4. return Type, parameter(x) : int print() {return 200}
  
  *void (�����ִ� ���� ����) : return value�� ����~
  *return Type : {[8���� �⺻ Ÿ��] + String + ����(��ü�� �ּ�)} + Array + Collection + Interface
  **return Type ������ �ݵ�� {���ȿ��� return Ű���� �����ؾ� �Ѵ�}
  *parameter(����, �μ�) : ��������(100��¥��, 1000��¥�� ����), �������� ������
  
  �Լ��� �ݵ�� ȣ��(Call)�Ǿ�߸� ����ȴ� : ���������� �̸��� �ҷ��־�����......
  
 */
public class ex03_method {
//    public int data;
//    
//    public void m() { //�Լ��� �̸��̳� ������ �̸��� �ǹ��ִ� �ܾ��� ����
//	System.out.println("�Ϲ��Լ�:void, parameter(x)");
//		
//	}
//    
//    
//    public void m2(int i) {
//    	System.out.println("parameter value (scope �Լ�����:" +i);
//    	System.out.println("�Ϲ��Լ�:void, parameter(0)");
//    }
//    
//    public int m3() {
//    	return 100; 
//    }
//    
//    public int m4(int data) {
//    return data +1;    
//    }
//    
//    //Ȯ��(parameter ������ ��ȭ)
//    public int sum(int i, int j, int k) {
//		return k;
//    	
//    }
	
	public static void main(String[] args) {
		Clothes c= new Clothes("", "", 1);
		c.sale();
	}
}
