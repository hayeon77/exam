
public class ex08_Static_Method {


		public void method() {
			System.out.println("�� �Ϲ��Լ�");
		}
		public static void smethod() {
			System.out.println("�� static�Լ�");
		}
		public static void main(String[] args) {
			System.out.println("�� static main�Լ���");
			
			ex08_Static_Method.smethod();
			ex08_Static_Method ex= new ex08_Static_Method();
			ex.method();
			ex.smethod();
		
	}

}
