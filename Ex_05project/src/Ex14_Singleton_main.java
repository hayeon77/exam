import kr.or.bit.Singleton;

public class Ex14_Singleton_main {

	public static void main(String[] args) {
		//Singleton single = new Singleton();
		//The constructor Singleton() is not visible
		//Singleton.p;
		
		Singleton single =  Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
		System.out.println(single == single2);
		System.out.println(single2 == single3);
		System.out.println(single3 == single4);
	}
}