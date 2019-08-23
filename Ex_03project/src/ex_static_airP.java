import kr.or.bit.Airplane;

public class ex_static_airP {

	public static void main(String[] args) {

//		Airplane a= new Airplane();
//		a.number =1;
//		a.name="hayeon";
//		a.AirplaneInfor();
//		a.count++;
//		
//		Airplane a2 = new Airplane();
//		a2.number =2;
//		a2.name="dayeon";
//		a2.AirplaneInfor();
//		a2.count++;
//		
//		Airplane a3 = new Airplane();
//		a3.number =3;
//		a3.name="miyeon";
//		a3.AirplaneInfor();
//		a3.count++; // or a3.count++
//	
//		System.out.println(Airplane.count);

		Airplane a1 = new Airplane(25, "하연이");
		a1.airInfor();
		a1.printCount();
	
		Airplane a2 = new Airplane(21, "수영이");
		a2.airInfor();
		a2.printCount();

	}
}


//class Car4 {
//	int door;
//	int wheel;
//
//	Car4() {// default
//		System.out.println("default");
//
//	}
//
//	// 오버로딩이 가능
//	Car4(int num) { // overloading (가능)
//		door = num;
//		System.out.println("overloading door" + door);
//	}
//
//	// 오버로딩 가능
//	Car4(int num, int num2) {
//		door = num;
//		wheel = num2;
//		System.out.println("overloading wheel" + wheel);
//위 코드를 생성자를 사용하여 변경하세요

//class ex_static_airP {
////String hayeon;
////String dayeon;
////String miyeon;
//
//ex_static_airP(int str){
//	String name;
//	int number;
//	static int count;
//	
//	
//ex_static_airP(String name, int number){
//	number=num;
//	name=name;
//	count++;
//	
//	System.out.println("name"+name+"num"+num);
//	
//	
//	
//	
//	
//}
//
//		System.out.println("hayeon");
//	}
//}
//ex_static_airP(int str, int str2){
//	dayeon=str;
//	miyeon=str2;
//	System.out.println("dayeon");
//}
//		Airplane a= new Airplane();
//		a.number =1;
//		a.name="hayeon";
//		a.AirplaneInfor();
//		a.count++;
//		
//		Airplane a2 = new Airplane();
//		a2.number =2;
//		a2.name="dayeon";
//		a2.AirplaneInfor();
//		a2.count++;
//		
//		Airplane a3 = new Airplane();
//		a3.number =3;
//		a3.name="miyeon";
//		a3.AirplaneInfor();
//		a3.count++; // or a3.count++
//	
//		System.out.println(Airplane.count);
//}
//}