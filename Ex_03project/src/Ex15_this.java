//this
//1. ��ü �ڽ��� ����Ű�� this (������ ������ ��ü�� �ּҸ� ���� ���̶�� �����ϰ� ���)
//2. this ��ü �ڽ�(�����ڸ� ȣ��) : ��Ģ (�����ڴ� ��ü ������ 1���� ȣ��)
//���������� this ���: �������� �����ڸ� ȣ�� ����
class Test6{
	int i;
	int j;
	//default ������ �����
	Test6(){
		
	}
	//parameter�������ϰ� instance �������� �ٸ��� ���
	//������ �ϴٺ��� (�ǹ��ִ� ������) >> ������ >> ��������...���ϴ���
	//������ ���� ���� ���ٺ���...
	//int i; ������ ������ ��ü�� memberfield�� �ƴϳ�.. �̸� ������ ����..
	//this Ű����>> Test6 t = new Test6();

	Test6(int i, int j){
		this.i=i;
		this.j=j;
		i=i; //
		j=j;
		
	}
}


/////////////////////////////
class soCar{
	String color;
	String gearType;
	int door;
	
	soCar(){
		this.color="red";
		this.gearType="auto";
        this.door=2;     
	}
	soCar(String color, String gearType, int door){
		this.color = color;
		this.gearType=gearType;
		this.door=door;
	}
	void print() {
		System.out.println(this.color+"/"+this.gearType+"/"+this.door);
	}
}

public class Ex15_this {

	public static void main(String[] args) {
	Test6 t6 = new Test6();
	Test6 t7 = new Test6(100, 200);
	System.out.println(t7.i+"/"+t7.j);
	
    soCar socar = new soCar();
    socar.print();
    
    soCar socar2 = new soCar("blue", "auto", 4);
	socar2.print();
	
	}

}
