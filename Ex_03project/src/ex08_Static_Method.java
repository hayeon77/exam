
public class ex08_Static_Method {


		public void method() {
			System.out.println("나 일반함수");
		}
		public static void smethod() {
			System.out.println("나 static함수");
		}
		public static void main(String[] args) {
			System.out.println("나 static main함수야");
			
			ex08_Static_Method.smethod();
			ex08_Static_Method ex= new ex08_Static_Method();
			ex.method();
			ex.smethod();
		
	}

}
