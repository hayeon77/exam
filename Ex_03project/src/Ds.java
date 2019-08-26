import java.util.Scanner;


public class Ds {
	 public static void main(String[] args) {
		 
		 Department department1=new Department("샤넬", 1);
		 Department department2=new Department("리바이스", 2);
		 Department department3=new Department("아디다스", 3);
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("몇층을 조회하시겠습니까?");
	
			
		 Scanner scan = new Scanner(System.in);
		 System.out.println("층 입력:");
		 int floor = scan.nextInt();
		 String res;
		 switch(floor) {
		 case 1: res =  department1.getBrand() +"매장이 있습니다.";
		 System.out.println(res);break;
		 case 2: res = department2.getBrand() +"매장이 있습니다."; break;
		 case 3: res = department3.getBrand()+ "매장이 있습니다."; break;
		 
		 default: res = "아무 매장도 없습니다.몇 층입니까?";
		 System.out.println(res);
		 
		 }

	 }
}




class Department {
	private String brand;
	private int floor;
	
	public Department(String brand, int floor) {
		this.brand=brand;
		this.floor=floor;
	}
	
	
   
	public String getBrand() {//브랜드 이름을 확인할 수 있다.
		return brand;
	}

	public int getFloor() {//층을 확인할 수 있다.
		return floor;
	}


	public void DsInfor() {
		System.out.println("브랜드 이름:"+brand+"/"+"층 수:"+floor);
	}
}



/*

백화점은 브랜드와 층을 가지고 있다.

백화점이 있으면 브랜드의 층이 존재해야한다.(단 한층에는 한개의 브랜드만 존재한다.)

층을 입력하면 그 층에 위치한 브랜드를 알 수 있다.

 (1층 - 샤넬 / 2층 - 리바이스 / 3층 - 아디다스)

백화점의 이름과 층은 한번에 확인할 수 있다.

층수를 입력하기 전에 사용자에게 몇 층을 입력받을지 질문을 해준다.

만약 없는 층이나 잘못된 값을 입력했을 시 층 수를 다시 물어본다.

*/

